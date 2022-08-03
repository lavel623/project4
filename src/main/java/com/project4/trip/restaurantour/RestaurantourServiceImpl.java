package com.project4.trip.restaurantour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project4.trip.restaurantour.impl.RestaurantourDAO;


public class RestaurantourServiceImpl {
	@Autowired
	private RestaurantourDAO rdao;
	
	public void insertRestaurantour(RestaurantourVO rvo) {
		rdao.insertRestaurantour(rvo);
	}
	
	public void updateRestaurantour(RestaurantourVO rvo) {
		rdao.updateRestaurantour(rvo);
	}
	
	public void deleteRestaurantour(RestaurantourVO rvo) {
		rdao.deleteRestaurantour(rvo);
	}
	
	public RestaurantourVO getRestaurantour(RestaurantourVO rvo) {
		return rdao.getRestaurantour(rvo);
	}
	
	public List<RestaurantourVO> getRestaurantourList(RestaurantourVO rvo) {
		return rdao.getRestaurantourList(rvo);
	}
}
