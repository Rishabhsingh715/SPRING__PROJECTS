package com.selenium;

public class Bike implements Vehicle {
    
	private int km;
	
	
	public void setKm(int km) {
		this.km = km;
	}


	public int getKm() {
		return km;
	}


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Bike is running");
	}
	

}
