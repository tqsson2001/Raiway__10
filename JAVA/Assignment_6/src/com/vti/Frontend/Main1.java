package com.vti.Frontend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
			
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("Dien Tuoi Cua Ban Vao:");
			int age = scanner.nextInt();
			
			System.out.println("Tuoi Cua Ban La:" + age);
			
			float resu = chia(10 , age);
			System.out.println("Ket Qua Chia la:" + resu);
			
		} catch (InputMismatchException e) {
			System.out.println("Sai Tuoi !");
			
		} catch (ArithmeticException e) {
			System.out.println("Sai vi chia cho 0 !");
			
		} catch (Exception e) {
			System.out.println("Error !");
			
		} finally {
			scanner.close();
			System.out.println("Finally !");
		}
		
		System.out.println("Thuc Hien Buoc Tiep Theo:");
	}	
		
		checkage(19);
		
		}	
//	public static float chia ( int a , int b) {
//		return (float) ( a / b);
//	}
	
	
	public static void checkage ( int age) {
		if ( age < 18 ) {
			System.out.println( " Chua Du Tuoi ");
		} else {
			System.out.println("Da Du Tuoi");
		}
	}
}

	
