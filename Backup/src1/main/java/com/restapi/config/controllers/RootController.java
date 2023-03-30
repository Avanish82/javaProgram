package com.icicihfc.services.security.controllers;

import com.icicihfc.services.HfcServicesRunnerApplication;
import com.icicihfc.services.security.services.RootService;
import com.icicihfc.services.utils.ApiLogger;
import com.icicihfc.services.utils.Constant;
import com.icicihfc.services.utils.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@RestController
@RequestMapping("/")
public class RootController {

    private RootService rootService;

    @Autowired
    private Environment environment;

    @Autowired
    public void setRootService(RootService rootService) {
        this.rootService = rootService;
    }

    @PostMapping("/logmeout")
    public ResponseObj logoutOAuthUser(@RequestHeader String authorization){
        ApiLogger.printApiRequestLogs();
        return rootService.logoutOAuthUser(authorization);
    }

    @GetMapping(value = "/test")
    public String test() {
        DateTimeFormatter dateFormat = DateTimeFormatter
                .ofPattern("E, dd MMM yyyy HH:mm:ss z")
                .withZone(ZoneId.of(Constant.ASIA_KOLKATA));

        return "Working Build <br> Release v20.05.1 <br> Patch Build v03.05.21.1 <br> Last Deployed on - " + dateFormat.format(HfcServicesRunnerApplication.getBuildDeployDate().toInstant());

    }

    @GetMapping(path = "/iciciHfcLogs")
    @PreAuthorize("hasAuthority(T(com.icicihfc.services.security.constants.Roles).ROLE_ADMIN)")
    public ResponseEntity<Resource> downloadIciciHfcLogs(@RequestParam String fileName) throws IOException {
        String env = environment.getProperty("CATALINA_HOME");

        String filePath;
        if (fileName.isEmpty()) {
            filePath = env + "/logs/icicihfcmicroservices.log";
        } else {
            filePath = env + "/logs/archived/icicihfcmicroservices." + fileName + ".log";
        }
        return rootService.logFileDownload(filePath);
    }

    @GetMapping("/createOpenApiToken")
    @PreAuthorize("hasAuthority(T(com.icicihfc.services.security.constants.Roles).ROLE_ADMIN)")
    public String clearDB() {
        return rootService.createOpenApiToken();
    }

    @GetMapping("/send/sms")
    @PreAuthorize("hasAuthority(T(com.icicihfc.services.security.constants.Roles).ROLE_ADMIN)")
    public String sendSms(@RequestParam String mobileNumber, @RequestParam String msg) {
        return rootService.sendSms(mobileNumber, msg);
    }

    @PreAuthorize("hasAuthority(T(com.icicihfc.services.security.constants.Roles).ROLE_ADMIN)")
    @GetMapping(path = "/log")
    public ResponseEntity<Resource> download() throws IOException {
        String env = environment.getProperty("CATALINA_HOME");
        String filePath = env + "/logs/catalina.out";
        File file = new File(filePath);

        HttpHeaders header = new HttpHeaders();
        header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=log.txt");
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

    @PostMapping("/reset/oauth/tokens")
    @PreAuthorize("hasAuthority(T(com.icicihfc.services.security.constants.Roles).ROLE_ADMIN)")
    public String resetOAuthTokens() {
        return rootService.resetOAuthTokens();
    }
}
