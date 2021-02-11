package week15.lab1;

//JComboBox that displays a list of image names.
import java .awt.FlowLayout;
import java .awt.event. ItemListener ;
import java .awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
	public class ComboBoxFrame extends JFrame{
		private JComboBox imagesJComboBox;
		private JLabel label ;
		private static final String [] names = { "car.png", "car2.png", "car3.png", "car4.png" };
		private Icon [] icons = {
				new ImageIcon( getClass() .getResource( names[ 0 ] ) ),
				new ImageIcon( getClass() .getResource( names[ 1 ] ) ),
				new ImageIcon( getClass() .getResource( names[ 2 ] ) ),
				new ImageIcon( getClass() .getResource( names[ 3 ] ) ) };
		
		public ComboBoxFrame() {
			super( "Testing JComboBox" );
			setLayout( new FlowLayout() );
			imagesJComboBox = new JComboBox( names );
			imagesJComboBox.setMaximumRowCount( 3 ); // display three rows
			imagesJComboBox.addItemListener(
			// anonymous inner class
			new ItemListener(){
			//handle JComboBox event
			public void itemStateChanged( ItemEvent event ){
			//determine whether item selected
			if ( event.getStateChange() == ItemEvent.SELECTED )
			label . setIcon ( icons [imagesJComboBox.getSelectedIndex() ] );
			}
			}
			); // end call to addItemListener
			add( imagesJComboBox );
			label = new JLabel( icons[ 0 ] ); // display first icon
			add( label );
			}
			} // end class