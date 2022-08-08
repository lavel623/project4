package com.springquick.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springquick.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO _userDAO) {
		this.userDAO = _userDAO;
	}
	
	public UserVO getUser(UserVO _vo) {
		return userDAO.getUser(_vo);
	}
}
