package com.icicihfc.services.security.services;

import com.icicihfc.services.security.dtos.OAuthTokenUserResponse;
import com.icicihfc.services.security.models.OAuthUser;

import java.io.IOException;
import java.util.List;

/**
 * @author rajatjain on 11/06/20.
 * @project hfcservices
 */
public interface OAuthTokenServices {

    void revokeTokens(List<? extends OAuthUser> userList);

    void revokeToken(OAuthUser oAuthUser);

    void revokeToken(String accessToken);

    OAuthTokenUserResponse generateAccessToken(String userName, String password) throws IOException;


    OAuthTokenUserResponse refreshAccessToken(String refreshToken, String userName, String password) throws IOException;
}
