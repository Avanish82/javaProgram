package com.icicihfc.services.security.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.sql.Timestamp;

/**
 * @author rajatjain on 06/07/20.
 * @project hfcservices
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "security_seq_gen", sequenceName = "security_seq", allocationSize = 1)
public class PreviousPassword {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "security_seq_gen")
    private Long id;

    @Column(unique = true, nullable = false)
    private long oAuthUserId;

    private String passwordA;

    private String passwordB;

    private String passwordC;

    private String passwordD;

    private String passwordE;

    @CreationTimestamp
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp updatedDate;
}
