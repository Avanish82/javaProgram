package com.icicihfc.services.security.services;

import com.icicihfc.services.security.openapi.JwtTokenProvider;
import com.icicihfc.services.security.openapi.OpenApiRole;
import com.icicihfc.services.utils.ResponseObj;
import com.icicihfc.services.utils.SmsUtil;
import com.icicihfc.services.utils.Validators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

/**
 * @author rajatjain on 13/06/20.
 * @project hfcservices
 */
@Service
public class RootServiceImpl implements RootService {

    public static final String COUNTRY_CODE = "91";

    @Value("${sms_ip}")
    private String smsIp;

    @Value("${sms_port}")
    private String smsPort;

    private OAuthTokenServices oAuthTokenServices;

    private JwtTokenProvider jwtTokenProvider;

    private SmsUtil smsUtil;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    public void setSmsUtil(SmsUtil smsUtil) {
        this.smsUtil = smsUtil;
    }

    @Autowired
    public void setJwtTokenProvider(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Autowired
    public void setoAuthTokenServices(OAuthTokenServices oAuthTokenServices) {
        this.oAuthTokenServices = oAuthTokenServices;
    }

    @Override
    public ResponseObj logoutOAuthUser(String accessToken) {
        oAuthTokenServices.revokeToken(accessToken);
        return ResponseObj.builder().ok("User logged out successfully").build();
    }

    @Override
    public ResponseEntity<Resource> logFileDownload(String filePath) throws IOException {

        File file = new File(filePath);
        HttpHeaders header = new HttpHeaders();
        header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename="+file.getName());
        header.add("Cache-Control", "no-cache, no-store, must-revalidate");
        header.add("Pragma", "no-cache");
        header.add("Expires", "0");

        Path path = Paths.get(file.getAbsolutePath());

        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));

        return ResponseEntity.ok()
                .headers(header)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(resource);
    }

    @Override
    public String createOpenApiToken() {
        return jwtTokenProvider.createToken("AEM", Arrays.asList(new OpenApiRole[]{OpenApiRole.ROLE_OPEN_API_AEM}), 60000L);
    }

    @Override
    public String sendSms(String mobileNumber, String msg) {
        if(Validators.isNotNullAndNotEmpty(mobileNumber) && Validators.isNotNullAndNotEmpty(msg)) {
            CompletableFuture.runAsync(() -> smsUtil.sendSMSWithLogs(mobileNumber, msg, COUNTRY_CODE, smsIp, smsPort));
            return "sent";
        }else{
            return "invalid msg or mobile number";
        }
    }

    @Transactional
    @Override
    public String resetOAuthTokens() {
        try {
            entityManager.createNativeQuery("truncate table OAUTH_ACCESS_TOKEN")
                    .executeUpdate();
            entityManager.createNativeQuery("truncate table OAUTH_REFRESH_TOKEN")
                    .executeUpdate();
            System.out.println("Query executed");
            return "Query Executed";
        }catch (Exception e) {
            System.out.println(e.toString());
            return e.toString();
        }
    }
}
