package com.icicihfc.services.security.services;

import com.icicihfc.services.utils.ResponseObj;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

/**
 * @author rajatjain on 13/06/20.
 * @project hfcservices
 */
public interface RootService {
    ResponseObj logoutOAuthUser(String identifier);

    ResponseEntity<Resource> logFileDownload(String filePath) throws IOException;

    String createOpenApiToken();

    String sendSms(String mobileNumber, String msg);

    String resetOAuthTokens();
}
