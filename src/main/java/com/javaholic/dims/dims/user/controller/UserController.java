package com.javaholic.dims.dims.user.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.javaholic.dims.common.LogManager;
import com.javaholic.dims.common.vo.CommonResponseVO;
import com.javaholic.dims.dims.user.service.DepartmentService;
import com.javaholic.dims.dims.user.service.UserService;
import com.javaholic.dims.dims.user.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private DepartmentService dptService;

	@RequestMapping(value = "/user/register", method = RequestMethod.GET)
	public ModelAndView openRegister() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	@ResponseBody
	public CommonResponseVO register(UserVO user) throws MessagingException {

		LogManager.logInfo("{}",user);
		
		userService.registUser(user);

		return new CommonResponseVO(CommonResponseVO.RESPONSE_CODE_SUCCESS);
	}

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	@ResponseBody
	public CommonResponseVO auth(@SessionAttribute("userVo") UserVO userVo, String userAuthKey) {
		LogManager.logInfo("{}", userAuthKey);
		CommonResponseVO response = null;

		boolean authResult = userService.auth(userVo.getUserId(), userAuthKey);

		if (authResult) {
			userVo.setUserAuthYn("Y");
			response = new CommonResponseVO(CommonResponseVO.RESPONSE_CODE_SUCCESS);
		} else {
			response = new CommonResponseVO(CommonResponseVO.RESPONSE_CODE_FAIL);
		}

		return response;
	}

	@RequestMapping(value = "/reAuth", method = RequestMethod.GET)
	@ResponseBody
	public CommonResponseVO reAuth(@SessionAttribute("userVo") UserVO userVo) {
		LogManager.logInfo("{}", userVo);
		try {
			userService.reAuth(userVo);
		} catch (MessagingException e) {
			e.printStackTrace();
			return new CommonResponseVO(CommonResponseVO.RESPONSE_CODE_FAIL);
		}
		return new CommonResponseVO(CommonResponseVO.RESPONSE_CODE_SUCCESS);
	}

}
