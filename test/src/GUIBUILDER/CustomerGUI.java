package GUIBUILDER;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JTextArea;

import javax.swing.*;
import java.awt.event.*;

public class CustomerGUI {

	private JFrame frmCustomerTable;
	private JTextField insertFirstNametextField;
	private JTextField insertLastNametextField;
	private JTextField insertPhoneNumtextField;
	private JTextField updateFirstNametextField;
	private JTextField updateLastNametextField;
	private JTextField updatePhoneNumtextField;
	private JTable customertable;
	private JTextField deleteFirstNametextField;
	private JTextField deleteLastNametextField;
	private JTextField deletePhoneNumtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerGUI window = new CustomerGUI();
					window.frmCustomerTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCustomerTable = new JFrame();
		frmCustomerTable.setFont(new Font("Dialog", Font.BOLD, 12));
		frmCustomerTable.setTitle("Customer Table");
		frmCustomerTable.setBounds(100, 100, 450, 300);
		frmCustomerTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomerTable.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 416, 232);
		frmCustomerTable.getContentPane().add(tabbedPane);
		
		//Start of INSERT CUSTOMER
		JPanel insertC = new JPanel();
		tabbedPane.addTab("Insert Customer", null, insertC, null);
		insertC.setLayout(null);
		
		JLabel lblinsertFirstName = new JLabel("First name");
		lblinsertFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertFirstName.setBounds(26, 21, 71, 26);
		insertC.add(lblinsertFirstName);
		
		JLabel lblinsertLastName = new JLabel("Last name");
		lblinsertLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertLastName.setBounds(26, 71, 71, 26);
		insertC.add(lblinsertLastName);
		
		JLabel lblinsertPhoneNum = new JLabel("Phone Number\r\n");
		lblinsertPhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertPhoneNum.setBounds(26, 121, 122, 26);
		insertC.add(lblinsertPhoneNum);
		
		insertFirstNametextField = new JTextField();
		insertFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User first name field input
		insertFirstNametextField.setColumns(10);
		insertFirstNametextField.setBounds(158, 22, 172, 26);
		insertC.add(insertFirstNametextField);

		
		insertLastNametextField = new JTextField();
		insertLastNametextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertLastNametextField.setColumns(10);
		insertLastNametextField.setBounds(158, 72, 172, 26);
		insertC.add(insertLastNametextField);
		
		insertPhoneNumtextField = new JTextField();
		insertPhoneNumtextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User phone number field input
		insertPhoneNumtextField.setColumns(10);
		insertPhoneNumtextField.setBounds(158, 122, 172, 26);
		insertC.add(insertPhoneNumtextField);
		
		JPanel p = new JPanel();
		JButton btninsertSubmitButton = new JButton("Submit");
		btninsertSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btninsertSubmitButton.setBounds(296, 158, 85, 21);
		insertC.add(btninsertSubmitButton);
		
		//Inserting CONNECTION TO SQL
		//p.add(btninsertSubmitButton);
		//frmCustomerTable.add(p);
		//btninsertSubmitButton.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
			
			//	}
			//});
		//End of Insert Customer
		///////////////////////////////////////////////////////////
		
		
		//Start of UPDATE CUSTOMER
		JPanel updateC = new JPanel();
		tabbedPane.addTab("Update Customer", null, updateC, null);
		updateC.setLayout(null);
		
		JLabel lblupdateFirstName = new JLabel("First name");
		lblupdateFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateFirstName.setBounds(26, 21, 71, 26);
		updateC.add(lblupdateFirstName);
		
		JLabel lblupdateLastName = new JLabel("Last name");
		lblupdateLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateLastName.setBounds(26, 71, 71, 26);
		updateC.add(lblupdateLastName);
		
		JLabel lblupdatePhoneNum = new JLabel("Phone Number\r\n");
		lblupdatePhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdatePhoneNum.setBounds(26, 121, 108, 26);
		updateC.add(lblupdatePhoneNum);
		
		updateFirstNametextField = new JTextField();
		updateFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateFirstNametextField.setColumns(10);
		updateFirstNametextField.setBounds(158, 22, 172, 26);
		updateC.add(updateFirstNametextField);
		
		updateLastNametextField = new JTextField();
		updateLastNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateLastNametextField.setColumns(10);
		updateLastNametextField.setBounds(158, 72, 172, 26);
		updateC.add(updateLastNametextField);
		
		updatePhoneNumtextField = new JTextField();
		updatePhoneNumtextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updatePhoneNumtextField.setColumns(10);
		updatePhoneNumtextField.setBounds(158, 122, 172, 26);
		updateC.add(updatePhoneNumtextField);
		
		JButton btnupdateConfirmButton = new JButton("Confirm Changes");
		btnupdateConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnupdateConfirmButton.setBounds(237, 158, 139, 21);
		updateC.add(btnupdateConfirmButton);
		//End of Update Customer
		
		
		
		//Start of DISPLAY CUSTOMER
		JPanel displayC = new JPanel();
		tabbedPane.addTab("Display Customer", null, displayC, null);
		displayC.setLayout(null);
		
		customertable = new JTable();
		JButton Close = new JButton("Close");
		customertable.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		customertable.setFont(new Font("Arial", Font.BOLD, 12));
		customertable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Customer ID", "First Name", "Last Name", "Phone Number"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Customer ID", "First Name", "Last Name", "Phone Number"
			}
		));
		customertable.getColumnModel().getColumn(0).setPreferredWidth(85);
		customertable.getColumnModel().getColumn(1).setPreferredWidth(85);
		customertable.getColumnModel().getColumn(2).setPreferredWidth(85);
		customertable.getColumnModel().getColumn(3).setPreferredWidth(85);
		customertable.setBounds(10, 10, 391, 140);
		displayC.add(customertable);
		
		JButton btndisplayCloseButton = new JButton("Close");
		btndisplayCloseButton.addActionListener(new ActionListener() { //Call action to close DISPLAY table
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btndisplayCloseButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btndisplayCloseButton.setBounds(269, 160, 112, 21);
		displayC.add(btndisplayCloseButton);
		//End of Display Customer
		
		
		//Start of DELETE CUSTOMER
		JPanel deleteC = new JPanel();
		tabbedPane.addTab("Delete Customer", null, deleteC, null);
		deleteC.setLayout(null);
		
		JLabel lbldeleteFirstName = new JLabel("First name");
		lbldeleteFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeleteFirstName.setBounds(26, 21, 71, 26);
		deleteC.add(lbldeleteFirstName);
		
		JLabel lbldeleteLastName = new JLabel("Last name");
		lbldeleteLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeleteLastName.setBounds(26, 71, 71, 26);
		deleteC.add(lbldeleteLastName);
		
		JLabel lbldeletePhoneNum = new JLabel("PhoneNumber\r\n");
		lbldeletePhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeletePhoneNum.setBounds(26, 121, 91, 26);
		deleteC.add(lbldeletePhoneNum);
		
		deleteFirstNametextField = new JTextField();
		deleteFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		deleteFirstNametextField.setColumns(10);
		deleteFirstNametextField.setBackground(Color.WHITE);
		deleteFirstNametextField.setBounds(158, 22, 172, 26);
		deleteC.add(deleteFirstNametextField);
		
		deleteLastNametextField = new JTextField();
		deleteLastNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		deleteLastNametextField.setColumns(10);
		deleteLastNametextField.setBounds(158, 72, 172, 26);
		deleteC.add(deleteLastNametextField);
		
		deletePhoneNumtextField = new JTextField();
		deletePhoneNumtextField.setFont(new Font("Arial", Font.PLAIN, 12));
		deletePhoneNumtextField.setColumns(10);
		deletePhoneNumtextField.setBounds(158, 122, 172, 26);
		deleteC.add(deletePhoneNumtextField);
		
		JButton btndeleteDeleteButton = new JButton("Delete");
		btndeleteDeleteButton.setBackground(Color.decode("#FF3A3A"));
		btndeleteDeleteButton.setBounds(296, 158, 85, 21);
		btndeleteDeleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteC.add(btndeleteDeleteButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 252, 411, 1);
		frmCustomerTable.getContentPane().add(panel);
		
	}
} //end class
