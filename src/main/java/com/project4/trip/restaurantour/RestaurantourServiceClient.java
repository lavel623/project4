package com.project4.trip.restaurantour;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class RestaurantourServiceClient {
	public static void main(String[] args) {
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("allicationContext.xml");
		
		RestaurantourService retaurantService = 
				(RestaurantourService) container.getBean("restaurantService");
		
		RestaurantourVO rvo = new RestaurantourVO();
		rvo.set
	}
}
