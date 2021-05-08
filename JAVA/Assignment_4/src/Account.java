import java.util.Date;

public class Account {
	int			id;
	String		email;
	String		userName;
	String		firstName;
	String		fullName;
	Department	department;
	Position	position;
	Date		createDate;
	
	public Account ( int id , String email , String userName , String firstName , String fullName) {
		this.id = id ;
		this.email = email ;
		this.userName = userName ; 
		this.firstName = firstName ;
		this.fullName = firstName + userName ;	}	
		
	public Account ( Date createDate ) {
		this.createDate = createDate;
	}	
}
