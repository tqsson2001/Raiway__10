package com.vti.testingsytem.frontend;

import com.vti.testingsytem.entity.HighSchool;
import com.vti.testingsytem.entity.Student;

public class Main {
	public static void main(String[] args) {
		
//		Student student1 = new Student ( "Quang Son" , 20 , "Lop 10" );
//		System.out.println( "Ten la : " + student1.getName() + "\nTuoi : " + student1.getAge());
//		System.out.println( student1.lop);
		
		HighSchool highschool1 = new HighSchool( "Quang Son" , 1 , "Lop 10" , "Dai Hoc VTI" );
		System.out.println( "Ten : " + highschool1.getName() + "\nSBD : " + highschool1.getId() + "\nLop May : " + highschool1.getLophoc() + "\nDai Hoc Gi : " + highschool1.getDaihoc()  );
		
	}
}
