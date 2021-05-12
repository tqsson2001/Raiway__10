package com.vti.testingsytem.frontend;

import java.util.Iterator;

import com.vti.testingsytem.entity.Group_1;
import com.vti.testingsytem.entity.Group_2;
import com.vti.testingsytem.entity.Group_3;
import com.vti.testingsytem.entity.Student;

public class Main {
	public static void main(String[] args) {
		
// Exercise 2 : Polymorphism
//		Question 1 : Interface Management
		
		Student[] students = new Student[10];
		
		students[0] = new Group_1( 1 , "Student Nguyen Van A " , 1);
		students[1] = new Group_1( 2 , "Student Nguyen Van B " , 1);
		students[2] = new Group_1( 3 , "Student Nguyen Van C " , 1);		
		students[3] = new Group_1( 4 , "Student Nguyen Van D " , 1);
		
		students[4] = new Group_2( 5 , "Student Nguyen Van F " , 2);
		students[5] = new Group_2( 6 , "Student Nguyen Van P " , 2);
		students[6] = new Group_2( 7 , "Student Nguyen Van O " , 2);
		
		students[7] = new Group_3( 8 , "Student Nguyen Van Q " , 3);
		students[8] = new Group_3( 9 , "Student Nguyen Van W " , 3);
		students[9] = new Group_3( 10, "Student Nguyen Van E " , 3);
		
//		b) Kêu gọi cả lớp điểm danh :
		
//		for (Student student : students) {
//			System.out.println(student.getName());
//			student.diemDanh();
//		}
		
//		c) Gọi nhóm 1 đi học bài :
		
//		for (Student student : students) {
//			 if (student instanceof Group_1) {
//				 student.hocBai();
//				 System.out.println(student.getName() + " Group_1 ");
//			}
//		}
		
//		d) Gọi nhóm 2 đi dọn vệ sinh :
		
//		for (Student student : students) {
//			if (student instanceof Group_2) {
//				student.diDonVeSinh();
//			}
//		}
		
	}
}
