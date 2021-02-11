package week15.lab1;

import javax.swing.JFrame;
	public class ComboBoxTest{ //Select between 4 cars using drop down box
		public static void main( String [] args ){
			ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
			comboBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			comboBoxFrame.setSize( 500, 400 );
			comboBoxFrame.setVisible( true );
			comboBoxFrame.setLocation( 500, 400 );
		} // end main
} // end class