package com.project4.trip.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project4.trip.restaurantour.RestaurantourVO;
import com.project4.trip.restaurantour.impl.RestaurantourDAO;

@Controller
public class GetRestaurantourController {
	
	// 명소/맛집 등록
	@RequestMapping("/insertRestaurantour.do")
	public String insertRestaurantour(RestaurantourVO rvo, RestaurantourDAO rdao) {
		rdao.insertRestaurantour(rvo);
		return "getRestaurantourList.do";
	}
	
	// 명소/맛집 수정
	@RequestMapping("/updateRestaurantour.do")
	public String updateRestaurantour(RestaurantourVO rvo, RestaurantourDAO rdao) {
		rdao.updateRestaurantour(rvo);
		return "getRestaurantourList.do";
	}
	
	// 명소/맛집 삭제
	@RequestMapping("/deleteRestaurantour.do")
	public String deleteRestaurantour(RestaurantourVO rvo, RestaurantourDAO rdao) {
		rdao.deleteRestaurantour(rvo);
		return "getRestaurantourList.do";
	}
	
	// 명소/맛집 상세 조회
	@RequestMapping("/getRestaurantour.do")
	public ModelAndView getRestaurantour(RestaurantourVO rvo,
			RestaurantourDAO rdao, ModelAndView mav) {
		mav.addObject("restaurantour", rdao.getRestaurantour(rvo)); // Model 정보 저장
		mav.setViewName("getRestaurantour.jsp"); // View 정보 저장
		return mav;
	}
	
	@RequestMapping("/getRestaurantourList.do")
	public ModelAndView getRestaurantourList(RestaurantourVO rvo,
		RestaurantourDAO rdao, ModelAndView mav) {
		mav.addObject("restaurantourList", rdao.getRestaurantourList(rvo)); // Model 정보 저장
		mav.setViewName("getRestaurantourList.jsp"); // View 정보 저장
		return mav;
	}
}
