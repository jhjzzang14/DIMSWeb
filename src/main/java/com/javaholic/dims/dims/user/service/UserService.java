package com.javaholic.dims.dims.user.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaholic.dims.dims.user.dao.UserDAO;

@Service
public class UserService {
	
	static HashMap<String, String> mobileSession = new HashMap<String, String>();
	
	@Autowired
	private UserDAO userDao;
	
}
