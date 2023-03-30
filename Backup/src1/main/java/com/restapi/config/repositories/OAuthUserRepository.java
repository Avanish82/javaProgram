package com.icicihfc.services.security.repositories;

import com.icicihfc.services.security.models.OAuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@Repository
public interface OAuthUserRepository<T extends OAuthUser> extends JpaRepository<T, Long> {

    List<T> findByIsDeactivatedFalse();

    Optional<T> findByIdentifierAndIsDeactivatedFalse(String identifier);

    Optional<T> findByIdentifier(String identifier);

//    @Query("from #{#entityName} entity where entity.id=:id and (entity.isDeleted=false or entity.isDeleted is null)")
//    Optional<T> findById(@Param("id") Long id);

}
