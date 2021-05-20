package com.vti.frontend;

import com.vti.entity.Car;

public class MainVehicle {
	public static void main(String[] args) {
		Car car1 = new Car ( "CRV" , "BLUE" , "HONDA");
		Car car2 = new Car ( "CRV1" , "BLUE1" , "HONDA1");
		Car car3 = new Car ( "CRV2" , "BLUE2" , "HONDA2");
		Car car4 = new Car ( "CRV3" , "BLUE3" , "HONDA3");
		
		System.out.println(car1.getName());
		System.out.println(car2.getName());
		System.out.println(car1.getColor());
		
		System.out.println(Car.banhxe);
		
		Car.banhxe = 8;
		
		System.out.println(car1.getBanhxe());
		System.out.println(car2.getBanhxe());
	}
}
