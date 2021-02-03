package personalstuffGUI;

//Demonstrating mouse clicks and distinguishing between mouse buttons
import java .awt.BorderLayout;
import java .awt.event.MouseAdapter;
import java .awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
	public class MouseDetailsFrame extends JFrame{
		private String details ;
		private JLabel statusBar;
		public MouseDetailsFrame(){
			super( "Mouse clicks and buttons" );
			statusBar = new JLabel( "Click the mouse" );
			add( statusBar, BorderLayout.SOUTH );
			addMouseListener( new MouseClickHandler() );
		}
		
		// inner class to handle mouse events
		private class MouseClickHandler extends MouseAdapter {
		// handle mouse-click event and determine which button was pressed
		public void mouseClicked( MouseEvent event ) {
		int xPos = event.getX();
		int yPos = event.getY();
		details = String.format( "Clicked %d time(s)", event.getClickCount() );
		if ( event.isMetaDown())
		details += " with right mouse button";
		else if ( event.isAltDown())
		details += " with center mouse button";
		else
		details += " with left mouse button";
		statusBar. setText( details ); // display message in statusBar
		}
		} // end inner class
		} // end class