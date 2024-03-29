package week15.lab1;

//Demonstrating mouse events
import java .awt.Color;
import java .awt.BorderLayout;
import java .awt.event.MouseListener;
import java .awt.event.MouseMotionListener;
import java .awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	public class MouseTrackerFrame extends JFrame{
		private JPanel mousePanel;
		private JLabel statusBar;
		public MouseTrackerFrame() {
			super( "Demonstrating Mouse Events" );
			mousePanel = new JPanel();
			mousePanel.setBackground( Color.WHITE );
			add( mousePanel, BorderLayout.CENTER );
			statusBar = new JLabel( "Mouse outside JPanel" );
			add( statusBar, BorderLayout.SOUTH );
			
			// create and register listener for mouse and mouse motion events
			MouseHandler handler = new MouseHandler();
			mousePanel.addMouseListener( handler );
			mousePanel.addMouseMotionListener( handler );
			}
			private class MouseHandler implements MouseListener,
			MouseMotionListener{
			// MouseListener event handlers
			// handle event when mouse released immediately after press
			public void mouseClicked( MouseEvent event ) {
			statusBar. setText( String . format( "Clicked at [%d, %d]",
			event.getX(), event.getY() ));
			}
			// handle event when mouse pressed
			public void mousePressed( MouseEvent event ) {
			statusBar. setText( String . format( "Pressed at [%d, %d]",
			event.getX(), event.getY() ));
			}
			
			// handle event when mouse released
			public void mouseReleased( MouseEvent event ) {
			statusBar. setText( String . format( "Released at [%d, %d]",
			event.getX(), event.getY()));
			}
			// handle event when mouse enters area
			public void mouseEntered( MouseEvent event ){
			statusBar. setText( String . format( "Mouse entered at [%d, %d]",
			event.getX(), event.getY()));
			mousePanel.setBackground( Color.PINK );
			}
			// handle event when mouse exits area
			public void mouseExited( MouseEvent event ) {
			statusBar. setText( "Mouse outside JPanel" );
			mousePanel.setBackground( Color.WHITE );
			}
			
			// MouseMotionListener event handlers
			// handle event when user drags mouse with button pressed
			public void mouseDragged( MouseEvent event ) {
				statusBar. setText( String . format( "Dragged at [%d, %d]",
						event.getX(), event.getY() ));
				}
				// handle event when user moves mouse
				public void mouseMoved( MouseEvent event ) {
					statusBar. setText( String . format( "Moved at [%d, %d]",
							event.getX(), event.getY() ));
				}
			} // end inner class
		} // end class



