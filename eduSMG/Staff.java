package eduSMG;

import java.util.Date;

public class Staff extends Employee {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Staff(
			String name, 
			String adress, 
			String phoneNumber,
			String eMailAdress,
			String office,
			double salary,
			
			String title) {
		super(	name,
				adress,
				phoneNumber,
				eMailAdress,
				office,
				salary
				);
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Title: " + title ; 
	}
}
