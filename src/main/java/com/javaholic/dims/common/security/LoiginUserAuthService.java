package com.javaholic.dims.common.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaholic.dims.dims.user.dao.UserDAO;
import com.javaholic.dims.dims.user.vo.UserVO;

@Service("loginUserAuthServices")
public class LoiginUserAuthService implements UserDetailsService{

	
	@Autowired UserDAO userDAO;
	
	Logger logger = LoggerFactory.getLogger(LoiginUserAuthService.class);
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		logger.info(userId);
		
		UserVO user = userDAO.selectUserInfo(userId);
		
		if (user == null) throw new UsernameNotFoundException("userName NotFound");
		
		logger.info(user.toString());
			
		return user;
	}

	
	
}
