package com.javaholic.dims.dims.user.dao;

import org.springframework.stereotype.Repository;

import com.javaholic.dims.dims.user.vo.UserVO;

@Repository
public interface UserDAO {

	public void insert(UserVO user);
	
	public UserVO selectUserInfo(String userId);
	
}
