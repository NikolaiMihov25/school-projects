package edu.smg;

import java.util.Scanner;

public class Loops3 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	int i;
	while(x > 0){
		i = x;
		while(i > 0){
			System.out.print(i);
			i--;
		}
		System.out.print("\n");
		x--;
	}
	}

}
