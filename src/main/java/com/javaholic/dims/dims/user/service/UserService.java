package com.javaholic.dims.dims.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaholic.dims.dims.user.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;
	
}
