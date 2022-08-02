package com.project4.trip.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project4.trip.user.UserVO;
import com.project4.trip.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public  String loginView(UserVO vo) {
		System.out.println("로그인 인증 처리 중");
		vo.setId("raid");
		vo.setPw("1234");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public  String login(UserVO vo, UserDAO userDAO) {
		System.out.println("로그인 인증 처리 중");
		if(userDAO.getUser(vo) != null) return "getBoardList.do";
		else return "login.jsp";
	}
}
