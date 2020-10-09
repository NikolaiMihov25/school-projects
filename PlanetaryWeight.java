package edu.smg;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PlanetaryWeight {

	public static void main(String[] args) {
		//double weightOnEarth;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("how much do you weigh?");
//		weightOnEarth = sc.nextDouble();
//		sc.nextLine();
//		sc.close();
		
		double weightOnEarth = Double.parseDouble(JOptionPane.showInputDialog("How much do you weigh?"));
		String [] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String input = (String)JOptionPane.showInputDialog(null, 
				"Choose a planet:", 
				"Planets", 
				2, 
				null, 
				planets, 
				planets[0]);
		if(input.equals("Mercury")){System.out.println("Your weight on Mercury is" + weightOnEarth * 0.38);}
		else if(input.equals("Venus")){System.out.println("Your weight on Venus is" + weightOnEarth * 0.91);}
		else if(input.equals("Mars")){System.out.println("Your weight on Mars is" + weightOnEarth * 0.38);}
		else if(input.equals("Jupiter")){System.out.println("Your weight on Jupiter is" + weightOnEarth * 2.36);}
		else if(input.equals("Saturn")){System.out.println("Your weight on Saturn is" + weightOnEarth * 0.92);}
		else if(input.equals("Uranus")){System.out.println("Your weight on Uranus is" + weightOnEarth * 0.89);}
		else if(input.equals("Neptune")){System.out.println("Your weight on Neptune is" + weightOnEarth * 1.13);}
	}

}
