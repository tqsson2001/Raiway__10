package src.entity;

public class Manager extends User {
	private int expinYear;
	Project project;

	public Manager(int id, String fullName, String email, String password) {
		super(id, fullName, email, password);

	}

	public Manager(int id, String fullName, String email, String password, int expInYear) {
		super(id, fullName, email, password);
		this.expinYear = expInYear;
	}

	public int getExInYear() {
		return expinYear;
	}

	public void setExInYear(int exInYear) {
		this.expinYear = exInYear;
	}

	@Override
	public String toString() {
		return "Manager [id=" + super.getId() + ",  fullname= " + super.getFullName() + ",  password: ********"
				+ ",  ExpInYear :" + expinYear + "]";
	}

	
}
