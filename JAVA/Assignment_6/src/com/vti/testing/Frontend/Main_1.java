package com.vti.testing.Frontend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_1 {
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
			
		} finally {
			scanner.close();
		}
		
		System.out.println("Thuc Hien Buoc Tiep Theo:");
	}
	
	public static float chia ( int a , int b) {
		return (float) ( a / b);
	}
	}
