package com.icicihfc.services.security.dtos;

import lombok.Getter;
import lombok.Setter;

/**
 * @author rajatjain on 11/06/20.
 * @project hfcservices
 */
@Getter
@Setter
public abstract class PartnerInfoDTO extends OAuthUserInfoDTO {

    private String email;

}
