package edu.smg;

import java.util.Scanner;

public class SmallestInteger {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			array[i] = in.nextInt();
		}
		int min = array[0];
		int min2 = array[1];
		for(int i = 1; i < 5; i++){
			if(array[i] < min){min2 = min; min = array[i];}
			else if(array[i] < min2){min2 = array[i];}
		}
		int sum = min + min2;
		System.out.println(sum);
		in.close();

	}

}
