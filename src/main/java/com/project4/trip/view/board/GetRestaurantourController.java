package com.project4.trip.view.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project4.trip.restaurantour.RestaurantourService;
import com.project4.trip.restaurantour.RestaurantourVO;
import com.project4.trip.restaurantour.impl.RestaurantourDAO;

@Controller
public class GetRestaurantourController {
	
	@Autowired
	private RestaurantourService restaurantourService;
	
	// 명소/맛집 등록
	@RequestMapping("/insertRestaurantour.do")
	public String insertRestaurantour(RestaurantourVO rvo) {
		restaurantourService.insertRestaurantour(rvo);
		return "/jsp/getRestaurantourList.do";
	}
	
	// 명소/맛집 수정
	@RequestMapping("/updateRestaurantour.do")
	public String updateRestaurantour(RestaurantourVO rvo) {
		restaurantourService.updateRestaurantour(rvo);
		return "/jsp/getRestaurantourList.do";
	}
	
	// 명소/맛집 삭제
	@RequestMapping("/deleteRestaurantour.do")
	public String deleteRestaurantour(RestaurantourVO rvo) {
		restaurantourService.deleteRestaurantour(rvo);
		return "/jsp/getRestaurantourList.do";
	}
	
	// 명소/맛집 상세 조회
	@RequestMapping("/getRestaurantour.do")
	public String getRestaurantour(RestaurantourVO rvo, Model model) {
		model.addAttribute("restaurantour", restaurantourService.getRestaurantour(rvo));
		return "/jsp/getRestaurantour.jsp";
	}
	
	@RequestMapping("/getRestaurantourList.do")
	public String getRestaurantourList(RestaurantourVO rvo,Model model) {
		model.addAttribute("restaurantourList", restaurantourService.getRestaurantourList(rvo));
		return "/jsp/getRestaurantourList.jsp";
	}
}
