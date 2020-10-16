package edu.smg;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double height, lenght, width;
		System.out.println("What is the height of the room?");
		height = s.nextInt();
		System.out.println("What is the lenght of the room?");
		lenght = s.nextInt();
		System.out.println("What is the width of the room?");
		width = s.nextInt();
		double areaCeiling = lenght * width;
		double areaWalls = 2 * lenght * height + 2 * width * height;
		double area = areaCeiling + areaWalls;
		area = Math.ceil(area);
		int big, small = 0;
		big = (int)(area / 140);
		small = (int)Math.ceil((area % 140) / 30);
		if (small >= 4){
			big += 1; small = 0;
		}
		System.out.println("You need " + big + " big cans and " + small + " cans. That will cost " + (big*15 + small*4) + " dollars.");
	}

}
