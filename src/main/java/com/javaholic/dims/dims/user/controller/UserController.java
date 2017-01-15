package com.javaholic.dims.dims.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javaholic.dims.dims.user.service.UserService;
import com.javaholic.dims.dims.user.vo.UserVO;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("join")
	public ModelAndView openJoin() {
		ModelAndView mv = new ModelAndView("join");
		return mv;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public void joinUser(UserVO user) {
		logger.info("Join {}",user);
	}
	
}
