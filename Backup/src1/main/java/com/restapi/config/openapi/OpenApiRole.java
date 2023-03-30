package com.icicihfc.services.security.openapi;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author rajatjain on 24/08/20.
 * @project hfcservice
 */
public enum OpenApiRole implements GrantedAuthority {

    ROLE_OPEN_API_AEM;

    @Override
    public String getAuthority() {
        return name();
    }
}
