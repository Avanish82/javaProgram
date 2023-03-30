package com.icicihfc.services.security.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class OAuthTokenUserResponse implements Serializable {

	private String access_token;

	private String token_type;

	private String refresh_token;

	private Long expires_in;

	private String scope;

	private String error ;

	private  String error_description;

}
