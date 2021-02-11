package week15.lab1;

//JList that displays a list of colours
import java .awt.FlowLayout;
import java .awt.Color;
import javax.swing.JFrame;
import javax.swing. JList ;
import javax.swing. JScrollPane ;
import javax.swing.event. ListSelectionListener ;
import javax.swing.event. ListSelectionEvent ;
import javax.swing. ListSelectionModel ;
	public class ListFrame extends JFrame {
		private JList colourJList ;
		private static final String [] colourNames = { "Black", "Blue", "Cyan",
				"Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
				"Orange", "Pink", "Red", "White", "Yellow" };
		
		private static final Color [] colours = { Color.BLACK, Color.BLUE,
				Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
				Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
				Color.RED, Color.WHITE, Color.YELLOW };
		
		public ListFrame() {
			super( "List Test" );
			setLayout( new FlowLayout() );
			colourJList = new JList( colourNames );
			colourJList .setVisibleRowCount( 5 );
			// do not allow multiple selections
			colourJList .setSelectionMode( ListSelectionModel .SINGLE_SELECTION );
			add( new JScrollPane( colourJList ) );
			colourJList . addListSelectionListener (
			new ListSelectionListener (){
			// handle list selection events
			public void valueChanged( ListSelectionEvent event ) {
			getContentPane().setBackground(colours[ colourJList . getSelectedIndex ()] );
			
						}//end void valueChanged
			}//end addListSelectionListened
			);
			}//end listFrame
			} // end class

