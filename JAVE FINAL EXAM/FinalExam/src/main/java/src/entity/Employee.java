package src.entity;

public class Employee extends User {
	private int projectId;
	private String proSkill;
	Project project;
	
	public Employee(int id, String fullName, String email, String password, int projecID) {
		super(id, fullName, email, password);
		this.projectId = projecID;
	}

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	@Override
	public String toString() {
		return "EMPlOYEE [id=" + super.getId() + ",  full name= " + super.getFullName() + ",  password: ********"
				+ ",  ProjectID: " + this.projectId + "]";
	}

	

}
