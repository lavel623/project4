package com.springquick.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController /*implements Controller*/ {

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("�α׾ƿ� ó��");
		
//		// 1. �������� ����� ���� ��ü�� ���� �����Ѵ�.
//		HttpSession session = request.getSession();
//		session.invalidate();
//		
//		// 2. ���� ������, ���� ȭ������ �̵��Ѵ�.
//		ModelAndView mav = new ModelAndView();
//		//mav.setViewName("login.jsp");
//		mav.setViewName("redirect:login.jsp");
//		return mav;	
		
		session.invalidate();
		return "login.jsp";
	}

}
