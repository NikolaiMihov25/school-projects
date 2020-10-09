package edu.smg;

import javax.swing.JOptionPane;

public class ColorRange {

	public static void main(String[] args) {
	double input = Double.parseDouble(JOptionPane.showInputDialog(null,
			"Wavelenght", "Type wavelenght:"));
	if (650 <= input && input < 750){System.out.println("The color is Red");}
	else if(590 <= input && input < 620){System.out.println("The color is Orange");}
	else if(570 <= input && input < 590){System.out.println("The color is Yellow");}
	else if(495 <= input && input < 570){System.out.println("The color is Green");}
	else if(450 <= input && input < 495){System.out.println("The color is Blue");}
	else if(380 <= input && input < 450){System.out.println("The color is Violet");}
	else {System.out.println("The entered wavelength is not a part of the visible spectrum");}
	}


}
