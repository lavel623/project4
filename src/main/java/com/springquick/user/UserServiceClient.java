package com.springquick.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springquick.user.impl.UserService;

public class UserServiceClient {
	//public static String process() {
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring ���׾�ʷκ��� UserServiceImpl ��ü�� Lookup �Ѵ�.
		UserService userService =
				(UserService)container.getBean("userService");
		
		// 3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("aaa");
		vo.setPassword("1234");
		
		UserVO user = userService.getUser(vo);
		String msg = "";
		if (user != null) {
			msg = user.getName() + "�� ȯ���մϴ�.";
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		} else {
			msg = "�α��� ����";
			System.out.println("�α��� ����");
		}
		
		// 4. Spring �����̳ʸ� �����Ѵ�.
		container.close();
		
		//return msg;
	}
}
