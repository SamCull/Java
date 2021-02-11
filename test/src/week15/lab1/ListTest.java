package week15.lab1;

import javax.swing.JFrame;
	public class ListTest {		//Select a color to change screen
		public static void main( String [] args ){
			ListFrame listFrame = new ListFrame();
			listFrame . setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
			listFrame . setSize ( 350, 150 );
			listFrame . setVisible ( true );
			listFrame . setLocation ( 500, 400 );
		} // end main
} // end class ListTest