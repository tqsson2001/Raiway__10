import java.sql.Date;

public class Main {
	public static void main(String[] args) {

// 		Question 1 :
		
// Department :		
		
		Department department1 = new Department( 1 , "Tran Quang Son");
		Department department2 = new Department( 2 , "Nguyen Van A");
		Department department3 = new Department( 3 , "Nguyen Thi To");		
		
//		System.out.println("id :" + department1.id + " ; Name :" + department1.name );
//		System.out.println("\n");
//		System.out.println("id :" + department2.id + " ; Name :" + department2.name );	
//		System.out.println("\n");
//		System.out.println("id :" + department3.id + " ; Name :" + department3.name );

		
//		Question 2 :
		
// Account :
		
// Chua biet chuyen` Ngay Thang Nam		
		
		Account account1 = new Account ( 1 , "okok@email.com" , "Son" , "Tran Quang " , "");
		Account account2 = new Account ( 2 , "AAA@email.com" , "Long" , " Hoang Hai " , "");	
		Account account3 = new Account ( 3 , "BBB@email.com" , "Hoang" , " Ngoc Tan " , "");		
		Account[] account4 = { account1 , account2 };
		
//		Account account5 = new Account ( '2000-2-2' ) ;
		
//System.out.println(" id :" + account1.id + "\n Email :" + account1.email + "\n UserName :" + account1.userName + "\n FirstName :" + account1.firstName + "\n FullName : " + account1.fullName);
//System.out.println("\n");
//System.out.println(" id :" + account2.id + "\n Email :" + account2.email + "\n UserName :" + account2.userName + "\n FirstName :" + account2.firstName + "\n FullName : " + account2.fullName);	
//System.out.println("\n");
//System.out.println(" id :" + account3.id + "\n Email :" + account3.email + "\n UserName :" + account3.userName + "\n FirstName :" + account3.firstName + "\n FullName : " + account3.fullName);			

			
// 		Question 3 :
		
		Group group1 = new Group ( 1 , "Van Toan Nguyen" , account4  );
//		System.out.println( " id : " + group1.id + "\n Name : " + group1.name + "\n Account id: " + account4 );
				
//		Group group2 = new Group ( "2002/2/24" );		
//		System.out.println( group2.date ); chua hieu
		

//Exercise 2: Package	:	
		
// 		Question 1 : 
//		Tạo các package có tên như sau:
//			o com.vti.entity
//			o com.vti.frontend
//			o com.vti.backend
//										DONE
	
//		Question 2 : DONE	
		
//Exercise 3: Access Modifier :
		
//		Quesition 1 :
		
		
	}

}
