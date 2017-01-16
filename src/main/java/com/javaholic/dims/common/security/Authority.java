package com.javaholic.dims.common.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{

	private static final long serialVersionUID = 1L;

	@Override
	public String getAuthority() {
		
		return "ROLE_USER";
	}

}
