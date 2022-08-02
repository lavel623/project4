package com.project4.trip.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.project4.trip.restaurantour.RestaurantourVO;
import com.project4.trip.restaurantour.impl.RestaurantourDAO;

public class GetRestaurantourController {
	
	public String handleRequest(HttpServletRequest request,
								HttpServletResponse response) {
		System.out.println("글 상세 조회 처리");
	
		String seq = request.getParameter("seq");
		
		RestaurantourVO rvo = new RestaurantourVO();
		rvo.setSeq(Integer.parseInt(seq));
		
		RestaurantourDAO rdao = new RestaurantourDAO();
		RestaurantourVO restaurantour = rdao.getRestaurantour(rvo);
		
		HttpSession session = request.getSession();
		session.setAttribute("restaurantour", restaurantour);
		return "getRestaurantour";
		}
}
