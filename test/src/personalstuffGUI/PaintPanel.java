package personalstuffGUI;

//Using class MouseMotionAdapter
import java .awt.Point;
import java .awt.Graphics;
import java .awt.event.MouseEvent;
import java .awt.event.MouseMotionAdapter;
import javax.swing.JPanel;
	public class PaintPanel extends JPanel{
		private int pointCount = 0;
		private Point [] points = new Point[ 10000 ];
		public PaintPanel(){
			//handle frame mouse motion event
			addMouseMotionListener(
					new MouseMotionAdapter(){
						public void mouseDragged( MouseEvent event ){
							if ( pointCount < points.length ){
								points [ pointCount ] = event.getPoint() ;
								++pointCount;
								repaint () ; // repaint JFrame
							}
																}//end void mouseDragged
											}//end of MouseMotionAdapter
								);
						}//end public PaintPanel
						// draw ovals in a 4 by 4 bounding box at specified locations on window
						public void paintComponent( Graphics g ){
						super.paintComponent( g ); // clears drawing area
						// draw all points in array
						for ( int i = 0; i < pointCount; i++ )
						g. fillOval ( points [ i ]. x, points [ i ]. y , 4, 4 );
						}
						} // end class
