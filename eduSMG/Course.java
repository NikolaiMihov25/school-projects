package eduSMG;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	Course() {
		
	}
	
	Course(String courseName){
		this.setCourseName(courseName);
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents]=student;
		numberOfStudents++;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String[] getStudents() {
		return students;
	}
}
