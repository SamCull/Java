package week11.lab1;

//JButtons Demo
import java .awt.FlowLayout;
import java .awt.event. ActionListener ;
import java .awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

	public class ButtonFrame extends JFrame {
		private JButton plainJButton;
		private JButton fancyJButton;
		public ButtonFrame(){
			super( "Testing Buttons" );
			setLayout( new FlowLayout() );
			plainJButton = new JButton( "Plain Button" );
			add( plainJButton );
			Icon car1 = new ImageIcon( getClass().getResource( "car.png" ) );
			Icon car2 = new ImageIcon( getClass().getResource( "car2.png" ) );
			fancyJButton = new JButton( "Fancy Button", car1 );
			fancyJButton. setRolloverIcon ( car2 );
			add( fancyJButton );
			//button event handling
			ButtonHandler handler = new ButtonHandler();
			fancyJButton.addActionListener( handler );
			plainJButton. addActionListener ( handler );
			} // end constructor
			// inner class for button event handling
			private class ButtonHandler implements ActionListener {
			// handle button event
			public void actionPerformed( ActionEvent event ){
			JOptionPane.showMessageDialog(ButtonFrame.this , String.format("You pressed: %s",
			event.getActionCommand()));
							}
			}//end actionPerformed class
		} // end class

