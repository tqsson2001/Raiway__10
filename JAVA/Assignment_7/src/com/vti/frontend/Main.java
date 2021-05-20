package com.vti.frontend;

import java.io.File;
import java.io.IOException;

import com.vti.entity.A;

public class Main {
	public static void main(String[] args) throws IOException {
		A a1 = new A(" Son ");
		System.out.println(a1.toString());
		System.out.println( "Tuoi = " + a1.tuoi );
		System.out.println( "Count = " + A.count);
		
		A a2 = new A(" Tuan ");
		System.out.println(a2.toString());
		
		A a3 = new A(" Tu ");
		System.out.println(a3.toString());
		
		System.out.println("------------");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		
//		File file = new File("C:\\User\\pc\\Desktop\\newFile.txt");
//		if (file.createNewFile()) {
//			System.out.println("Thanh Cong");
//		} else {
//			System.out.println("That Bai");
//		}
		
		MainStudent ex1 = new MainStudent();
		ex1.Main_Entity();
		
		
	}
}
