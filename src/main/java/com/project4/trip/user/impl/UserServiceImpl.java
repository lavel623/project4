package com.project4.trip.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project4.trip.user.UserService;
import com.project4.trip.user.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserVO loginUser(UserVO vo) {
		return userDAO.loginUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.getUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		userDAO.updateUser(vo);
		// void라 return이 없음 그러므로 return지우고 바로 userDAO.updateUseR(vo); 집어넣으면 오류없음
	}
	
}
