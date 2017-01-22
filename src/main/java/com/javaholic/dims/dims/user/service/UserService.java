package com.javaholic.dims.dims.user.service;

import java.util.HashMap;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaholic.dims.dims.user.dao.UserDAO;
import com.javaholic.dims.dims.user.vo.UserVO;
import com.javaholic.dims.dims.utils.MailTemplate;
import com.javaholic.dims.dims.utils.StringUtils;

@Service
public class UserService {

	static HashMap<String, String> mobileSession = new HashMap<String, String>();

	@Autowired
	private MailTemplate mail;

	@Autowired
	private UserDAO userDao;

	public void registUser(UserVO user) throws MessagingException {
		String authKey = StringUtils.getRandomString();
		user.setUserAuthKey(authKey);
		user.setUserTypeAs("S");
		userDao.insert(user);

		mail.send("DIMS ȸ������ ���� ����", "<p>������Ʈ���� �α��� �� �Ʒ� ������ȣ�� �Է��ϼ���.</p> <strong>" + authKey + "</strong>",
				new String[] { user.getUserEmail() });
	}

	public boolean auth(String userId, String userAuthKey) {
		boolean result = false;

		UserVO userVo = userDao.selectUserInfo(userId);

		if (userVo.getUserAuthKey().equals(userAuthKey)) {
			userVo.setUserAuthYn("Y");
			userDao.update(userVo);
			result = true;
		}

		return result;
	}

	public void reAuth(UserVO userVo) throws MessagingException {
		String authKey = StringUtils.getRandomString();
		userVo.setUserAuthKey(authKey);
		userDao.update(userVo);
		mail.send("DIMS ������ȣ ��߼�", "<p>������Ʈ���� �α��� �� �Ʒ� ������ȣ�� �Է��ϼ���.</p> <strong>" + authKey + "</strong>",
				new String[] { userVo.getUserEmail() });
		
	}

}
