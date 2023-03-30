package com.icicihfc.services.security.repositories;

import com.icicihfc.services.security.models.TemporaryUserLock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author rajatjain on 13/06/20.
 * @project hfcservices
 */
@Repository
public interface TemporaryUserLockRepository extends JpaRepository<TemporaryUserLock, Long> {

    Optional<TemporaryUserLock> findByOauthUserId(Long oauthUserId);

}
