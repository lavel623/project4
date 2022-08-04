package com.project4.trip.restaurantour;

import com.project4.trip.restaurantour.impl.RestaurantourDAO;


public class RestaurantourServiceClient {
	public static void main(String[] args) {
		RestaurantourDAO rdao = new RestaurantourDAO();
		
		RestaurantourVO rvo = new RestaurantourVO();
		rvo.setDivision(1);
		rvo.setRegion("테스트 지역");
		rvo.setLocation("테스트 주소");
		rvo.setMarketname("테스트 이름");
		rvo.setExplanation("테스트 설명");
		
		rdao.insertRestaurantour(rvo);
		
		
		
	}
}
