package com.icicihfc.services.security.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "oauth_user_seq_gen", sequenceName = "oauth_user_seq", allocationSize = 1)
public abstract class OAuthUser implements Serializable {

    public OAuthUser(OAuthUser user) {
        this.id = user.getId();
        this.createdDate = user.getCreatedDate();
        this.updatedDate = user.getUpdatedDate();
        this.identifier = user.getIdentifier();
        this.password = user.getPassword();
        this.isDeactivated = user.isDeactivated();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.enabled = user.isEnabled();
        this.accountNonExpired = user.isAccountNonExpired();
        this.credentialsNonExpired = user.isCredentialsNonExpired();
        this.accountNonLocked = user.isAccountNonLocked();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oauth_user_seq_gen")
    private Long id;

    @CreationTimestamp
    private Timestamp createdDate;

    private Timestamp updatedDate;

    private String password;

    // from Sub Class -> userName = (D_TYPE.email)
    // from Sub Class (Customer) -> userName = (D_TYPE.email.id1)
    @Column(unique = true, nullable = false)
    private String identifier;

    private boolean isDeactivated = false;

    private String firstName;

    private String lastName;

    private boolean enabled = true;

    private boolean accountNonExpired = true;

    private boolean credentialsNonExpired = true;

    private boolean accountNonLocked = true;

    private Timestamp lastLoginDate;

    private Timestamp currentLoginDate;

    private String accessToken;

    private String refreshToken;
}
