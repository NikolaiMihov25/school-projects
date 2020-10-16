package edu.smg;

import java.util.Scanner;

public class TransMatrix {

	public static void main(String[] args) {
		Scanner trans = new Scanner(System.in);
		int[][] array = new int[2][4];
		int[][] array2 = new int[4][2];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 4; j++){
				array[i][j] = trans.nextInt();
			}
		}
		//printing initial array
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(array[i][j]);
			} 
			System.out.println();
		}
		//transponing
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 4; j++){
				array2[j][i] = array[i][j];
			}
		}
		
	//printing trasponed matrix
		for(int j = 0; j < 4; j++){
			for(int i = 0; i < 2; i++){
				System.out.print(array2[j][i] + " ");
			}
			System.out.println();
		}
		trans.close();
	}

}
