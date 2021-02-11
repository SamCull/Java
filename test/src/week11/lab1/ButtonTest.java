package week11.lab1;

import javax.swing.JFrame;
	public class ButtonTest {	//Hover over GUI to display new car
		public static void main( String [] args ) {
			ButtonFrame buttonFrame = new ButtonFrame();
			buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			buttonFrame.setSize( 400,350 ); 
			buttonFrame. setVisible ( true );
			buttonFrame.setLocation( 500, 400 );
		} // end main
} // end class

