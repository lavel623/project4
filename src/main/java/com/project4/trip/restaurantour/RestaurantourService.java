package com.project4.trip.restaurantour;

import java.util.List;


public interface RestaurantourService {
	void insertRestaurantour(RestaurantourVO rvo);
	void updateRestaurantour(RestaurantourVO rvo);
	void deleteRestaurantour(RestaurantourVO rvo);
	RestaurantourVO getRestaurantour(RestaurantourVO rvo);
	List<RestaurantourVO> getRestaurantourList(RestaurantourVO rvo);
}
