package eduSMG;

public class Students {
	private String name;
	private double grade;
	
	public Students() {
		
	}
	
	public Students (String name, double grade) {
		this.setName(name);
		this.setGrade(grade);
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
