package com.vti.entity;

public class MyMath {
// Exercise 2 (Optional): Final : Q1:	
	public final Double Pi = 3.14;
	
	
// Exercise 1: Static:Q3
	public static int max ( int a , int b) {
		if ( a<= b) {
			return b;
		} else {
			return a;
		}
	}
	
	
	public static int min ( int a , int b) {
		if ( a<=b) {
			return b; 
		} else {
			return a;
		}
	}
	
	public static  int sum ( int a , int b) {
		return ( a + b);
	}
}
