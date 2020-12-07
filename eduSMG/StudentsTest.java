package eduSMG;

import java.util.Scanner;

public class StudentsTest {

	public static void main(String[] args) {
		Students[] students = new Students[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			sc.nextLine();
			students[i] = new Students(name, grade);
		}
		
		displayStudentsEligible(students);
	}
	
	public static void displayStudentsEligible(Students[] students) {
		for (Students s : students) {
			if(isStudentEligible(s)) {
				System.out.println(s.getName());
			}
		}
	}
	
	public static boolean isStudentEligible(Students student) {
		return student.getGrade() > 5.50;
	}

}
