package com.icicihfc.services.security.constants;

import com.icicihfc.services.security.enums.PermissionEnum;
import com.icicihfc.services.security.enums.RoleEnum;

/**
 * @author rajatjain on 11/06/20.
 * @project hfcservices
 */
public class Roles {

    private Roles(){ }

    public static final String ROLE_PREFIX = "ROLE_";

    public static final String ROLE_ADMIN = ROLE_PREFIX + RoleEnum.ADMIN.name();

    //CUSTOMER_FD
    public static final String ROLE_CUSTOMER_FD = ROLE_PREFIX + RoleEnum.CUSTOMER_FD.name();

    //BROKER_FD
    public static final String ROLE_CUSTOMER_BROKER_FD = ROLE_PREFIX + RoleEnum.CUSTOMER_BROKER_FD.name();

    //DMA_RP_CUSTOMER
    public static final String ROLE_CUSTOMER_DMA_RP = ROLE_PREFIX + RoleEnum.CUSTOMER_DMA_RP.name();

    // RESOLUTION_APPLICATION
    public static final String ROLE_RESOLUTION_APPLICATION = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION.name();

    public static final String ROLE_RESOLUTION_APPLICATION_READ = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_RESOLUTION_APPLICATION_WRITE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_RESOLUTION_APPLICATION_DELETE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_RESOLUTION_APPLICATION_ACTIVATE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_RESOLUTION_APPLICATION_DEACTIVATE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION.name() + "_" + PermissionEnum.DEACTIVATE.name();


    // RESOLUTION_APPLICATION_WEB
    public static final String ROLE_RESOLUTION_APPLICATION_WEB = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION_WEB.name();

    public static final String ROLE_RESOLUTION_APPLICATION_WEB_READ = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION_WEB.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_RESOLUTION_APPLICATION_WEB_WRITE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION_WEB.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_RESOLUTION_APPLICATION_WEB_DELETE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION_WEB.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_RESOLUTION_APPLICATION_WEB_ACTIVATE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION_WEB.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_RESOLUTION_APPLICATION_WEB_DEACTIVATE = ROLE_PREFIX + RoleEnum.RESOLUTION_APPLICATION_WEB.name() + "_" + PermissionEnum.DEACTIVATE.name();


    // TPM_FORM
    public static final String ROLE_TPM_FORM = ROLE_PREFIX + RoleEnum.TPM_FORM.name();

    public static final String ROLE_TPM_FORM_READ = ROLE_PREFIX + RoleEnum.TPM_FORM.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_TPM_FORM_WRITE = ROLE_PREFIX + RoleEnum.TPM_FORM.name() + "_" + PermissionEnum.WRITE.name();


    // EMPLOYEE_TYPE
    public static final String ROLE_EMPLOYEE_TYPE = ROLE_PREFIX + RoleEnum.EMPLOYEE_TYPE.name();

    public static final String ROLE_EMPLOYEE_TYPE_READ = ROLE_PREFIX + RoleEnum.EMPLOYEE_TYPE.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_EMPLOYEE_TYPE_WRITE = ROLE_PREFIX + RoleEnum.EMPLOYEE_TYPE.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_EMPLOYEE_TYPE_DELETE = ROLE_PREFIX + RoleEnum.EMPLOYEE_TYPE.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_EMPLOYEE_TYPE_ACTIVATE = ROLE_PREFIX + RoleEnum.EMPLOYEE_TYPE.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_EMPLOYEE_TYPE_DEACTIVATE = ROLE_PREFIX + RoleEnum.EMPLOYEE_TYPE.name() + "_" + PermissionEnum.DEACTIVATE.name();

    // EMPLOYEE
    public static final String ROLE_EMPLOYEE = ROLE_PREFIX + RoleEnum.EMPLOYEE.name();

    public static final String ROLE_EMPLOYEE_READ = ROLE_PREFIX + RoleEnum.EMPLOYEE.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_EMPLOYEE_WRITE = ROLE_PREFIX + RoleEnum.EMPLOYEE.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_EMPLOYEE_DELETE = ROLE_PREFIX + RoleEnum.EMPLOYEE.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_EMPLOYEE_ACTIVATE = ROLE_PREFIX + RoleEnum.EMPLOYEE.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_EMPLOYEE_DEACTIVATE = ROLE_PREFIX + RoleEnum.EMPLOYEE.name() + "_" + PermissionEnum.DEACTIVATE.name();

    //FD
    public static final String ROLE_FD = ROLE_PREFIX + RoleEnum.FD.name();

