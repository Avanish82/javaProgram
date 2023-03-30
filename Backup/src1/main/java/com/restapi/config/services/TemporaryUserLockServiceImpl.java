package com.icicihfc.services.security.services;

import com.icicihfc.services.security.models.OAuthUser;
import com.icicihfc.services.security.models.TemporaryUserLock;
import com.icicihfc.services.security.repositories.TemporaryUserLockRepository;
import com.icicihfc.services.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

/**
 * @author rajatjain on 13/06/20.
 * @project hfcservices
 */
@Service
public class TemporaryUserLockServiceImpl implements TemporaryUserLockService {

    private TemporaryUserLockRepository temporaryUserLockRepository;

    @Autowired
    public void setTemporaryUserLockRepository(TemporaryUserLockRepository temporaryUserLockRepository) {
        this.temporaryUserLockRepository = temporaryUserLockRepository;
    }

    /**
     *
     * @param oAuthUser
     * @return true if locked, false if not locked
     */
    @Override
    public boolean checkAndIncrementLockCount(OAuthUser oAuthUser) {
        Optional<TemporaryUserLock> temporaryUserLockOptional =
                temporaryUserLockRepository.findByOauthUserId(oAuthUser.getId());
        if(temporaryUserLockOptional.isPresent()){
            TemporaryUserLock temporaryUserLock = temporaryUserLockOptional.get();
            if(checkValidity(temporaryUserLock)){
                temporaryUserLock.incrementCount();
                temporaryUserLockRepository.save(temporaryUserLock);
                return temporaryUserLock.getCount()>5;
            }else {
                temporaryUserLock.resetCounter();
                temporaryUserLockRepository.save(temporaryUserLock);
                return false;
            }
        }else{
            // Create new Lock
            temporaryUserLockRepository.save(TemporaryUserLock.builder().withOAuthUser(oAuthUser).build());
            return false;
        }
    }

    private boolean checkValidity(TemporaryUserLock temporaryUserLock) {
        LocalDateTime lastFail = LocalDateTime.ofInstant(temporaryUserLock.getLastFailDate().toInstant(),
                ZoneId.of(Constant.ASIA_KOLKATA));
        return !lastFail.isBefore(LocalDateTime.now(ZoneId.of(Constant.ASIA_KOLKATA)).minusMinutes(5));
    }

    /**
     *
     * @param oAuthUser
     * @return true if locked, false if not locked
     */
    @Override
    public boolean isLocked(OAuthUser oAuthUser){
        Optional<TemporaryUserLock> temporaryUserLockOptional =
                temporaryUserLockRepository.findByOauthUserId(oAuthUser.getId());
        if(temporaryUserLockOptional.isPresent()){
            TemporaryUserLock temporaryUserLock = temporaryUserLockOptional.get();
            return checkValidity(temporaryUserLock) && temporaryUserLock.getCount()>5;
        }else {
            return false;
        }
    }
}
