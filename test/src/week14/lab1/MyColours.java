package week14.lab1;

//Displays a frame containing two buttons. Pressing the
//"Lighter" button lightens the background of the frame.
//Pressing the "Darker" button darkens the background.

import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyColours extends JFrame{

		public MyColours(String title) {
		    // Set title, layout, and background colour
		    super(title);
		    setLayout(new FlowLayout());
		    getContentPane().setBackground(Color.gray);
		
		    // Create button listener
		    ButtonListener listener = new ButtonListener();
		
		    // ADD "Lighter" button to frame and attach listener
		    JButton b = new JButton("Lighter");
		    add(b);
		    b.addActionListener(listener);
		
		    // ADD "Darker" button to frame and attach listener
		    b = new JButton("Darker");
		    add(b);
		    b.addActionListener(listener);
		    
		    //ADD "Green"  button to frame and attach listener
		    b = new JButton("Green");
		    add(b);
		    b.addActionListener(listener);
		    
		    //ADD "Blue"  button to frame and attach listener
		    b = new JButton("Blue");
		    add(b);
		    b.addActionListener(listener);
		    
		    //ADD "Red"  button to frame and attach listener
		    b = new JButton("Red");
		    add(b);
		    b.addActionListener(listener);
		
		    // Attach window listener (type this in new colours added)
		    addWindowListener(new WindowCloser());
		}//end constructor
		
		// Listener for both buttons
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				Color currentBackground =  getContentPane().getBackground();
		 		String buttonLabel = evt.getActionCommand();
	
		 		// Test label on button and change background colour
					if (buttonLabel.equals("Lighter"))
						 getContentPane().setBackground(currentBackground.brighter());
				    else if (buttonLabel.equals("Darker"))
				    	 getContentPane().setBackground(currentBackground.darker());
				    else if (buttonLabel.equals("Green"))
				    	 getContentPane().setBackground(Color.GREEN);
				    else if (buttonLabel.equals("Blue"))
				    	 getContentPane().setBackground(Color.BLUE);
				    else if (buttonLabel.equals("Red"))
				    	 getContentPane().setBackground(Color.RED);
				    
				}
		}

		// Listener for window (to close)
		class WindowCloser extends WindowAdapter {
			public void windowClosing(WindowEvent evt) {
		 		System.exit(0);
			}
		}

}//end class