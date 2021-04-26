import java.util.Date;

public class Main {
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
		Position position1			= new Position() ;
		position1.id 				= 1;
		position1.name				="DEV";
		
		Position position2			= new Position() ;
		position2.id 				= 2;
		position2.name				="Test";
		
		Position position3			= new Position() ;
		position3.id 				= 3;
		position3.name				="Scrum Master";
		
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
		question1.Content		="Câu hỏi về Java";
		question1.creatorDate	= new Date ("2020/04/05");
		
		
		Question question2 		= new Question() ;
		question2.id			= 2 ;
		question2.Content		="Câu Hỏi về PHP";
		question2.creatorDate	= new Date ("2020/04/05");
		
		
		Question question3 		= new Question() ;
		question3.id			= 3 ;
		question3.Content		="Hỏi về C#";
		question3.creatorDate	= new Date ("2020/04/06");
		
		
		Question question4 		= new Question() ;
		question4.id			= 4 ;
		question4.Content		="Hỏi về Ruby";
		question4.creatorDate	= new Date ("2020/04/06");

		
		Question question5 		= new Question() ;
		question5.id			= 5 ;
		question5.Content		="Hỏi về Postman";
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
		answer1.content			="Trả lời 01" ;
		answer1.question		= question1 ;
		
		
		Answer answer2			= new Answer () ;
		answer2.id				= 2;
		answer2.content			="Trả lời 02" ;
		answer2.question		= question2 ;
		
		
		Answer answer3			= new Answer () ;
		answer3.id				= 3;
		answer3.content			="Trả lời 03" ;
		answer3.question		= question3 ;
		
		
		Answer answer4			= new Answer () ;
		answer4.id				= 4;
		answer4.content			="Trả lời 04" ;
		answer4.question		= question4 ;
		
		
		Answer answer5			= new Answer () ;
		answer5.id				= 5;
		answer5.content			="Trả lời 05" ;
		answer5.question		= question5 ;
		
// create Exam
		Exam exam1				= new Exam() ;
		exam1.id				= 1;
		exam1.code				= "VTIQ001";
		exam1.title				= "Đề thi C#";
		exam1.createDate		= new Date("2019/04/05");		
		
		
		Exam exam2				= new Exam() ;
		exam2.id				= 2;
		exam2.code				= "VTIQ002";
		exam2.title				= "Đề thi PHP";
		exam2.createDate		= new Date("2019/04/05");		
		
		
		Exam exam3				= new Exam() ;
		exam3.id				= 3;
		exam3.code				= "VTIQ003";
		exam3.title				= "Đề thi C++";
		exam3.createDate		= new Date("2019/04/07");		
		
		
		Exam exam4				= new Exam() ;
		exam4.id				= 4;
		exam4.code				= "VTIQ004";
		exam4.title				= "Đề thi Java";;
		exam4.createDate		= new Date("2019/04/08");		
		
		
		Exam exam5				= new Exam() ;
		exam5.id				= 5;
		exam5.code				= "VTIQ005";
		exam5.title				= "Đề thi Ruby";
		exam5.createDate		= new Date("2019/04/10");	
		
// 	ExamQuestion	
        Exam[] ExamQuestion 	= { exam2 , exam3 , exam4   } ;
        question4.exams			= ExamQuestion ;
        	
        Exam[] ExamQuestion1	= { exam1 , exam5    } ;
        question5.exams			= ExamQuestion1 ;
        
		System.out.println("Thông tin phòng ban 1 ");
        System.out.println("name : " + department1.name);
        System.out.println("ID : " + department1.id);
        System.out.println("\n");
        
        System.out.println("Thông tin phòng ban 2 ");
        System.out.println("name : " + department2.name);
        System.out.println("ID : " + department2.id);
        System.out.println("\n");
        
        System.out.println("Thông tin account 1");
        System.out.println("id :" 		+ account1.id);
        System.out.println("Email :" 	+ account1.email );
        System.out.println("UserName :" + account1.userName);
        System.out.println("FullName :" + account1.fullName);
        System.out.println("Department Name :" + account1.department.name);
        System.out.println("Position Name :" + account1.position.name);
        System.out.println("Date :" + account1.createDate);
        System.out.println("\n");
        
        System.out.println("Thông tin account 3");
        System.out.println("id :" 		+ account3.id);
        System.out.println("Email :" 	+ account3.email );
        System.out.println("UserName :" + account3.userName);
        System.out.println("FullName :" + account3.fullName);
        System.out.println("Department Name :" + account3.department.name);
        System.out.println("Position Name :" + account3.position.name);
        System.out.println("Date :" + account3.createDate);
	}
	 
	
	
	
	
	
}
