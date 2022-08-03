package com.project4.trip.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project4.trip.restaurantour.RestaurantourVO;
import com.project4.trip.restaurantour.impl.RestaurantourDAO;

@Controller
public class GetRestaurantourListController {
	
	@RequestMapping("/getRestaurantourList.do")
	public ModelAndView getRestaurantourList(RestaurantourVO rvo,
			RestaurantourDAO rdao, ModelAndView mav) {
	mav.addObject("restaurantourList", rdao.getRestaurantourList(rvo)); // Model 정보 저장
	mav.setViewName("getRestaurantourList.jsp"); // View 정보 저장
	return mav;
	}
}
