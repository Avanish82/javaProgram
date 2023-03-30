package com.icicihfc.services.security.openapi;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class OpenApiUserDetails extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 1L;

	public OpenApiUserDetails(String username, String password,
							  Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public OpenApiUserDetails(boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
							  boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		super("AEM", "AEM", enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,
				authorities);
	}

}
