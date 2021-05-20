package com.vti.frontend;

import com.vti.entity.Student;

public class MainStudent {

		public void Main_Entity() {
			Student[] stusentArray = new Student[3];
			System.out.println("khởi tạo 3 sinh viên");
			for (int i = 0; i < 3; i++) {
			System.out.println("Sinh viên " + (i + 1 + ":"));
			Student st = new Student();
			stusentArray[i] = st;
		}
			System.out.println("Thông tin các sinh viên vừa nhập: ");
				for (int i = 0; i < stusentArray.length; i++) {
					System.out.println(stusentArray[i]);
			}
			System.out.println("Chuyển các sinh viên sang �?ại h�?c công nghệ:");


			Student.collect = "�?ại h�?c Công nghệ ";
			System.out.println("Thông tin sinh viên sau khi chuyển ");
			for (int i = 0; i < stusentArray.length; i++) {
				System.out.println(stusentArray[i]);
				}
			}

	}



	
