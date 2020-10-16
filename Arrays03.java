package edu.smg;

import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		Scanner array = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			myArray[i] = array.nextInt();
		}
		int swap = myArray[0];
		for(int i = 1; i < 10 ; i++){
			
			myArray[i - 1] = myArray[i];
		}
		myArray[9] = swap;
		for(int i =0; i<10; i++){System.out.println(myArray[i]);}
		array.close();
	}

}
