package com.vti.frontend;

import java.util.Iterator;

import com.vti.entity.Hoc_Sinh;

public class Main_Hoc_Sinh {
	public static void main(String[] args) {
		
		Hoc_Sinh[] students = new Hoc_Sinh[3];
		
		students[0] = new  Hoc_Sinh( 1 , " Tran Quang Son");
		students[1] = new  Hoc_Sinh( 2 , " Do Dieu Anh ");
		students[2] = new  Hoc_Sinh( 3 , " Tran Do  ");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(students[i].toString());
		}
		System.out.println("Doi Chuong dai hoc : \n");
		Hoc_Sinh.college = "Dai Hoc Cong Nghe";
		
		for (int i = 0; i < 3; i++) {
			System.out.println(students[i].toString());
		}
		
	}
}
