package week14.lab1;

import javax.swing.JFrame;

public class ChangeColourDriver { //Change the brightness of the screen

	public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(500, 400);
		changeColour.setVisible(true);
		changeColour.setLocation(500,400);

	}//end main

}//end class
