package com.icicihfc.services.security.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icicihfc.services.commons.applicationproperties.contsants.ApplicationPropertyIdentifiers;
import com.icicihfc.services.commons.applicationproperties.services.ApplicationPropertiesService;
import com.icicihfc.services.security.dtos.OAuthTokenUserResponse;
import com.icicihfc.services.security.models.OAuthUser;
import com.icicihfc.services.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author rajatjain on 11/06/20.
 * @project hfcservices
 */
@Slf4j
@Service
public class OAuthTokenServicesImpl implements OAuthTokenServices {

    public static final String PASSWORD_KEY = "password";

    public static final String USERNAME_KEY = "username";

    public static final String GRANT_KEY = "grant_type";

    public static final String SCOPE_KEY = "read write";

    public static final String CLIENT_ID_KEY = "client_id";

    public static final String CLIENT_SECRET = "client_secret";

    public static final String AUTH_HEADER = "Authorization";

    private static final String REFRESH_TOKEN_KEY = "refresh_token";

    @Autowired
    @Qualifier("jdbcTokenStore")
    private TokenStore tokenStore;

    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    private String clientId;

    private String clientSecret;

    private String host;

    private static final ObjectMapper mapper = new ObjectMapper();

    private ApplicationPropertiesService applicationPropertiesService;

    @Autowired
    public void setApplicationPropertiesService(ApplicationPropertiesService applicationPropertiesService) {
        this.applicationPropertiesService = applicationPropertiesService;
    }

    @PostConstruct
    private void postConstruct(){
        clientId = applicationPropertiesService.getByIdentifier(ApplicationPropertyIdentifiers.OAUTH2_CLIENT_ID).getValue();
        clientSecret = applicationPropertiesService.getByIdentifier(ApplicationPropertyIdentifiers.OAUTH2_CLIENT_SECRET).getValue();
        host = applicationPropertiesService.getByIdentifier(ApplicationPropertyIdentifiers.OAUTH_2_LOCALHOST).getValue();
    }

    @Override
    public void revokeTokens(List<? extends OAuthUser> userList) {
        for (OAuthUser oAuthUser : userList) {
            revokeToken(oAuthUser);
        }
    }

    @Override
    public void revokeToken(OAuthUser oAuthUser) {
        try {
            Collection<OAuth2AccessToken> tokens = tokenStore.findTokensByClientIdAndUserName(
                    clientId, oAuthUser.getIdentifier());
            for (OAuth2AccessToken token : tokens) {
                consumerTokenServices.revokeToken(token.getValue());
            }
        } catch (Exception e) {
            log.error(getClass().getName(), e);
        }
    }

    @Override
    public void revokeToken(String accessToken) {
        consumerTokenServices.revokeToken(accessToken.split(" ")[1]);
    }

    @Override
    public OAuthTokenUserResponse generateAccessToken(String userName, String password) throws IOException {
        log.info(USERNAME_KEY + " " + userName);
        log.info(PASSWORD_KEY + " " + password);
        HttpClient client = HttpClientBuilder.create().build();
        String url = host + "/oauth/token";
        HttpPost post = new HttpPost(url);
        log.info("URL ->" + url);
        String encode = clientId + ":" + clientSecret;
        List<NameValuePair> urlParameters = new ArrayList<>();
        post.setHeader(AUTH_HEADER, "Basic " + CommonUtils.getBase64DEncodedString(encode));
        if (null != password) {
            urlParameters.add(new BasicNameValuePair(PASSWORD_KEY, password));
        }
        urlParameters.add(new BasicNameValuePair(USERNAME_KEY, userName));
        urlParameters.add(new BasicNameValuePair(GRANT_KEY, PASSWORD_KEY));
        urlParameters.add(new BasicNameValuePair(SCOPE_KEY, "user_info"));
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        HttpResponse response = client.execute(post);
        String jsonResponse = CommonUtils.getResponse(response).toString();
        log.info("Response from auth server for user : " + userName + " is : " + jsonResponse);
        return mapper.readValue(jsonResponse, OAuthTokenUserResponse.class);
    }

    @Override
    public OAuthTokenUserResponse refreshAccessToken(String refreshToken, String userName, String password) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        String url = host + "/oauth/token";
        HttpPost post = new HttpPost(url);
        String encode = clientId + ":" + clientSecret;
        List<NameValuePair> urlParameters = new ArrayList<>();
        post.setHeader(AUTH_HEADER, "Basic " + CommonUtils.getBase64DEncodedString(encode));
        urlParameters.add(new BasicNameValuePair(GRANT_KEY, REFRESH_TOKEN_KEY));
        urlParameters.add(new BasicNameValuePair(REFRESH_TOKEN_KEY, refreshToken));
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        HttpResponse response = client.execute(post);
        StringBuilder responseString = CommonUtils.getResponse(response);
        log.info("Response from auth server refresh token : user : " + userName + " is : " + responseString.toString());
        return mapper.readValue(responseString.toString(), OAuthTokenUserResponse.class);
    }
}
