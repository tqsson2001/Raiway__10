import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
//	enum Enum { DEV , Test , Scrum_Master , PM  }
	
	public static void main(String[] args) {

// create Department		
		Department department1 		= new Department() ;
		department1.id 				= 1;
		department1.name 			= "Marketting";
		
		Department department2 		= new Department() ;
		department2.id 				= 2;
		department2.name			= "Sale";
		
		Department department3		= new Department() ;
		department3.id				= 3;
		department3.name			= "Bao ve";
		
		Department department4  	= new Department() ;
		department4.id				= 4;
		department4.name 			= "Nhan su";
		
		Department department5 	 	= new Department() ;
		department5.id				= 5;
		department5.name 			= "Ky thuat";
		

// create Position
		
//		Enum A = Enum.DEV;
//		Enum B = Enum.Test;
//		Enum C = Enum.Scrum_Master;
//		Enum D = Enum.PM;
		
		Position position1			= new Position() ;
		position1.id 				= 1;
		position1.name				="DEV";
		
		Position position2			= new Position() ;
		position2.id 				= 2;
		position2.name				="Test";
		
		Position position3			= new Position() ;
		position3.id 				= 3;
		position3.name				="Scrum_Master";
		
		Position position4			= new Position() ;
		position4.id 				= 4;
		position4.name				="PM";

// create Account
		Account account1			= new Account() ;
		account1.id					= 1;
		account1.email				= "haidang29productions@gmail.com" ;
		account1.userName			= "black";
		account1.fullName			= "dangblack";
		account1.department			= department5 ;
		account1.position			= position1 ;
		account1.createDate			= new Date ("2020/03/05");
		
		
		Account account2			= new Account() ;
		account2.id					= 2;
		account2.email				= "account1@gmail.com" ;
		account2.userName			= "anh";
		account2.fullName			= "quanganh";
		account2.department			= department1 ;
		account2.position			= position3 ;
		account2.createDate			= new Date("2020/03/05");
		
		
		Account account3			= new Account() ;
		account3.id					= 3;
		account3.email				= "account2@gmail.com" ;
		account3.userName			= "chien";
		account3.fullName			= "vanchien";
		account3.department			= department1 ;
		account3.position			= position3 ;
		account3.createDate			= new Date("2020/03/07");
		
		
		Account account4			= new Account() ;
		account4.id					= 4;
		account4.email				= "account3@gmail.com" ;
		account4.userName			="coco";
		account4.fullName			="cocoduongqua";
		account4.department			= department3 ;
		account4.position			= position4 ;
		account4.createDate			= new Date("2020/08/03");
		
		
		Account account5			= new Account() ;
		account5.id					= 5;
		account5.email				= "account4@gmail.com" ;
		account5.userName			="caubai";
		account5.fullName			="doccocaubai";
		account5.department			= department3 ;
		account5.position			= position4 ;
		account5.createDate			= new Date("2020/03/10");

// create Group
		Group group1				= new Group() ;
		group1.id					= 1 ;
		group1.name					="Testing System";
		group1.account				= account5;
		group1.date					= new Date ("2019/03/05");
		Account[] GroupAccount		= { account1 , account2 };
		group1.accounts				= GroupAccount ;
		
		
		Group group2				= new Group() ;
		group2.id					= 2 ;
		group2.name					="VTI Development";
		group2.account				= account5;
		group2.date					= new Date ("2020/03/07");
		
		
		Group group3				= new Group() ;
		group3.id					= 3 ;
		group3.name					="VTI Sale01";
		group3.account				= account4;
		group3.date					= new Date ("2020/03/09");
		Account[] GroupAccount1		= { account3 , account4  } ;
		group3.accounts				= GroupAccount1 ;
		
		Group group4				= new Group() ;
		group4.id					= 4 ;
		group4.name					="VTI Sale02";
		group4.account				= account4;
		group4.date					= new Date ("2020/03/10");
		
		
		Group group5				= new Group() ;
		group5.id					= 5 ;
		group5.name					="VTI Sale03";
		group5.account				= account1;
		group5.date					= new Date ("2020/03/28");
		Account[] GroupAccount2		= { account4 , account5  } ;
		group5.accounts				= GroupAccount2;

// create TypeQuestion
		TypeQuestion typequestion1	= new TypeQuestion();
		typequestion1.id			= 1;
		typequestion1.name			="Essay";
		
		
		TypeQuestion typequestion2	= new TypeQuestion();
		typequestion2.id			= 2	;
		typequestion2.name			="Multiple-Choice";
		
		
// create Question		
		Question question1 		= new Question() ;
		question1.id			= 1 ;
		question1.Content		="Cau hoi ve Java";
		question1.creatorDate	= new Date ("2020/04/05");
		
		
		Question question2 		= new Question() ;
		question2.id			= 2 ;
		question2.Content		="Cau Hoi ve PHP";
		question2.creatorDate	= new Date ("2020/04/05");
		
		
		Question question3 		= new Question() ;
		question3.id			= 3 ;
		question3.Content		="Cau Hoi ve C#";
		question3.creatorDate	= new Date ("2020/04/06");
		
		
		Question question4 		= new Question() ;
		question4.id			= 4 ;
		question4.Content		="Cau Hoi ve Ruby";
		question4.creatorDate	= new Date ("2020/04/06");

		
		Question question5 		= new Question() ;
		question5.id			= 5 ;
		question5.Content		="Cau Hoi ve Postman";
		question5.creatorDate	= new Date ("2020/04/06");
		
// create CategoryQuestion
		CategoryQuestion categoryquestion1 	= new CategoryQuestion() ;
		categoryquestion1.id 				= 1;
		categoryquestion1.name				="Java";
		Question[] 	categoryquestion7 		= { question2 , question5  } ;
		categoryquestion1.questions			= categoryquestion7 ;
				
		CategoryQuestion categoryquestion2 	= new CategoryQuestion() ;
		categoryquestion2.id 				= 2;
		categoryquestion2.name				="ASP.NET";
				
				
		CategoryQuestion categoryquestion3 	= new CategoryQuestion() ;
		categoryquestion3.id 				= 3;
		categoryquestion3.name				="ADO.NET";
				
				
		CategoryQuestion categoryquestion4 	= new CategoryQuestion() ;
		categoryquestion4.id 				= 4;
		categoryquestion4.name				="SQL";
		Question[]	categoryquestion6		= { question1 , question3 , question4   } ;	
		categoryquestion4.questions  		= categoryquestion6 ;
				
		CategoryQuestion categoryquestion5 	= new CategoryQuestion() ;
		categoryquestion5.id 				= 5;
		categoryquestion5.name				="Postman";
						
// create Answer
		Answer answer1			= new Answer () ;
		answer1.id				= 1;
		answer1.content			="Tra Loi 01" ;
		answer1.question		= question1 ;
		
		
		Answer answer2			= new Answer () ;
		answer2.id				= 2;
		answer2.content			="Tra Loi 02" ;
		answer2.question		= question2 ;
		
		
		Answer answer3			= new Answer () ;
		answer3.id				= 3;
		answer3.content			="Tra Loi 03" ;
		answer3.question		= question3 ;
		
		
		Answer answer4			= new Answer () ;
		answer4.id				= 4;
		answer4.content			="Tra Loi 04" ;
		answer4.question		= question4 ;
		
		
		Answer answer5			= new Answer () ;
		answer5.id				= 5;
		answer5.content			="Tra Loi 05" ;
		answer5.question		= question5 ;
		
// create Exam
		Exam exam1				= new Exam() ;
		exam1.id				= 1;
		exam1.code				= "VTIQ001";
		exam1.title				= "De Thi C#";
		exam1.createDate		= new Date("2019/04/05");		
		
		
		Exam exam2				= new Exam() ;
		exam2.id				= 2;
		exam2.code				= "VTIQ002";
		exam2.title				= "De Thi PHP";
		exam2.createDate		= new Date("2019/04/05");		
		
		
		Exam exam3				= new Exam() ;
		exam3.id				= 3;
		exam3.code				= "VTIQ003";
		exam3.title				= "De Thi C++";
		exam3.createDate		= new Date("2019/04/07");		
		
		
		Exam exam4				= new Exam() ;
		exam4.id				= 4;
		exam4.code				= "VTIQ004";
		exam4.title				= "De Thi Java";;
		exam4.createDate		= new Date("2019/04/08");		
		
		
		Exam exam5				= new Exam() ;
		exam5.id				= 5;
		exam5.code				= "VTIQ005";
		exam5.title				= "De Thi Ruby";
		exam5.createDate		= new Date("2019/04/10");	
		
// 	ExamQuestion	
        Exam[] ExamQuestion 	= { exam2 , exam3 , exam4   } ;
        question4.exams			= ExamQuestion ;
        	
        Exam[] ExamQuestion1	= { exam1 , exam5    } ;
        question5.exams			= ExamQuestion1 ;
        
//Exercise (Optional) : Datatype Casting :
// Question 1:        
//        float luonga1 = 5240.5f;
//        float luonga2 = 10970.055f;
//        
//        int luonga3 = (int) luonga1;
//        int luonga4 = (int) luonga2;
//       
//			System.out.println("La :" + luonga3);
//        
//			System.out.println("La :" + luonga4);
        
// Question 2: L???y ng???u nhi??n 1 s??? c?? 5 ch??? s??? (nh???ng s??? d?????i 5 ch??? s??? th?? s??? th??m c?? s??? 0 ??? ?????u cho ????? 5 ch??? s???)
//        int a = new Random().nextInt(99999);
//        String temp = "" + a;
//        
//        switch(temp.length()) {
//        	
//        case 1:
//        	System.out.println("a = 0000"  + a );
//        	break;
//        case 2:
//        	System.out.println("a = 000" + a);
//        	break;
//        case 3:
//        	System.out.println("a = 00" + a);
//        	break;
//        case 4:
//        	System.out.println("a = 0" + a);
//        	break;
//        default: 
//        	System.out.println("a = " + a);
//        }
        
// Question 3: L???y 2 s??? cu???i c???a s??? ??? Question 2 v?? in ra.        		
//        int a = new Random().nextInt(99999);
//        String temp = "" + a;
//      
//        System.out.println("Hai s??? cu???i: " + temp.substring(3));
//        System.out.println("a = " + a);
        		       		
//    Question 4 : Vi???t 1 method nh???p v??o 2 s??? nguy??n a v?? b v?? tr??? v??? th????ng c???a ch??ng.
     
//    int a;
//    int b;
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Nh???p a = ");
//    a = scanner.nextInt();
//    do {
//    System.out.println("Nh???p b = ");
//    b = scanner.nextInt();
//    if (b == 0) {
//    System.out.println("Vui l??ng nh???p b kh??c 0 !");
//    }
//    } while (b == 0);
//    scanner.close();
//    System.out.println("Th????ng: " + (float) a /  b);
    
        
        
//        Exercise 2 (Optional): Default value
        
//        System.out.println("Kh???i t???o m???ng JAVA2 g???m 5 ph???n t??? s??? d???ng For");
//
//
//        		JAVA2[] AVA2 = new JAVA2[5];
//        		for (int i = 0; i < AVA2.length; i++) {
//        		JAVA2 AV = new JAVA2();
//        		AV.email = "Email " + i;
//        		AV.userName = "User name " + i;
//        		AV.fullName = "Full name " + i;
//        		AV.createDate = LocalDate.now();
//        		AVA2[i] = AV;
//		System.out.println( "Th??ng tin Account " + i + " Email: " + AVA2[i].email + " UserName: " + AVA2[i].userName 
//		+ " FullName: " + AVA2[i].fullName + " CreateDate: " + AVA2[i].createDate);}

//        Exercise 3(Optional): Boxing & Unboxing
        
//        Question 1: Kh???i t???o l????ng c?? datatype l?? Integer c?? gi?? tr??? b???ng 5000.

//        Integer salary = 5000;
//        System.out.printf("%2.2f", (float) salary);
        
//        Question 2: Khai b??o 1 String c?? value = "1234567"      
        
//        String s = "1234567";
//        int i = Integer.parseInt(s);
//        System.out.println(i);
        
//        Question 3: Kh???i t???o 1 s??? Integer c?? value l?? ch??? "1234567"
        
//        Integer i = 1234567;
//        int i1 = i.intValue();
//        System.out.println(i1);
        
//        Exercise 4: String
	}	
	
	
}
