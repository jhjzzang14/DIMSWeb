package com.javaholic.dims;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String login(HttpServletRequest request,HttpServletResponse response) throws IOException {
		return "login";	
	}
	
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String url(HttpServletRequest request,HttpServletResponse response) throws IOException {
		return "home";
	}
	
	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public String auth() {
		return "auth";
	}
}
