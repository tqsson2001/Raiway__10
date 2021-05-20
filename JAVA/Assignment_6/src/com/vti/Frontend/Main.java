package com.vti.Frontend;


import java.util.Iterator;

import com.tvi.Entity.Group1;
import com.tvi.Entity.Group2;
import com.tvi.Entity.Group3;
import com.tvi.Entity.IStudent;
import com.tvi.Entity.Student;


public class Main {
	public static void main(String[] args) {
		
// Exercise 2 : Polymorphism
//		Question 1 : Interface Management

//		A) Tạo 10 h�?c sinh, chia thành 3 nhóm :
		
		Student[] students = new Student[10];
		
		students[0] = new Group1( 1 , "Student Nguyen Van A " , 1);
		students[1] = new Group1( 2 , "Student Nguyen Van B " , 1);
		students[2] = new Group1( 3 , "Student Nguyen Van C " , 1);		
		students[3] = new Group1( 4 , "Student Nguyen Van D " , 1);
		
		students[4] = new Group2( 5 , "Student Nguyen Van F " , 2);
		students[5] = new Group2( 6 , "Student Nguyen Van P " , 2);
		students[6] = new Group2( 7 , "Student Nguyen Van O " , 2);
		
		students[7] = new Group3( 8 , "Student Nguyen Van Q " , 3);
		students[8] = new Group3( 9 , "Student Nguyen Van W " , 3);
		students[9] = new Group3( 10, "Student Nguyen Van E " , 3);
		
		
		
//	@Overload
//		Group_1 student1 = (Group_1) students[1];
//		
//		
//		int trave = student1.sum(10, 20);
//		
//		System.out.println(trave);
// 
//		float trave2 = student1.sum(2.5, 1.8);
//		
//		System.out.println(trave2);
//	
		
		
		
//		B) Kêu g�?i cả lớp điểm danh :
		
//		for (Student student : students) {
//			System.out.println(student.getName());
//			student.diemDanh();
//		}
		
//		C) G�?i nhóm 1 đi h�?c bài :
		
//		for (Student student : students) {
//			 if (student instanceof Group_1) {
//				 student.hocBai();
//				 
//				 System.out.println(student.getName() + " Group_1 ");
//			}
//		}
		
//		D) G�?i nhóm 2 đi d�?n vệ sinh :
		
//		for (Student student : students) {
//			if (student instanceof Group_2) {
//				student.diDonVeSinh();
//			}
//		}
		
//		Question 4 :		
		
//			MyMath mymath = new MyMath ( 1  , " Name ");
//		
//			int trave3 = mymath.sum( 1 , 2);
//			System.out.println(trave3);	
	
		
//		HinhChuNhat hcn = new HinhChuNhat();
//		
//		float chuvihinhchunhat = hcn.Tinhchuvi(5, 7);
//		System.out.println("Chu Vi Hinh Chu Nhat : " + chuvihinhchunhat);
//		
//		System.out.println();
//		
//		float dientichchunhat = hcn.Tinhdientich( 5 , 7);
//		System.out.println("Dien Tich Hinh Chu Nhat : " + dientichchunhat);
//		
//		System.out.println();
//		
//		HinhVuong hv = new HinhVuong();
//		
//		float chuvihinhvuong = hv.Tinhchuvi( 8 , 8 );
//		System.out.println("Chu Vi Hinh Vuong : " + chuvihinhvuong);
//		
//		System.out.println();
//		
//		float dientichhinhvuong = hv.Tinhdientich( 8 , 8 );
//		System.out.println("Dien Tich Hinh Vuong : " + dientichchunhat);
		
	}
}
