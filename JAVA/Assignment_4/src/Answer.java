
public class Answer {
	int			id;
	String		content;
	Question	question;
	boolean		isCorrect;
	
	// 1 ham khoi tao rong ==> default id = 10,, content = null, question = null, isCorrect = false 
	public Answer() {
		this.id = id ;
		this.content = null;
		this.question = null;
		this.isCorrect = false;
	}
	// 1 ham khoi co 3 tham so la id vs content , question ==> default isCorrect = false
	public Answer ( int id , String content , Question question) {
		this.id = id ;
		this.content = content;
		this.question = question;
		this.isCorrect = false;	
	}
	
	// 1 ham khao tao co 4 tham so 
	public Answer ( int id , String content , Question question , boolean isCorrect) {
		this.id = id ;
		this.content = content;
		this.question = question;
		this.isCorrect = true;	
		
	}
	
	
	
	
}
