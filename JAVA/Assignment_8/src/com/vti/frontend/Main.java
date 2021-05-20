package com.vti.frontend;

import java.util.HashSet;
import java.util.Set;

//import com.sun.jndi.url.dns.dnsURLContext;
import com.vti.entity.Student;

public class Main {
	public static void main(String[] args) {
		
// Stack : 		
//		Stack<String> dsThiSinh = new Stack<>();
//		
//		dsThiSinh.push(" Nguyen Van Nam");
//		dsThiSinh.push(" Nguyen Van Huyen");
//		dsThiSinh.push(" Tran Van Nam");
//		dsThiSinh.push(" Nguyen Van Thang");
//		
//		System.out.println("Stack = " + dsThiSinh);
//		
//		
//		System.out.println("Pop vut = ");
//		System.out.println(dsThiSinh.pop());
//		System.out.println(dsThiSinh.pop());
//		System.out.println(dsThiSinh.pop());
//		System.out.println(dsThiSinh.pop());

		
// Set :
		
// Question 3:
		
//		Set<Student> Student1 = new HashSet<>();
//		
//		Student1.add( new Student( 1 , " Quang Son"));
//		Student1.add( new Student( 2 , " Tien Log"));
//		Student1.add( new Student( 3 , " Dieu Anh"));
//		
//		for (Student student : Student1) {
//			System.out.println(student.toString());
//		}
		
// Question 4:		
		
//	Set<String> student = new HashSet<>();
//	
//	student.add("Nguyen Van A");
//	student.add("Nguyen Van B");
//	student.add("Nguyen Van C");
//	student.add("Nguyen Van D");
//	student.add("Nguyen Van F");
//	
//	
//	for (String string : student) {
//		System.out.println(string);
//	}
		
//Exercise 3: Generic :
		
//	a) Tạo đối tượng student có id là int	
		
		Student<Integer> Student = new Student<Integer>( 1 , "Quang Son");
		
//	b) Tạo đối tượng student có id là float	
		
		Student<Float> Student1 = new Student<Float>( 2f , "Quang Son2");
		
//	c) Tạo đối tượng student có id là double
		
		Student<Double> student3 = new Student<Double>( 3d , "Quang Son3");
		
		System.out.println(student3);
		
		
		Main main1 = new Main();
		main1.sotutu(1, 2);
		
    }
	
	<A> void sotutu(A a , A b) {
		System.out.println(a);
		System.out.println(b);
	}
}