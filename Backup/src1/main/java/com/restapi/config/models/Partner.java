package com.icicihfc.services.security.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author rajatjain on 11/06/20.
 * @project hfcservices
 */
@Getter
@Setter
@MappedSuperclass
public abstract class Partner extends OAuthUser {

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true)
    private String username;

    @Column(name = "created_by_user_id")
    private Long createdByUserId;

    @Column(name = "last_updated_by_user_id")
    private Long lastUpdatedByUserId;

}
