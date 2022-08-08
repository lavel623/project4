package com.springquick.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springquick.user.impl.UserService;

public class UserServiceClient {
	//public static String process() {
	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테어너로부터 UserServiceImpl 객체를 Lookup 한다.
		UserService userService =
				(UserService)container.getBean("userService");
		
		// 3. 로그인 기능 테스트
		UserVO vo = new UserVO();
		vo.setId("aaa");
		vo.setPassword("1234");
		
		UserVO user = userService.getUser(vo);
		String msg = "";
		if (user != null) {
			msg = user.getName() + "님 환영합니다.";
			System.out.println(user.getName() + "님 환영합니다.");
		} else {
			msg = "로그인 실패";
			System.out.println("로그인 실패");
		}
		
		// 4. Spring 컨테이너를 종료한다.
		container.close();
		
		//return msg;
	}
}
