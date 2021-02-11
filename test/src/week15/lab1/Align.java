package week15.lab1;

import javax.swing.JFrame;

public class Align {

	public static void main(String[] args) {
		
		AlignFrame alignFrame = new AlignFrame();
		
			alignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			alignFrame.setSize(350,150); //350 wide, 150 height
			alignFrame.setLocation(600, 400); //center on screen
			alignFrame.setVisible(true);
				
	}//end main
}//end class
