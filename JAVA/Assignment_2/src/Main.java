
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;


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
		position1.name				= "DEV" ;
		
		Position position2			= new Position() ;
		position2.id 				= 2;
		position2.name				="Test";
		
		Position position3			= new Position() ;
		position3.id 				= 3;
		position3.name				="Enum.Scrum_Master";
		
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
		question1.Content		="C????u h???????i v??????? Java";
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
  
// Exercise 1 (Optional): Flow Control
        
// Question 1 :         
//        if (account2 == null) {System.out.println("Nhan vien nay chua co phong ban");}
//        else {System.out.println("Phong ban cua nhan vien nay la :" + account2.department.name );}
        
// Question 2 :
//         if (group1.accounts == null) {System.out.println("Nhom nay khong co nhan vien");}
//         
//         else if (group1.accounts.length == 1 || group1.accounts.length == 2)
//         {for (Account account : GroupAccount ) {System.out.println("T??n L?? :" + account.fullName);}} 
//         
//         else if (group1.accounts.length == 3)
//         {System.out.println("Nhom nay rat quan trong");}
//         
//         else if (group1.accounts.length == 4)
//         {System.out.println(" Nhom nay la cai cho ");}
 
        
// Question 3 :
//        	System.out.println(account2.department == null ? "Nhan vien chua co phong ban" : "Phong ban cua nhan vien nay la : " + account2.department.name);

        
// Question 4 :
        	
//        	System.out.println(account1.position.name == "DEV" ? "Day la Developer" : "Nguoi nay khong phai Developer");

        
// SWITCH CASE   
// Question 5 :
//        System.out.println(" So luong account trong nhom 1");
//        
//        if (group1.accounts == null) { System.out.println("Group chua co thanh vien nao tham gia");}
//        
//		 int accountingrount = group1.accounts.length;       
//         switch (accountingrount) {
//        		
//        		case 1: System.out.println("Nhom co 1 nhan vien");
//        		break;
//        		
//        		case 2: System.out.println("Nhom co 2 nhan vien");
//        		break;
//        		
//        		case 3: System.out.println("Nhom co 3 nhan vien");
//        		break;
//        		
//        		default: System.out.println("Nhom co nhieu nhan vien");}
			
// Question 6:    
//         System.out.println("So luong nhan vien trong nhom 1");
//         
//         if (group1.accounts == null) System.out.println(" Phong nay khong co nhan vien ");
//         
//         int accgroup1 = group1.accounts.length;
//         	switch (accgroup1) {
//         	
//         	case 1 : System.out.println("Phong nay co 1 nhan vien");
//         	break;
//         	
//         	case 2 : System.out.println("Phong nay co 2 nhan vien");
//         	break;
//         	
//         	case 3 : System.out.println("Phong nay co 3 nhan vien");
//         	break;
//         	
//         	default : System.out.println("Phong nay co rat nhieu nhan vien");}         	
         	
// Question 7:
//        System.out.println("Cau hoi nay co nhung the loai nao :");
//        
//        if (categoryquestion4.name == null ) System.out.println("Cau hoi nay khong co the loai nao");
//        
//        int  catequestion = categoryquestion4.questions.length;
//        	switch (catequestion) {
//        	
//        	case 1 : System.out.println("Cau hoi nay co 1 the loai ");
//        	break;
//        	
//        	case 2 : System.out.println("Cau hoi nay co 2 the loai");
//        	break;
//        	
//        	case 3 : System.out.println("Cau hoi nay co 3 the loai");
//        	break;
//        	
//        	default : System.out.println("Cau hoi nay co nhieu the loai");}
//        		                	        	        	                    
// Question 8:
//        
//        System.out.println("In ra thong tin Account :");
//        
//        Account[] Array = { account1, account2, account3 , account4 , account5 };
//        for (Account account : Array) {
//        System.out.println("AccountID: " + account.id + "\n" + " Email: " +  account.email + "\n" + "  Name: " + account.fullName);}
        
// Exercise 2 (Optional): System out printf :
// Question 1:        
//        System.out.printf( "%s %d" , "1 So nguyen =" , 5 );
     
// Question 2:       
//        System.out.printf(Locale.US, "%s  %,d" ,"1 So nguyen =" , 100000000);	

        

        
        
// Exercise 3 (Optional): Date Format :
// Question 1:        
//        System.out.println(exam1.createDate);
//        
//        Locale locale = new Locale("vi" , "VN");
//        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//        
//        String date1 = dateformat.format(exam1.createDate);	
//        System.out.println(date1);
        
        
// Date pattern  :      
//        System.out.println(exam1.createDate);
//        
//		  String pattern = "dd/MM/yyyy HH:mm:ss";
//		  SimpleDateFormat simpledateformat	= new SimpleDateFormat(pattern);        
//        
//		  String date2 = simpledateformat.format(exam1.createDate);	
//		  System.out.println(date2);
                             
        
	}	
	
}
