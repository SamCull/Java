package GUIBUILDER;

import personalstuffGUI.SearchResultCustomer;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class CustomerGUI implements ActionListener { 

	private JFrame frmCustomerTable;

	private JTextField insertFirstNametextField;
	private JTextField insertLastNametextField;				
	private JTextField insertPhoneNumtextField;										
	private JTextField updateFirstNametextField;
	private JTextField updateLastNametextField;
	private JTextField updatePhoneNumtextField;
	private JTextField deleteCustomerIDtextField; 

	/**
	 * Launch the application.
	 */
	public static void main (String[] args) {
		
		//CustomerGUI cg = new CustomerGUI();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerGUI window = new CustomerGUI();
					
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
		frmCustomerTable.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmCustomerTable = new JFrame();
		frmCustomerTable.setFont(new Font("Dialog", Font.BOLD, 12));
		frmCustomerTable.setTitle("Customer Table");
		frmCustomerTable.setBounds(100, 100, 472, 304);
		frmCustomerTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomerTable.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 446, 262);
		frmCustomerTable.getContentPane().add(tabbedPane);
	
	
		
		//Start of INSERT CUSTOMER
		JPanel insertC = new JPanel();
		tabbedPane.addTab("Insert Customer", null, insertC, null);
		insertC.setLayout(null);
		
		JLabel lblinsertFirstName = new JLabel("First name");
		lblinsertFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));		//FirstName label
		lblinsertFirstName.setBounds(26, 21, 71, 26);
		insertC.add(lblinsertFirstName);
		
		JLabel lblinsertLastName = new JLabel("Last name");
		lblinsertLastName.setFont(new Font("Tahoma", Font.BOLD, 12));		//LastName label
		lblinsertLastName.setBounds(26, 71, 71, 26);
		insertC.add(lblinsertLastName);
		
		JLabel lblinsertPhoneNum = new JLabel("Phone Number\r\n");
		lblinsertPhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));		//PhoneNumber label
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
		
		JPanel c = new JPanel();
		JButton btninsertSubmitButton = new JButton("Submit");
		btninsertSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 12));		//Submit button
		btninsertSubmitButton.setBounds(296, 158, 85, 21);
		insertC.add(btninsertSubmitButton);
		

		//Inserting CONNECTION TO SQL for INSERT CUSTOMER
		frmCustomerTable.getContentPane().add(c);
		btninsertSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();

		        if (source == btninsertSubmitButton) { // if submit button is called, run the following:
		        	
		        		final String DATABASE_URL = "jdbc:mysql://localhost/project";
		        		Connection connection = null ;
		        		PreparedStatement pstat = null;
		        		String FirstName = insertFirstNametextField.getText();
		        		String LastName = insertLastNametextField.getText();
		        		String PhoneNumber= insertPhoneNumtextField.getText();
		        		
		        		int i = 0;
		        		
		        		{
		        			try {
		        		// establish connection to database
		        		connection = DriverManager.getConnection(DATABASE_URL, "root", "" );
		        		// create Prepared Statement for inserting data into table
		        		pstat = connection.prepareStatement("INSERT INTO Customer (FirstName, LastName, PhoneNumber ) VALUES (?,?,?)");
		        		pstat . setString (1, FirstName );
		        		pstat . setString (2, LastName);
		        		pstat . setString (3, PhoneNumber);
		        		// insert data into table
		        		i = pstat .executeUpdate();
		        		JOptionPane.showMessageDialog(frmCustomerTable, i + " customer added to database ");
		        		}
		        		catch(SQLException sqlException){
		        			JOptionPane.showMessageDialog(frmCustomerTable, "Too many numbers added for phone number, max 10 numbers only"); //Allows only 10 numbers to be entered for phone num
		        		}
		        		finally {
		        		try {
		        		pstat . close () ;
		        		connection. close () ;
		        		}
		        		catch (Exception exception){
		        		exception . printStackTrace () ;
		        		
		        					}
		        			}//end finally
		        		}
		        	
					
		        	}//end of if source statement
		       }//end of actionPerformed 
			}//end of newAddListener
			); 
		//End of Insert Customer
		
		
		
		
		
		
		//Start of UPDATE CUSTOMER
		JPanel updateC = new JPanel();
		tabbedPane.addTab("Update Customer", null, updateC, null);
		updateC.setLayout(null);
		
		JLabel lblupdateFirstName = new JLabel("First name");
		lblupdateFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));		//FirstName label
		lblupdateFirstName.setBounds(26, 21, 71, 26);
		updateC.add(lblupdateFirstName);
		
		JLabel lblupdateLastName = new JLabel("Last name");
		lblupdateLastName.setFont(new Font("Tahoma", Font.BOLD, 12));		//LastName label
		lblupdateLastName.setBounds(26, 71, 71, 26);
		updateC.add(lblupdateLastName);
		
		JLabel lblupdatePhoneNum = new JLabel("Phone Number\r\n");
		lblupdatePhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));		//Phone number label
		lblupdatePhoneNum.setBounds(26, 121, 108, 26);
		updateC.add(lblupdatePhoneNum);
		
		updateFirstNametextField = new JTextField();
		updateFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));	//FirstName text field
		updateFirstNametextField.setColumns(10);
		updateFirstNametextField.setBounds(158, 22, 172, 26);
		updateC.add(updateFirstNametextField);
		
		updateLastNametextField = new JTextField();
		updateLastNametextField.setFont(new Font("Arial", Font.PLAIN, 12));		//LastName text field
		updateLastNametextField.setColumns(10);
		updateLastNametextField.setBounds(158, 72, 172, 26);
		updateC.add(updateLastNametextField);
		
		updatePhoneNumtextField = new JTextField();
		updatePhoneNumtextField.setFont(new Font("Arial", Font.PLAIN, 12));		//Phone number text field
		updatePhoneNumtextField.setColumns(10);
		updatePhoneNumtextField.setBounds(158, 122, 172, 26);
		updateC.add(updatePhoneNumtextField);
		
		JButton btnupdateConfirmButton = new JButton("Confirm Changes");
		btnupdateConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));		//Confirm changes button
		btnupdateConfirmButton.setBounds(237, 158, 139, 21);
		updateC.add(btnupdateConfirmButton);
		
		frmCustomerTable.getContentPane().add(c);
		btnupdateConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();

		        if (source == btnupdateConfirmButton) { // if update button is called
		        	final String DATABASE_URL = "jdbc:mysql://localhost/project";
					
			        String firstname = updateFirstNametextField.getText();
			        String lastname = updateLastNametextField.getText();		//SNIPPET
			        String phonenumber = updatePhoneNumtextField.getText();
						Connection connection = null;
						PreparedStatement pstat = null;
						int i =0;
									
						try{
				              // establish connection to database
				              connection = DriverManager.getConnection(
				                  DATABASE_URL, "root","");
				              // create Prepared Statement for updating table
				              pstat = connection.prepareStatement("Update Customer SET phonenumber = ?, lastname = ? WHERE firstname = ?" );
				              //replaces position of ? with first and last name and phone number
				              pstat.setString(1, phonenumber);
				              pstat.setString(2, lastname);
				              pstat.setString(3, firstname);
				              

				              //Update data in database
				              i = pstat.executeUpdate();
				              JOptionPane.showMessageDialog(frmCustomerTable, i + " customer details updated in database ");				          
				              }//end try
				          catch(SQLException sqlException ) {
				        	  JOptionPane.showMessageDialog(frmCustomerTable, "Too many numbers added for phone number, max 10 numbers only"); // if > than 10 numbers in phone
				           }
				
						finally{
							try{
								pstat.close();
								connection.close();
							}
							catch ( Exception exception ){
								exception.printStackTrace();
							}
						} // end finally
		        }//end if 
		       }// end Action event e
		});
	
		//End of Update Customer
		
		
		
		
		
		//Start of DISPLAY CUSTOMER
				JPanel displayC = new JPanel(); 
			 	tabbedPane.addTab("Display Customer", null, displayC, null);
			 	displayC.setLayout(null); 
			 	
			 	JButton btndisplayCustomerButton = new JButton("Display");
			 	btndisplayCustomerButton.setBounds(140, 90, 125, 46);			//SNIPPET
			 	displayC.add(btndisplayCustomerButton);
		
			btndisplayCustomerButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
			if(event.getSource() == btndisplayCustomerButton) {
				SearchResultCustomer sr = new SearchResultCustomer(); 	//IF button is pressed, call class SearchResultCustomer
				sr.createUI();											//Will search MySQL DB for ID entered
			}//end if
		}//end actionPerformed
	});//end ActionListener
	
		//End of Display Customer
		
		
		   
		   
		   
		   
		  		   
		//Start of DELETE CUSTOMER
		JPanel deleteC = new JPanel();
		tabbedPane.addTab("Delete Customer", null, deleteC, null);
		deleteC.setLayout(null);
		
		JLabel lbldeleteCustomerID = new JLabel("CustomerID");
		lbldeleteCustomerID.setFont(new Font("Tahoma", Font.BOLD, 12));		//CustomerID label
		lbldeleteCustomerID.setBounds(35, 88, 85, 26);
		deleteC.add(lbldeleteCustomerID);
		
		deleteCustomerIDtextField = new JTextField();
		deleteCustomerIDtextField.setFont(new Font("Arial", Font.PLAIN, 12));	//CustomerID text field
		deleteCustomerIDtextField.setColumns(10);
		deleteCustomerIDtextField.setBackground(Color.WHITE);
		deleteCustomerIDtextField.setBounds(165, 89, 172, 26);
		deleteC.add(deleteCustomerIDtextField);
		
		JButton btndeleteDeleteButton = new JButton("Delete");
		btndeleteDeleteButton.setBackground(Color.decode("#FF3A3A"));	//Delete button
		btndeleteDeleteButton.setBounds(296, 158, 85, 21);
		btndeleteDeleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteC.add(btndeleteDeleteButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 252, 411, 1);
		frmCustomerTable.getContentPane().add(panel);
		
		frmCustomerTable.getContentPane().add(c);
		btndeleteDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();
				
				 if (source == btndeleteDeleteButton) { // if submit button is called
						final String DATABASE_URL = "jdbc:mysql://localhost/project";
						
						Connection connection = null;
						PreparedStatement pstat = null;	
						
						String del= deleteCustomerIDtextField.getText();	//SNIPPET
						
						int i = 0; //used to tell user if entry was successful, return 1 if successful
						
						try{
							// establish connection to database
							connection = DriverManager.getConnection(
							DATABASE_URL, "root", "" );
							// create Statement for deleting from table
							pstat = connection.prepareStatement("Delete From Customer Where CustomerID=?");
							pstat.setString(1, del); //(1, customerid)
							
							
							
							//Delete data in the database
							i = pstat.executeUpdate();
							JOptionPane.showMessageDialog(frmCustomerTable, i + " record successfuly removed from database,");
							
						 }
						catch(SQLException sqlException ) {
							 JOptionPane.showMessageDialog(frmCustomerTable, "ID doesn't exist, please view Display tab to see a list of Customer ID's"); //print this if ID doesn't exist
						 }
						finally{
							try{
								pstat.close();
								connection.close();
							}
							catch ( Exception exception ){
								exception.printStackTrace();
							}
						}//end finally
				 }//end if
			}//end actionPerformed
		});//end actionListener
		

	}//end private void initialise

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

} //end class