    public static final String ROLE_FD_READ = ROLE_PREFIX + RoleEnum.FD.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_FD_WRITE = ROLE_PREFIX + RoleEnum.FD.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_FD_DELETE = ROLE_PREFIX + RoleEnum.FD.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_FD_ACTIVATE = ROLE_PREFIX + RoleEnum.FD.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_FD_DEACTIVATE = ROLE_PREFIX + RoleEnum.FD.name() + "_" + PermissionEnum.DEACTIVATE.name();

    //FD BROKER
    public static final String ROLE_FD_BROKER = ROLE_PREFIX + RoleEnum.FD_BROKER.name();

    public static final String ROLE_FD_BROKER_READ = ROLE_PREFIX + RoleEnum.FD_BROKER.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_FD_BROKER_WRITE = ROLE_PREFIX + RoleEnum.FD_BROKER.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_FD_BROKER_DELETE = ROLE_PREFIX + RoleEnum.FD_BROKER.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_FD_BROKER_ACTIVATE = ROLE_PREFIX + RoleEnum.FD_BROKER.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_FD_BROKER_DEACTIVATE = ROLE_PREFIX + RoleEnum.FD_BROKER.name() + "_" + PermissionEnum.DEACTIVATE.name();

    //LEAD
    public static final String ROLE_LEAD = ROLE_PREFIX + RoleEnum.LEAD.name();

    public static final String ROLE_LEAD_READ = ROLE_PREFIX + RoleEnum.LEAD.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_LEAD_WRITE = ROLE_PREFIX + RoleEnum.LEAD.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_LEAD_DELETE = ROLE_PREFIX + RoleEnum.LEAD.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_LEAD_ACTIVATE = ROLE_PREFIX + RoleEnum.LEAD.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_LEAD_DEACTIVATE = ROLE_PREFIX + RoleEnum.LEAD.name() + "_" + PermissionEnum.DEACTIVATE.name();

    //CUSTOMER
    public static final String ROLE_CUSTOMER = ROLE_PREFIX + RoleEnum.CUSTOMER.name();

    public static final String ROLE_CUSTOMER_READ = ROLE_PREFIX + RoleEnum.CUSTOMER.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_CUSTOMER_WRITE = ROLE_PREFIX + RoleEnum.CUSTOMER.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_CUSTOMER_DELETE = ROLE_PREFIX + RoleEnum.CUSTOMER.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_CUSTOMER_ACTIVATE = ROLE_PREFIX + RoleEnum.CUSTOMER.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_CUSTOMER_DEACTIVATE = ROLE_PREFIX + RoleEnum.CUSTOMER.name() + "_" + PermissionEnum.DEACTIVATE.name();

    //HFC_CUSTOMER
    public static final String ROLE_HFC_CUSTOMER = ROLE_PREFIX + RoleEnum.HFC_CUSTOMER.name();

    public static final String ROLE_HFC_CUSTOMER_READ = ROLE_PREFIX + RoleEnum.HFC_CUSTOMER.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_HFC_CUSTOMER_WRITE = ROLE_PREFIX + RoleEnum.HFC_CUSTOMER.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_HFC_CUSTOMER_DELETE = ROLE_PREFIX + RoleEnum.HFC_CUSTOMER.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_HFC_CUSTOMER_ACTIVATE = ROLE_PREFIX + RoleEnum.HFC_CUSTOMER.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_HFC_CUSTOMER_DEACTIVATE = ROLE_PREFIX + RoleEnum.HFC_CUSTOMER.name() + "_" + PermissionEnum.DEACTIVATE.name();

    //DMA_RP
    public static final String ROLE_DMA_RP = ROLE_PREFIX + RoleEnum.DMA_RP.name();

    public static final String ROLE_DMA_RP_READ = ROLE_PREFIX + RoleEnum.DMA_RP.name() + "_" + PermissionEnum.READ.name();

    public static final String ROLE_DMA_RP_WRITE = ROLE_PREFIX + RoleEnum.DMA_RP.name() + "_" + PermissionEnum.WRITE.name();

    public static final String ROLE_DMA_RP_DELETE = ROLE_PREFIX + RoleEnum.DMA_RP.name() + "_" + PermissionEnum.DELETE.name();

    public static final String ROLE_DMA_RP_ACTIVATE = ROLE_PREFIX + RoleEnum.DMA_RP.name() + "_" + PermissionEnum.ACTIVATE.name();

    public static final String ROLE_DMA_RP_DEACTIVATE = ROLE_PREFIX + RoleEnum.DMA_RP.name() + "_" + PermissionEnum.DEACTIVATE.name();

}
