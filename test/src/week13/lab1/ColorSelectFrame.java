package week13.lab1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorSelectFrame extends JFrame{

	//Making GUI buttons
	private JButton okButton;
	private JButton cancelButton;
	private JCheckBox backroundCheckBox;
	private JCheckBox foregroundCheckBox;
	private JComboBox colorComboBox;
	
	private JPanel panel;
	private JPanel panel2;
	
	public ColorSelectFrame() { //setting a title
		super("Color Select");
		
		setLayout(new BorderLayout()); //Drop down menu
		colorComboBox = new JComboBox();
		colorComboBox.addItem("Red");
		colorComboBox.addItem("Blue");
		colorComboBox.addItem("Green");
		add(colorComboBox, BorderLayout.NORTH);
		
		panel = new JPanel();
		backroundCheckBox = new JCheckBox("Backround");
		foregroundCheckBox = new JCheckBox("Foreground");
		panel.add(backroundCheckBox);
		panel.add(foregroundCheckBox);
		add(panel, BorderLayout.CENTER);
		
		panel2 = new JPanel();
		okButton = new JButton("Ok");
		cancelButton = new JButton("Cancel");
		panel.add(okButton);
		panel.add(cancelButton);
		add(panel2, BorderLayout.SOUTH);
		
	}//end ColorSelectFrame
	
}// end class
