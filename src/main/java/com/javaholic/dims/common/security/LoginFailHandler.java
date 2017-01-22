package com.javaholic.dims.common.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.javaholic.dims.common.LogManager;
import com.javaholic.dims.common.vo.CommonResponseVO;
import com.javaholic.dims.dims.utils.ResponseUtils;

public class LoginFailHandler implements AuthenticationFailureHandler{
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
		LogManager.logInfo("login fail");
		
		ResponseUtils.jsonResponse(response, new CommonResponseVO(CommonResponseVO.RESPONSE_CODE_FAIL));
	}

}
