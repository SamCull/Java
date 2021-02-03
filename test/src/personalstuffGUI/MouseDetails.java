package personalstuffGUI;

import javax.swing.JFrame;
	public class MouseDetails{ //Records click on screen
		public static void main( String [] args ) {
			MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
			mouseDetailsFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			mouseDetailsFrame.setSize( 400, 150 );
			mouseDetailsFrame. setVisible ( true );
			mouseDetailsFrame.setLocation( 500, 400 );
		} // end main
} // end class

