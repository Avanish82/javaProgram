package com.icicihfc.services.security.openapi;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author rajatjain on 24/08/20.
 * @project hfcservice
 */
@Service
public class OpenApiUserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserDetails userDetails = new OpenApiUserDetails(
                true, true, true, true,
                new ArrayList<OpenApiRole>(Arrays.asList(OpenApiRole.ROLE_OPEN_API_AEM)));

        return userDetails;
    }

}
