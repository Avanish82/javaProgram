package com.icicihfc.services.security.models;

import com.icicihfc.services.employee.models.Employee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

/**
 * @author rajatjain on 11/06/20.
 * @project hfcservices
 */
@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class Customer extends OAuthUser {

    public static final String D_TYPE = "CUSTOMER";

    private Timestamp approvalDate;

    @OneToOne(fetch = FetchType.LAZY)
    private Employee approvedBy;

    @OneToOne(fetch = FetchType.LAZY)
    private Employee lastUpdatedBy;

}
