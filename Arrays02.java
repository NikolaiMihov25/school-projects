package edu.smg;

import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		int max = 10;
		int min = 1;
		int range = max - min + 1;
	int[] myArray = new int[10];
	Scanner in = new Scanner(System.in);
	for(int i = 0; i < 10; i++){
		myArray[i] = in.nextInt();
	}
	int swap;
	int rand;
	for(int i = 0; i < 10; i++){
		rand = (int)(Math.random() * range);
		swap = myArray[i];
		myArray[i] = myArray[rand];
		myArray[rand] = swap;
	
	}
	
	for(int i = 0; i < 10; i++){
		System.out.println(myArray[i]);
	}
	}

}
