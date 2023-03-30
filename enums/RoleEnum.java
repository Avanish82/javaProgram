package com.icicihfc.services.security.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
public enum RoleEnum {

    //
    ADMIN,

    //EMPLOYEE ROLES
    FD,

    FD_BROKER,

    RESOLUTION_APPLICATION,

    RESOLUTION_APPLICATION_WEB,

    TPM_FORM,

    EMPLOYEE,

    EMPLOYEE_TYPE,

    LEAD,

    CUSTOMER,

    HFC_CUSTOMER,

    DMA_RP,

    //CUSTOMER SPECIFIC ROLES
    CUSTOMER_FD,

    CUSTOMER_DMA_RP,

    CUSTOMER_BROKER_FD;

    public static RoleEnum[] getAllValues() {

        List<RoleEnum> roleEnums = new ArrayList<>(Arrays.asList(RoleEnum.values()));
        roleEnums.remove(RoleEnum.ADMIN);
        return roleEnums.toArray(new RoleEnum[0]);
    }
}
