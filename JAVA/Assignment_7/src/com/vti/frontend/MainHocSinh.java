package com.vti.frontend;

import java.util.ArrayList;
import java.util.Iterator;

import com.vti.entity.HocSinh;
import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;

public class MainHocSinh {
	public static void main(String[] args) {

// Exercise 1: Static:Q1:	
// Mản Tĩnh cách 2:		
//		ArrayList<HocSinh> listhocsinh = new ArrayList<HocSinh>();
//		
//		HocSinh student1 = new HocSinh( 1 , "QS");
//		HocSinh student2 = new HocSinh( 2 , "DA");
//		HocSinh student3 = new HocSinh( 3 , "DT");
//		
//		listhocsinh.add(student1);
//		listhocsinh.add(student2);
//		listhocsinh.add(student3);
//		System.out.println(listhocsinh);

//Cach 2 dung for:		
//		for (int i = 0; i < listhocsinh.size(); i++) {
//			System.out.println(listhocsinh.get(i));
//		}

//Cach 1 dung for :		
//		for (HocSinh hocSinh : listhocsinh) {
//			System.out.println(hocSinh.toString());
//		}
//		
//		System.out.println("Doi Truong Dai Hoc: \n");
//		HocSinh.college = "Dai Hoc Cong Nghe";
//		
//		for (HocSinh hocSinh : listhocsinh) {
//			System.out.println(hocSinh.toString());
//		}

// Mảng Động cách 2: 		
//		HocSinh[] students = new HocSinh[3];
//	
//		students[0] = new  HocSinh( 1 , " Tran Quang Son");
//		students[1] = new  HocSinh( 2 , " Do Dieu Anh ");
//		students[2] = new  HocSinh( 3 , " Tran Do  ");
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(students[i].toString());
//		}
//		System.out.println("Doi Chuong dai hoc : \n");
//		HocSinh.college = "Dai Hoc Cong Nghe";
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(students[i].toString());
//		} 

// Exercise 1: Static:Q2:		
		ArrayList<HocSinh> listhocsinh = new ArrayList<>();

		HocSinh student1 = new HocSinh(1, "QS");
		HocSinh student2 = new HocSinh(2, "DA");
		HocSinh student3 = new HocSinh(3, "DT");

		listhocsinh.add(student1);
		listhocsinh.add(student2);
		listhocsinh.add(student3);

		System.out.println("Nop Tien Quy:");
		listhocsinh.get(0).setMoney(100);
		listhocsinh.get(1).setMoney(100);
		listhocsinh.get(2).setMoney(100);

		for (HocSinh hocSinh : listhocsinh) {
			System.out.println(hocSinh.toString());
		}
		System.out.println("");
		System.out.println("HS thu 1 lay 50 di mua bim bim:");
		listhocsinh.get(0).settieutien(50);
		System.out.println("Tong Quy:" + (HocSinh.money));
		System.out.println("");
		System.out.println("HS thu 2 lay 20 di mua banh mi");
		listhocsinh.get(1).settieutien(20);
		System.out.println("Tong Quy:" + (HocSinh.money));
		System.out.println("");
		System.out.println("HS thu 3 lay 150 di mua do dung hoc tap");
		listhocsinh.get(2).settieutien(150);
		System.out.println("Tong Quy:" + (HocSinh.money));
		System.out.println("");
		System.out.println("Ca nhom moi nguoi nop 50");
		listhocsinh.get(0).setMoney(50);
		listhocsinh.get(1).setMoney(50);
		listhocsinh.get(2).setMoney(50);
		System.out.println("Tong Quy:" + (HocSinh.money));

// Exercise 1: Static:Q3:		
//		ArrayList<HocSinh> listhocsinh = new ArrayList<>();
//		
//		HocSinh student1 = new HocSinh( 1 , "QS");
//		HocSinh student2 = new HocSinh( 2 , "DA");
//		HocSinh student3 = new HocSinh( 3 , "DT"); 
//		
//		for (int i = 0; i < 3; i++) {
//		System.out.println("Sinh viên " + (i + 1) + ":");}
//		System.out.println("So sinh vien duoc tao ra tren ho thong la :" + HocSinh.COUNT);

// Exercise 1: Static:Q5:		
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Sinh viên " + (i + 1) + ":");
//			HocSinh st1 = new HocSinh( 1 , "QuangSon 1");
//			HocSinh st2 = new HocSinh( 2 , "QuangSon 2");
//			HocSinh st3 = new HocSinh( 3 , "QuangSon 3");
//			
//			System.out.println("Số sinh viên được tạo ra trên hệ thống là: " + HocSinh.COUNT);
//			
//			}

// Exercise 1: Static:Q6:

//		System.out.println("Tao 2 Primary Student: ");
//		PrimaryStudent stt1 = new PrimaryStudent( 1 , "ABS");
//		PrimaryStudent stt2 = new PrimaryStudent( 2 , "ADD");
//		System.out.println("Tao 6 Secondary Student: ");
//		SecondaryStudent stt3 = new SecondaryStudent( 3 , "Alo");
//		SecondaryStudent stt4 = new SecondaryStudent( 4 , "Alo1");
//		SecondaryStudent stt5 = new SecondaryStudent( 5 , "Alo2");
//		SecondaryStudent stt6 = new SecondaryStudent( 6 , "Alo3");
//		SecondaryStudent stt7 = new SecondaryStudent( 7 , "Alo4");
//		SecondaryStudent stt8 = new SecondaryStudent( 8 , "Alo5");
//		
//		System.out.println("Thong Tin So Luong Sinh Vien:");
//		
//		System.out.format("+--------------------+------+%n");
//		System.out.format("|  Category 	     |   SL |%n");
//		System.out.format("+--------------------+------+%n");
//		String leftAlignFormat = "| %-18s | %-4d |%n";
//		System.out.format(leftAlignFormat, "Student", HocSinh.COUNT);
//		System.out.format(leftAlignFormat, "PrimaryStudent", PrimaryStudent.COUNTPrimary);
//
//
//		System.out.format(leftAlignFormat, "SecondaryStudent",
//
//		SecondaryStudent.COUNTSeconday);
//
//		System.out.format("+--------------------+------+%n");

	}
}
