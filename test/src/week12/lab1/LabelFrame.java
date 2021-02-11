package week12.lab1;

//JLabel Demo
import java .awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
	public class LabelFrame extends JFrame{
		//Declare labels
		private JLabel label1 ;
		private JLabel label2 ;
		private JLabel label3 ;
		public LabelFrame() {
			super( "Testing JLabel" );
			setLayout( new FlowLayout() );
		
			label1 = new JLabel( "Label with text" );
			label1 .setToolTipText( "This is label1 " );
			add( label1 ); // add label to JFrame
			Icon car = new ImageIcon( getClass().getResource( "car.png" ) );
			label2 = new JLabel( "Label with text and icon", car ,
			SwingConstants.LEFT );
			label2 .setToolTipText( "This is label2 " );
			add( label2 );
			label3 = new JLabel();
			label3 . setText( "Label with icon and text at bottom" );
			label3 . setIcon ( car );
			label3 . setHorizontalTextPosition ( SwingConstants.CENTER );
			label3 . setVerticalTextPosition ( SwingConstants.BOTTOM );
			label3 .setToolTipText( "This is label3 " );
			add( label3 );
			} //end public LabelFrame
		} // end class