package com.javaholic.dims.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.javaholic.dims.common.vo.CommonResponseVO;
import com.javaholic.dims.dims.user.vo.UserVO;
import com.javaholic.dims.dims.utils.ResponseUtils;

public class AuthChekingInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthChekingInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		/* Auth check에 걸리는 요청은 무조건 Session에 객체가 있다는 가정 하에 */
		UserVO userVo = (UserVO)request.getSession().getAttribute("userVo");
		
		if(userVo.getUserAuthYn().equals("Y"))
		{
			return true;
		}
		else
		{
			Device currentDevice = DeviceUtils.getCurrentDevice(request);
			
			if(currentDevice.isMobile())
			{
				ResponseUtils.jsonResponse(response, new CommonResponseVO(CommonResponseVO.RESPONSE_CODE_PERMISSION_FAIL, null));
			}
			else
			{
				response.sendRedirect("/auth");
			}
			
			return false;
		}
		
	}
	
}
