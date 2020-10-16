package edu.smg;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
    	String[] desserts = {"Kalina", "Polly", "Juli"};
        String input = (String)JOptionPane.showInputDialog(null, 
        		"Choose a dessert:",
        		"Desserts",
        		-1,
        		null,
        		desserts,
        		desserts[0]);
        System.out.println(input);
        
        
        //Parse the input as an int.
        //Print its value +1
        //System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Input a number:"))+1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}