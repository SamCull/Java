package week15.lab1;

import javax.swing.JFrame;
	public class MouseTracker {   //Hover over GUI to display color
		public static void main( String [] args ){
			MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
			mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			mouseTrackerFrame.setSize( 400, 200 );
			mouseTrackerFrame.setVisible( true );
			mouseTrackerFrame.setLocation( 500, 400 );
		} // end main
} // end class