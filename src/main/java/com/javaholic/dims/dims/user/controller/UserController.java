package com.javaholic.dims.dims.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javaholic.dims.common.vo.CommonResponseVO;
import com.javaholic.dims.dims.user.service.DepartmentService;
import com.javaholic.dims.dims.user.service.UserService;
import com.javaholic.dims.dims.user.vo.DepartmentVO;
import com.javaholic.dims.dims.user.vo.UserVO;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private DepartmentService dptService;
	
	/* �α����� �ʰ� �˾Ƽ� �ٲٷ� ���ƾ� */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public CommonResponseVO login(UserVO user, HttpSession session) {
		CommonResponseVO vo = new CommonResponseVO();
		vo.setCode(1);
		session.setAttribute("user", user);
		
		logger.info("{}",vo);
		
		return vo;
	}
	
	/* ȣ���� �ȵ���̵� ���� �׽�Ʈ  */
	@RequestMapping("/login/test")
	@ResponseBody
	public CommonResponseVO loginTest(HttpSession session, HttpServletRequest request) {
		logger.info("{}", request.getHeader("Set-Cookie"));
		
		CommonResponseVO vo = new CommonResponseVO();
		
		if(session.getAttribute("user")!=null)
		{
			UserVO loginUser = (UserVO)session.getAttribute("user");
			vo.setCode(1);
			vo.setResponseVO(new DepartmentVO(1, "�İ���"));
			return vo;
		}
		else
		{
			logger.info("");
			return vo;
		}
	}
	
	@RequestMapping(value="/user/register", method=RequestMethod.GET)
	public ModelAndView openRegister() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
	
	@RequestMapping(value="/user/register", method=RequestMethod.POST)
	@ResponseBody
	public CommonResponseVO register(UserVO user) {
		CommonResponseVO vo = new CommonResponseVO();
		vo.setCode(CommonResponseVO.RESPONSE_CODE_SUCCESS);
		return vo;
	}
	
	
	
}