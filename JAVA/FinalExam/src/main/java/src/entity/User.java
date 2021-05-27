package src.entity;

public class User {
	private int id;
	private String fullName;
	private String password;
	private String email;

	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.fullName = userName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return fullName;
	}

	public void setUserName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id =" + id + ", userName =" + fullName + ", password =" + password + ", email =" + email + "]";
	}

}
