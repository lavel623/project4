package com.springquick.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springquick.user.UserVO;
import com.springquick.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(HttpServletRequest request, @ModelAttribute("user") UserVO uvo) {
		System.out.println("로그인 화면으로 이동");
		HttpSession session = request.getSession();
		
		session.setAttribute("sessionid", uvo.getId());
		uvo.setId("aaa");
		uvo.setPassword("1234");
		return "login.jsp";
	}

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo,
						UserDAO userDAO,
						HttpSession session) {
		if (vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		
		System.out.println("로그인 인증 처리...");		
		UserVO user = userDAO.getUser(vo);
		//if (userDAO.getUser(vo) != null) {
		if (user != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}
		else return "login.jsp";
	}

}

//@Controller
//public class LoginController /*implements Controller*/ {
//
//	//@Override
//	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//	@RequestMapping("/login.do")
//	public String login(UserVO vo, UserDAO userDAO) {
//		System.out.println("로그인 처리");
//		
////		// 1. 사용자 입력 정보 추출
////		String id = request.getParameter("id");
////		String password = request.getParameter("password");
////
////		// 2. DB 연동 처리
////		UserVO vo = new UserVO();
////		vo.setId(id);
////		vo.setPassword(password);
////
////		UserDAO userDAO = new UserDAO();
////		UserVO user = userDAO.getUser(vo);
////
////		// 3. 화면 네비게이션
////		ModelAndView mav = new ModelAndView();
////		if (user != null) {
////			//mav.setViewName("getBoardList.do");
////			mav.setViewName("redirect:getBoardList.do");
////		} else {
////			//mav.setViewName("login.jsp");
////			mav.setViewName("redirect:login.jsp");
////		}
////		return mav;
//		
//		if (userDAO.getUser(vo) != null) return "getBoardList.do";
//		else return "login.do";
//	}
//
//}
