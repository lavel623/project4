package com.project4.trip.restaurantour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project4.trip.restaurantour.impl.RestaurantourDAO;


public class RestaurantourServiceImpl {
	@Autowired
	private RestaurantourDAO restaurantourDAO;
	
	public void insertRestaurantour(RestaurantourVO rvo) {
		restaurantourDAO.insertRestaurantour();
	}
	
	public void updateRestaurantour(RestaurantourVO rvo) {
		restaurantourDAO.updateRestaurantour();
	}
	
	public void deleteRestaurantour(RestaurantourVO rvo) {
		restaurantourDAO.deleteRestaurantour();
	}
	
	public RestaurantourVO getRestaurantour(RestaurantourVO rvo) {
		return restaurantourDAO.getRestaurantour(rvo);
	}
	
	public List<RestaurantourVO> getRestaurantourList(RestaurantourVO rvo) {
		return restaurantourDAO.getRestaurantourList();
	}
}
