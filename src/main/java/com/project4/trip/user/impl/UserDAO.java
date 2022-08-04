package com.project4.trip.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project4.trip.user.UserVO;

import org.mybatis.spring.SqlSessionTemplate;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public UserVO loginUser(UserVO vo) {
		System.out.println("===> Mybatis로 loginUser() 기능 처리");
		return (UserVO) mybatis.selectOne("UserDAO.loginUser", vo);
	}
	
	public UserVO getUser(UserVO vo) {
		System.out.println("===> Mybatis로 getUser() 기능 처리");
		return (UserVO) mybatis.selectOne("UserDAO.getUser", vo);
	}
	
	public void updateUser(UserVO vo) {
		System.out.println("===> Mybatis로 updateUser() 기능 처리");
		mybatis.update("UserDAO.updateUser", vo);
	}

}