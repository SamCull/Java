package week14.lab1;

import javax.swing.JFrame;

public class MyColoursDriver { //Change the brightness of the screen

	public static void main(String[] args) {
	
		MyColours myColours = new MyColours("My Colour Buttons"); //title on top
		myColours.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myColours.setSize(500, 400);
		myColours.setVisible(true);
		myColours.setLocation(500,400);

	}//end main

}//end class
