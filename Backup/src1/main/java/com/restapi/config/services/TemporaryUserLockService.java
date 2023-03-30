package com.icicihfc.services.security.services;

import com.icicihfc.services.security.models.OAuthUser;

/**
 * @author rajatjain on 13/06/20.
 * @project hfcservices
 */
public interface TemporaryUserLockService {

    boolean checkAndIncrementLockCount(OAuthUser oAuthUser);

    boolean isLocked(OAuthUser oAuthUser);
}
