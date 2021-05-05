import java.util.Date;

public class Group {
	int			id;
	String		name;
	Account		account;
	Date		date;
    Account[]	accounts;
    
    public Group ( int id , String name , Account account ) {
    	this.id = id ;
    	this.name = name ;
    	this.account = account ;
    	
    	
    }
}
