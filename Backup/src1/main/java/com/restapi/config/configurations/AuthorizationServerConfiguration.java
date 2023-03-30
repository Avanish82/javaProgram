 
import com.icicihfc.services.commons.applicationproperties.contsants.ApplicationPropertyIdentifiers;
import com.icicihfc.services.commons.applicationproperties.services.ApplicationPropertiesService;
import com.icicihfc.services.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * @author rajatjain on 15/01/20.
 * @project oauth2boiler
 */
@EnableAuthorizationServer
@Configuration
public class AuthorizationServerConfiguration implements AuthorizationServerConfigurer {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AuthenticationManager authenticationManager;

    private String clientId;

    private String clientSecret;

    private int accessTokenExpirationTime;

    private int refreshTokenExpirationTime;

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    @Qualifier("jdbcTokenStore")
    TokenStore jdbcTokenStore(){
        return new JdbcTokenStore(dataSource);
    }

    private ApplicationPropertiesService applicationPropertiesService;

    @Autowired
    public void setApplicationPropertiesService(ApplicationPropertiesService applicationPropertiesService) {
        this.applicationPropertiesService = applicationPropertiesService;
    }

    @PostConstruct
    private void postConstruct(){
        clientId = applicationPropertiesService.getByIdentifier(ApplicationPropertyIdentifiers.OAUTH2_CLIENT_ID).getValue();
        clientSecret = applicationPropertiesService.getByIdentifier(ApplicationPropertyIdentifiers.OAUTH2_CLIENT_SECRET).getValue();
        accessTokenExpirationTime = CommonUtils.parseStringToInteger(
                applicationPropertiesService.getByIdentifier(ApplicationPropertyIdentifiers.ACCESS_TOKEN_EXPIRATION_TIME).getValue());
        refreshTokenExpirationTime = CommonUtils.parseStringToInteger(
                applicationPropertiesService.getByIdentifier(ApplicationPropertyIdentifiers.REFRESH_TOKEN_EXPIRATION_TIME).getValue());
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.checkTokenAccess("isAuthenticated()").tokenKeyAccess("permitAll()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient(clientId)
                .secret(passwordEncoder.encode(clientSecret))
                .authorizedGrantTypes("password","refresh_token")
                .scopes("user_info")
                .accessTokenValiditySeconds(accessTokenExpirationTime)
                .refreshTokenValiditySeconds(refreshTokenExpirationTime);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(jdbcTokenStore());
        endpoints.authenticationManager(authenticationManager);
        endpoints.userDetailsService(userDetailsService);
    }

    @Bean
    @Primary
    public DefaultTokenServices tokenServices() {
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setTokenStore(jdbcTokenStore());
        return tokenServices;
    }

}
