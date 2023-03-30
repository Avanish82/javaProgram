package com.icicihfc.services.security.repositories;

import com.icicihfc.services.security.models.PreviousPassword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author rajatjain on 06/07/20.
 * @project hfcservices
 */
public interface PreviousPasswordRepository extends JpaRepository<PreviousPassword, Long> {

    Optional<PreviousPassword> findByoAuthUserId(Long oAuthUserId);

}
