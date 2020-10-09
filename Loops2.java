package edu.smg;

public class Loops2 {

	public static void main(String[] args) {
		double tuition = 10000;
		int i = 0;
		double sum = 0;
		while (i < 10){
			tuition = tuition + 6.0 / 100 * tuition;
			sum += tuition;
			if (i == 4){System.out.println("The total cost after 4 years is: " + (int)(sum*100)/100.0);}
			i++;
		}
		System.out.println("The tuition after 10 years is: " + (int)(tuition*100)/100.0);
	}

}
