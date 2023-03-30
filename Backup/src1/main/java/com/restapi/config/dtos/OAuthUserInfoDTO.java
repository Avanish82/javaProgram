package com.icicihfc.services.security.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@Getter
@Setter
@NoArgsConstructor
public class OAuthUserInfoDTO {

    private Long id;

    private String firstName;

    private String lastName;
}
