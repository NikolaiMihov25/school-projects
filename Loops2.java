package edu.smg;

public class Loops2 {

	public static void main(String[] args) {
		double tuition = 10000;
		for(int i = 0; i < 10; i++){
			tuition = 106.0/100*tuition;
		}
		System.out.println("The tuition cost after 10 years is " + (int)(100*tuition)/100.0 + " dollars.");
		double sum = tuition;
		for(int i = 1; i < 4; i++){
			tuition += 6.0/100*tuition;
			sum += tuition;
		}
		System.out.println("The total sum for 4 years is " + (int)(100*sum)/ 100.0 + " dollars.");
	}

}
