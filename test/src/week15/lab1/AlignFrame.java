package week15.lab1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlignFrame extends JFrame {
	
	private JButton okJButton;
	private JButton cancelJButton;
	private JButton helpJButton;
	
	private JTextField xJTextField;
	private JTextField yJTextField;
	
	private JLabel xJLabel;
	private JLabel yJLabel;
	
	private JCheckBox snapJCheckBox;
	private JCheckBox showJCheckBox;
	
	private JPanel checkJPanel;
	private JPanel buttonJPanel;
	private JPanel fieldJPanel1;
	private JPanel fieldJPanel2;
	private JPanel fieldJPanel;
	
	public AlignFrame() {
		super("Align");
		
		//build JCheckPanel (CHECKBOXES)
		snapJCheckBox = new JCheckBox("Snap to grid");
		showJCheckBox = new JCheckBox("Show grid");
		checkJPanel = new JPanel();
		checkJPanel.setLayout(new GridLayout(2,1));
		//add method to show check boxes
		checkJPanel.add(snapJCheckBox);
		checkJPanel.add(showJCheckBox);
		
		//build field panel (LABEL X)
		xJLabel = new JLabel("X:");
		xJTextField = new JTextField("8" ,3);
		fieldJPanel1 = new JPanel();
		fieldJPanel1.setLayout(new FlowLayout());
		fieldJPanel1.add(xJLabel);
		fieldJPanel1.add(xJTextField);
		//build field panel (LABEL Y)
		yJLabel = new JLabel("Y:");
		yJTextField = new JTextField("8" ,3);
		fieldJPanel2 = new JPanel();
		fieldJPanel2.setLayout(new FlowLayout());
		fieldJPanel2.add(yJLabel);
		fieldJPanel2.add(yJTextField);
		
		//build field panel (fit together in same panel)
		fieldJPanel = new JPanel();
		fieldJPanel.setLayout(new BorderLayout());
		fieldJPanel.add(fieldJPanel1, BorderLayout.NORTH);
		fieldJPanel.add(fieldJPanel2, BorderLayout.SOUTH);
		
		//build button panel
		okJButton = new JButton("Ok");
		cancelJButton = new JButton("Cancel");
		helpJButton = new JButton("Help");
		buttonJPanel = new JPanel();
		//making columns/rows
		buttonJPanel.setLayout(new GridLayout(3,1,10,5)); //row,column,horizontal/vertical gaps
		//setting order in which they show
		buttonJPanel.add(okJButton);
		buttonJPanel.add(cancelJButton);
		buttonJPanel.add(helpJButton);
		
		//putting fields in gui in order
		setLayout (new FlowLayout(FlowLayout.CENTER, 10,5));
		add(checkJPanel);
		add(fieldJPanel);
		add(buttonJPanel);		
	}//end AlignFrame	
}//end class
