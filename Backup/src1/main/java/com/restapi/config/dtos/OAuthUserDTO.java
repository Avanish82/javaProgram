package com.icicihfc.services.security.dtos;

import com.icicihfc.services.utils.CommonUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@Getter
@Setter
@NoArgsConstructor
public class OAuthUserDTO{

    private Long id;

    private boolean isDeactivated;

    private String createdDate;

    private String updatedDate;

    private String firstName;

    private String lastName;

    private String accessToken;

    private String lastLoginDate;

    private String currentLoginDate;

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = CommonUtils.format(createdDate);
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = CommonUtils.format(updatedDate);
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = CommonUtils.format(lastLoginDate);
    }

    public void setCurrentLoginDate(Timestamp currentLoginDate) {
        this.currentLoginDate = CommonUtils.format(currentLoginDate);
    }
}
