package com.icicihfc.services.security.services;

import com.icicihfc.services.security.models.OAuthUser;
import com.icicihfc.services.utils.ResponseObj;

import java.io.IOException;

/**
 * @author rajatjain on 26/08/20.
 * @project hfcservices
 */
public interface OAuthLoginService {

    ResponseObj loginOAuthUser(OAuthUser oAuthUser, String password) throws IOException;

    ResponseObj generateAccessToken(OAuthUser oAuthUser, String password) throws IOException;
}
