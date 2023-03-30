package com.icicihfc.services.security.services;

import com.icicihfc.services.security.models.OAuthUser;

/**
 * @author rajatjain on 06/07/20.
 * @project hfcservices
 */
public interface PreviousPasswordService {

    void storePreviousPassword(OAuthUser oAuthUser);

    boolean isNewPasswordValid(OAuthUser oAuthUser, String newPassword);

}
