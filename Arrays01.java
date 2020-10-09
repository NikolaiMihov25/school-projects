package edu.smg;

public class Arrays01 {

	public static void main(String[] args) {
		int max = 20;
		int min = 1;
		int range = max - min + 1;
		int[] myArray = new int [20];
		for (int i = 0; i < 20; i++){
			myArray[i] =  ((int)(Math.random() * range) + min);
			System.out.println(myArray[i]);
		}
		
	}

}
