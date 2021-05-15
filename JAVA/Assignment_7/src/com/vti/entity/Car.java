package com.vti.entity;

public class Car extends Vehicle {

	public static int banhxe;
	
	public Car(String name, String color, String brand) {
		super(name, color, brand);
		banhxe = 4;
	}

	public int getBanhxe() {
		return banhxe;
	}


}
