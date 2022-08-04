package com.project4.trip.user;

public interface UserService {

	public UserVO loginUser(UserVO vo);	// 유저 로그인
	
	public UserVO getUser(UserVO vo);	// 원하는 유저 정보 불러오기
	
	public void updateUser(UserVO vo);	// 유저 정보 수정
	
}
