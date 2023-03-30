package com.icicihfc.services.security.dtos;

import com.icicihfc.services.security.enums.RoleEnum;
import com.icicihfc.services.utils.CommonUtils;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@Getter
@Setter
public class RolePermissionDTO {

    private Long id;

    private RoleEnum role;

    private boolean read;

    private boolean write;

    private boolean delete;

    private boolean activate;

    private boolean deactivate;

    private String createdDate;

    private String updatedDate;

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = CommonUtils.format(createdDate);
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = CommonUtils.format(updatedDate);
    }
}
