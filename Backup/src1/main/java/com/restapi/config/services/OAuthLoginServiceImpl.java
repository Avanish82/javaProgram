package com.icicihfc.services.security.services;

import com.icicihfc.services.security.dtos.OAuthTokenUserResponse;
import com.icicihfc.services.security.dtos.OAuthUserDTO;
import com.icicihfc.services.security.models.OAuthUser;
import com.icicihfc.services.security.repositories.OAuthUserRepository;
import com.icicihfc.services.utils.AesUtil;
import com.icicihfc.services.utils.CommonUtils;
import com.icicihfc.services.utils.DTOHelper;
import com.icicihfc.services.utils.ResponseMessageConstants;
import com.icicihfc.services.utils.ResponseObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author rajatjain on 26/08/20.
 * @project hfcservices
 */
@Slf4j
@Service
public class OAuthLoginServiceImpl implements OAuthLoginService {

    private OAuthTokenServices oAuthTokenServices;

    private AesUtil aesUtil;

    private TemporaryUserLockService temporaryUserLockService;

    private PasswordEncoder passwordEncoder;

    private OAuthUserRepository<OAuthUser> oAuthUserRepository;

    private DTOHelper dtoHelper;

    @Autowired
    public void setDtoHelper(DTOHelper dtoHelper) {
        this.dtoHelper = dtoHelper;
    }

    @Autowired
    public void setoAuthUserRepository(OAuthUserRepository<OAuthUser> oAuthUserRepository) {
        this.oAuthUserRepository = oAuthUserRepository;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setoAuthTokenServices(OAuthTokenServices oAuthTokenServices) {
        this.oAuthTokenServices = oAuthTokenServices;
    }

    @Autowired
    public void setAesUtil(AesUtil aesUtil) {
        this.aesUtil = aesUtil;
    }

    @Autowired
    public void setTemporaryUserLockService(TemporaryUserLockService temporaryUserLockService) {
        this.temporaryUserLockService = temporaryUserLockService;
    }

    @Override
    public ResponseObj loginOAuthUser(OAuthUser oAuthUser, String password) throws IOException {
        // Normal OAuth2 Login
        if (passwordEncoder.matches(password, oAuthUser.getPassword())) {
            oAuthTokenServices.revokeToken(oAuthUser);
            if (temporaryUserLockService.isLocked(oAuthUser)) {
                return ResponseObj.builder().badRequest(ResponseMessageConstants.LOCKED_ACCOUNT_MESSAGE).build();
            }
        } else {

            if (temporaryUserLockService.checkAndIncrementLockCount(oAuthUser)) {
                return ResponseObj.builder().badRequest(ResponseMessageConstants.LOCKED_ACCOUNT_MESSAGE).build();
            }
            return ResponseObj.builder().badRequest("Password Incorrect").build();
        }
        return generateAccessToken(oAuthUser, password);
    }

    @Override
    public ResponseObj generateAccessToken(OAuthUser oAuthUser, String password) throws IOException {
        OAuthTokenUserResponse oAuthTokenUserResponse =
                oAuthTokenServices.generateAccessToken(oAuthUser.getIdentifier(), password);
        if (oAuthTokenUserResponse.getError() != null ||
                oAuthTokenUserResponse.getError_description() != null) {
            return ResponseObj.builder().badRequest("Unable to generate token, " + oAuthTokenUserResponse.getError_description()).build();
        } else {
            oAuthUser.setAccessToken(aesUtil.encrypt(oAuthTokenUserResponse.getAccess_token()));
            oAuthUser.setRefreshToken(aesUtil.encrypt(oAuthTokenUserResponse.getRefresh_token()));
            oAuthUser.setCurrentLoginDate(CommonUtils.getCurrentTimeStamp());
            oAuthUser.setLastLoginDate(oAuthUser.getCurrentLoginDate());
            oAuthUser = oAuthUserRepository.save(oAuthUser);

            oAuthUser.setAccessToken(oAuthTokenUserResponse.getAccess_token());

            return ResponseObj
                    .builder()
                    .ok("Login Successful")
                    .withData(dtoHelper.convertEntityToDto(oAuthUser, OAuthUserDTO.class))
                    .build();
        }
    }

}
