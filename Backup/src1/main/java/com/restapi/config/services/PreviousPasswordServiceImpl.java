package com.icicihfc.services.security.services;

import com.icicihfc.services.security.models.OAuthUser;
import com.icicihfc.services.security.models.PreviousPassword;
import com.icicihfc.services.security.repositories.PreviousPasswordRepository;
import com.icicihfc.services.utils.CommonUtils;
import com.icicihfc.services.utils.Validators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author rajatjain on 06/07/20.
 * @project hfcservices
 */
@Service
public class PreviousPasswordServiceImpl implements PreviousPasswordService {

    private PreviousPasswordRepository previousPasswordRepository;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setPreviousPasswordRepository(PreviousPasswordRepository previousPasswordRepository) {
        this.previousPasswordRepository = previousPasswordRepository;
    }

    @Override
    public void storePreviousPassword(OAuthUser oAuthUser) {
        Optional<PreviousPassword> previousPasswordOptional =
                previousPasswordRepository.findByoAuthUserId(oAuthUser.getId());
        String previousPassword = oAuthUser.getPassword();
        PreviousPassword previousPasswordDb;
        if (!previousPasswordOptional.isPresent()) {
            previousPasswordDb = new PreviousPassword();
            previousPasswordDb.setCreatedDate(CommonUtils.getCurrentTimeStamp());
            previousPasswordDb.setOAuthUserId(oAuthUser.getId());
        }else {
            previousPasswordDb = previousPasswordOptional.get();
        }

        if(!previousPassword.equals(previousPasswordDb.getPasswordA())) {
            if (Validators.isNullEmpty(previousPasswordDb.getPasswordA())) {
                previousPasswordDb.setPasswordA(previousPassword);
            } else if (Validators.isNullEmpty(previousPasswordDb.getPasswordB())) {
                previousPasswordDb.setPasswordB(previousPasswordDb.getPasswordA());
                previousPasswordDb.setPasswordA(previousPassword);
            } else if (Validators.isNullEmpty(previousPasswordDb.getPasswordC())) {
                previousPasswordDb.setPasswordC(previousPasswordDb.getPasswordB());
                previousPasswordDb.setPasswordB(previousPasswordDb.getPasswordA());
                previousPasswordDb.setPasswordA(previousPassword);
            } else if (Validators.isNullEmpty(previousPasswordDb.getPasswordD())) {
                previousPasswordDb.setPasswordD(previousPasswordDb.getPasswordC());
                previousPasswordDb.setPasswordC(previousPasswordDb.getPasswordB());
                previousPasswordDb.setPasswordB(previousPasswordDb.getPasswordA());
                previousPasswordDb.setPasswordA(previousPassword);
            } else {
                previousPasswordDb.setPasswordE(previousPasswordDb.getPasswordD());
                previousPasswordDb.setPasswordD(previousPasswordDb.getPasswordC());
                previousPasswordDb.setPasswordC(previousPasswordDb.getPasswordB());
                previousPasswordDb.setPasswordB(previousPasswordDb.getPasswordA());
                previousPasswordDb.setPasswordA(previousPassword);
            }
            previousPasswordRepository.save(previousPasswordDb);
        }
    }

    @Override
    public boolean isNewPasswordValid(OAuthUser oAuthUser, String newPassword) {
        Optional<PreviousPassword> previousPasswordOptional =
                previousPasswordRepository.findByoAuthUserId(oAuthUser.getId());
        if(!previousPasswordOptional.isPresent()){
            return true;
        }

        PreviousPassword previousPassword = previousPasswordOptional.get();

        return !(matches(newPassword, previousPassword.getPasswordA()) ||
                matches(newPassword,previousPassword.getPasswordB()) ||
                matches(newPassword,previousPassword.getPasswordC()) ||
                matches(newPassword,previousPassword.getPasswordD()) ||
                matches(newPassword,previousPassword.getPasswordE()));
    }

    private boolean matches(String newPassword, String previousPasswordHash){
        if(Validators.isNullEmpty(previousPasswordHash)){
            return false;
        }else{
            return passwordEncoder.matches(newPassword, previousPasswordHash);
        }

    }
}
