package com.selenium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Vehicle vehicle = (Vehicle) context.getBean("veh");
		vehicle.run();
		
		
		//literal injecting
		Bike b = (Bike) context.getBean("veh");
		
		System.out.println(b.getKm());
		
				
	}

}
