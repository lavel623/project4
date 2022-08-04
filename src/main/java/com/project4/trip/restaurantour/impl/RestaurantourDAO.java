package com.project4.trip.restaurantour.impl;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project4.trip.restaurantour.RestaurantourVO;

@Repository
public class RestaurantourDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertRestaurantour(RestaurantourVO rvo) {
		System.out.println("insertRes 기능 처리중");
		mybatis.insert("RestaurantourDAO.insertRestaurantour", rvo);
	}
	public void updateRestaurantour(RestaurantourVO rvo) {
		System.out.println("updateRes 기능 처리중");
		mybatis.update("RestaurantourDAO.updateRestaurantour", rvo);
	}
	public void deleteRestaurantour(RestaurantourVO rvo) {
		System.out.println("deleteRes 기능 처리중");
		mybatis.delete("RestaurantourDAO.deleteRestaurantour", rvo);
	}
	public RestaurantourVO getRestaurantour (RestaurantourVO rvo) {
		System.out.println("getRes 기능 처리중");
		return (RestaurantourVO)mybatis.selectOne("RestaurantourDAO.getRestaurantour", rvo);
	}
	public List<RestaurantourVO> getRestaurantourList (RestaurantourVO rvo) {
		System.out.println("getResList 기능 처리중");
		return mybatis.selectList("RestaurantourDAO.getRestautrantourList", rvo);
	}
}
