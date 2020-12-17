package eduSMG;

public class Student extends Person {
	
	public static final int FRESH_MAN = 9;
	public static final int SOPHOMORE = 10;
	public static final int JUNIOR = 11;
	public static final int SENIOR = 12;
	
	private int classStatus;

	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
	
	public Student(String name, String adress, String phoneNumber, String eMailAdress, int classStatus) {
		super( name, adress, phoneNumber, eMailAdress);
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Class status: " + classStatus;
 	}
}

