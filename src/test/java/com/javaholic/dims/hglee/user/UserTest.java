package com.javaholic.dims.hglee.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javaholic.dims.dims.user.dao.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/dims/spring/*.xml" })
public class UserTest {

	private static final Logger logger = LoggerFactory.getLogger(UserTest.class);

	@Autowired
	private UserDAO userDao;

	@Test
	public void test() {

	}

}
