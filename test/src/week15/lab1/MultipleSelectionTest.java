package week15.lab1;

import javax.swing.JFrame;
public class MultipleSelectionTest { //Copy and paste name of color onto other side of text box
	public static void main( String [] args ){
		MultipleSelectionFrame multipleSelectionFrame = new MultipleSelectionFrame();
		multipleSelectionFrame . setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );
		multipleSelectionFrame . setSize ( 350, 150 );
		multipleSelectionFrame . setVisible ( true );
		multipleSelectionFrame . setLocation ( 500, 400 );
	} // end main
} // end class