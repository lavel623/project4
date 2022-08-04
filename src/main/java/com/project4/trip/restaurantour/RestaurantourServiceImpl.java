package com.project4.trip.restaurantour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project4.trip.restaurantour.impl.RestaurantourDAO;

@Service("restaurantourService")
public class RestaurantourServiceImpl implements RestaurantourService {
	@Autowired
	private RestaurantourDAO rdao;
	
	@Override
	public void insertRestaurantour(RestaurantourVO rvo) {
		rdao.insertRestaurantour(rvo);
	}
	
	@Override
	public void updateRestaurantour(RestaurantourVO rvo) {
		rdao.updateRestaurantour(rvo);
	}
	
	@Override
	public void deleteRestaurantour(RestaurantourVO rvo) {
		rdao.deleteRestaurantour(rvo);
	}
	
	@Override
	public RestaurantourVO getRestaurantour(RestaurantourVO rvo) {
		return rdao.getRestaurantour(rvo);
	}
	
	@Override
	public List<RestaurantourVO> getRestaurantourList(RestaurantourVO rvo) {
		return rdao.getRestaurantourList(rvo);
	}
}
