package com.project4.trip.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.project4.trip.restaurantour.RestaurantourVO;
import com.project4.trip.restaurantour.impl.RestaurantourDAO;

public class GetRestaurantourListController {
	
	public String handleRequest(HttpServletRequest request,
								HttpServletResponse response) {
		System.out.println("글 목록 검색 처리");
	
	
		RestaurantourVO rvo = new RestaurantourVO();
		RestaurantourDAO rdao = new RestaurantourDAO();
		List<RestaurantourVO> restaurantourList = rdao.getRestaurantourList(rvo);
		
		HttpSession session = request.getSession();
		session.setAttribute("restaurantourList", restaurantourList);
		return "getRestaurantouList";
		}
}
