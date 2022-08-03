package com.project4.trip.restaurantour.impl;


import java.util.List;

import com.project4.trip.restaurantour.RestaurantourVO;

public class RestaurantourDAO {
	
	private SqlSession mybatis;
	
	public void insertRestaurantour(RestaurantourVO rvo) {}
	public void updateRestaurantour(RestaurantourVO rvo) {}
	public void deleteRestaurantour(RestaurantourVO rvo) {}
	public RestaurantourVO getRestaurantour (RestaurantourVO restaurantourVO) {
		return restaurantourVO;
	}
	public List<RestaurantourVO> getRestaurantourList (RestaurantourVO restaurantourVO) {
		return List<RestaurantourVO>(restaurantourVO);
	}
}
