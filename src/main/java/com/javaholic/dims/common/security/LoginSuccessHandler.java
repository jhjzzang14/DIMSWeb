
package com.javaholic.dims.common.security;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaholic.dims.dims.user.dao.UserDAO;
import com.javaholic.dims.dims.user.vo.UserVO;

public class LoginSuccessHandler implements AuthenticationSuccessHandler{

	Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
	
	@Autowired UserDAO userDAO;
	
	@ResponseBody
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authUser)
			throws IOException, ServletException {
		
		logger.info("login Seccess");
		
		UserVO userVo = userDAO.selectUserInfo(authUser.getName());
		
		response.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(userVo);
		
		OutputStream resOutStream = response.getOutputStream();
		
		resOutStream.write(json.getBytes());
		
		HttpSession session = request.getSession();
		
		session.setAttribute("userVo",userVo);
	}

}