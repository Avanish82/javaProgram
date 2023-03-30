package com.icicihfc.services.security.dtos;

import com.icicihfc.services.employee.dtos.EmployeeInfoDTO;
import com.icicihfc.services.utils.CommonUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @author rajatjain on 11/06/20.
 * @project hfcservices
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class CustomerDTO extends OAuthUserDTO {

    public static final String D_TYPE = "CUSTOMER";

    private String approvalDate;

    private EmployeeInfoDTO approvedBy;

    private EmployeeInfoDTO lastUpdatedBy;

    public void setApprovalDate(Timestamp approvalDate) {
        this.approvalDate =  CommonUtils.format(approvalDate);
    }
}
