package GUIBUILDER;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.JButton;
import personalstuffGUI.SearchResultInvoice;


public class InvoiceGUI {

	private JFrame frmInvoiceTable;
	private JTextField insertFirstNametextField;
	private JTextField insertNametextField;
	private JTextField insertDatetextField;					
	private JTextField insertPricetextField;				
	private JTextField insertQuantitytextField;				
	private JTextField updateNametextField;					
	private JTextField updateDatetextField;
	private JTextField updatePricetextField;
	private JTextField updateQuantitytextField;
	private JTextField deleteInvoiceIDtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvoiceGUI window = new InvoiceGUI();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InvoiceGUI() {
		initialize();
		frmInvoiceTable.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInvoiceTable = new JFrame();
		frmInvoiceTable.setFont(new Font("Dialog", Font.BOLD, 12));
		frmInvoiceTable.setTitle("Invoice Table");
		frmInvoiceTable.setBounds(100, 100, 450, 300);
		frmInvoiceTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInvoiceTable.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 436, 263);
		frmInvoiceTable.getContentPane().add(tabbedPane);
		
		
		//Start of INSERT INVOICE
		JPanel insertI = new JPanel();
		insertI.setToolTipText("");
		tabbedPane.addTab("Insert Invoice", null, insertI, null);
		insertI.setLayout(null);
		
		JLabel lblinsertName = new JLabel("Name");
		lblinsertName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertName.setBounds(26, 21, 71, 26);
		insertI.add(lblinsertName);
		
		JLabel lblinsertDate = new JLabel("Date");
		lblinsertDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertDate.setBounds(26, 69, 56, 26);
		insertI.add(lblinsertDate);
		
		JLabel lblinsertPrice = new JLabel("Price");
		lblinsertPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertPrice.setBounds(26, 120, 56, 26);
		insertI.add(lblinsertPrice);
		
		JLabel lblinsertQuantity = new JLabel("Quantity");
		lblinsertQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertQuantity.setBounds(26, 167, 56, 26);
		insertI.add(lblinsertQuantity);
		
		insertNametextField = new JTextField();
		insertNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		insertNametextField.setBounds(117, 21, 137, 26);
		insertNametextField.setColumns(10);
		insertI.add(insertNametextField);
		
		insertDatetextField = new JTextField();
		insertDatetextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertDatetextField.setBounds(117, 70, 137, 26);
		insertDatetextField.setColumns(10);
		insertI.add(insertDatetextField);
		
		insertPricetextField = new JTextField();
		insertPricetextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertPricetextField.setBounds(117, 121, 137, 26);
		insertPricetextField.setColumns(10);
		insertI.add(insertPricetextField);
		
		insertQuantitytextField = new JTextField();
		insertQuantitytextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertQuantitytextField.setBounds(117, 167, 137, 26);
		insertQuantitytextField.setColumns(10);
		insertI.add(insertQuantitytextField);
		
		JPanel i = new JPanel();
		JButton btninsertSubmitButton = new JButton("Submit");
		btninsertSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btninsertSubmitButton.setBounds(296, 192, 85, 21);
		insertI.add(btninsertSubmitButton);
		
		//Inserting CONNECTION TO SQL for INSERT INVOICE
		frmInvoiceTable.getContentPane().add(i);
		btninsertSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();

		        if (source == btninsertSubmitButton) { // if submit button is called
		        	
		        		final String DATABASE_URL = "jdbc:mysql://localhost/project";
		        		Connection connection = null ;
		        		PreparedStatement pstat = null;
		        		String InvoiceName = insertNametextField.getText();
		        		String InvoiceDate= insertDatetextField.getText();
		        		String InvoicePrice= insertPricetextField.getText();
		        		String InvoiceQuantity= insertQuantitytextField.getText();
		        		
		        		int i = 0;
		        		
		        		{
		        			try {
		        		// establish connection to database
		        		connection = DriverManager.getConnection(DATABASE_URL, "root", "" );
		        		// create Prepared Statement for inserting data into table
		        	    pstat = connection.prepareStatement("INSERT INTO Invoice (InvoiceName, InvoiceDate, InvoicePrice, InvoiceQuantity) VALUES (?,?,?,?)");
		                pstat . setString (1, InvoiceName );
		                pstat . setString (2, InvoiceDate);
		                pstat . setString (3, InvoicePrice);
		                pstat . setString (4, InvoiceQuantity);
		        		// insert data into table
		        		i = pstat .executeUpdate();
		        		JOptionPane.showMessageDialog(frmInvoiceTable, i + " invoice added to database ");
		        		}
		        		catch(SQLException sqlException){
		        		sqlException . printStackTrace () ;
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
		//End of INSERT INVOICE
		

		
		
		
		
		//Start of UPDATE INVOICE
		JPanel updateI = new JPanel();
		tabbedPane.addTab("Update Invoice", null, updateI, null);
		updateI.setLayout(null);
		
		JLabel lblupdateName = new JLabel("Name");
		lblupdateName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateName.setBounds(26, 21, 71, 26);
		updateI.add(lblupdateName);
		
		JLabel lblupdateDate = new JLabel("Date");
		lblupdateDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateDate.setBounds(26, 70, 56, 26);
		updateI.add(lblupdateDate);
		
		JLabel lblupdatePrice = new JLabel("Price");
		lblupdatePrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdatePrice.setBounds(26, 117, 56, 26);
		updateI.add(lblupdatePrice);
		
		JLabel lblupdateQuantity = new JLabel("Quantity");
		lblupdateQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateQuantity.setBounds(26, 167, 56, 26);
		updateI.add(lblupdateQuantity);
		
		updateNametextField = new JTextField();
		updateNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateNametextField.setColumns(10);
		updateNametextField.setBounds(117, 21, 137, 26);
		updateI.add(updateNametextField);
		
		updateDatetextField = new JTextField();
		updateDatetextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateDatetextField.setColumns(10);
		updateDatetextField.setBounds(117, 71, 137, 26);
		updateI.add(updateDatetextField);
		
		updatePricetextField = new JTextField();
		updatePricetextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updatePricetextField.setColumns(10);
		updatePricetextField.setBounds(117, 118, 137, 26);
		updateI.add(updatePricetextField);
		
		updateQuantitytextField = new JTextField();
		updateQuantitytextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateQuantitytextField.setColumns(10);
		updateQuantitytextField.setBounds(117, 167, 137, 26);
		updateI.add(updateQuantitytextField);
		
		insertFirstNametextField = new JTextField();
		insertFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		insertFirstNametextField.setBounds(117, 21, 137, 26);
		insertFirstNametextField.setColumns(10);
		insertI.add(insertFirstNametextField);
		
		
		JButton btnupdateConfirmButton = new JButton("Confirm Changes");
		btnupdateConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnupdateConfirmButton.setBounds(262, 191, 144, 21);
		updateI.add(btnupdateConfirmButton);
		
		frmInvoiceTable.getContentPane().add(i);
		btnupdateConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();

		        if (source == btnupdateConfirmButton) { // if update button is called
		        	final String DATABASE_URL = "jdbc:mysql://localhost/project";
					
	        		String invoicename = updateNametextField.getText();
	        		String invoicedate= updateDatetextField.getText();
	        		String invoiceprice= updatePricetextField.getText();
	        		String invoicequantity= updateQuantitytextField.getText();
	        		Connection connection = null;
	    			PreparedStatement pstat = null;
	    			int i =0;
	    						
	    			try{
			              // establish connection to database
			              connection = DriverManager.getConnection(
			                  DATABASE_URL, "root","");
			              // create Prepared Statement for updating table
	    	              pstat = connection.prepareStatement("Update Invoice SET invoicedate = ?, invoiceprice = ?, invoicequantity = ? WHERE invoicename = ?" );
	    	              //replaces position of ? with first and last name and phone number
	    	              pstat.setString(1, invoicedate);
	    	              pstat.setString(2, invoiceprice);
	    	              pstat.setString(3, invoicequantity);
	    	              pstat.setString(4, invoicename);
	    	              

	    	            //Update data in database
			              i = pstat.executeUpdate();
			              JOptionPane.showMessageDialog(frmInvoiceTable, i + " invoice details updated in database ");				          
			              }//end try
			          catch(SQLException sqlException ) {
			              sqlException.printStackTrace();
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
	
		
		
		//Start of DISPLAY INVOICE
		JPanel displayI = new JPanel();
		tabbedPane.addTab("Display Invoice", null, displayI, null);
		displayI.setLayout(null);
		
	 	JButton btndisplayInvoiceButton = new JButton("Display");
	 	btndisplayInvoiceButton.setBounds(140, 90, 125, 46);
	 	displayI.add(btndisplayInvoiceButton);

 
	btndisplayInvoiceButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			//Object source = event.getSource();
	if(event.getSource() == btndisplayInvoiceButton) {
		//btndisplayinvoiceButton showTable = new JWindow();
		SearchResultInvoice sr = new SearchResultInvoice(); 
		sr.createUI();
	}//end if
}//end actionPerformed
});//end ActionListener
		//End of DISPLAY INVOICE
		
		
		
		//Start of DELETE INVOICE
		JPanel deleteI = new JPanel();
		tabbedPane.addTab("Delete Invoice", null, deleteI, null);
		deleteI.setLayout(null);
		
		JLabel lbldeleteInvoiceID = new JLabel("InvoiceID");
		lbldeleteInvoiceID.setFont(new Font("Tahoma", Font.BOLD, 12));	//invoice LABEL
		lbldeleteInvoiceID.setBounds(35, 88, 85, 26);
		deleteI.add(lbldeleteInvoiceID);
		
		deleteInvoiceIDtextField = new JTextField();
		deleteInvoiceIDtextField.setFont(new Font("Arial", Font.PLAIN, 12));	//TEXTFIELD
		deleteInvoiceIDtextField.setColumns(10);
		deleteInvoiceIDtextField.setBackground(Color.WHITE);
		deleteInvoiceIDtextField.setBounds(165, 89, 172, 26);
		deleteI.add(deleteInvoiceIDtextField);
		
		JButton btndeleteDeleteButton = new JButton("Delete");
		btndeleteDeleteButton.setBackground(Color.decode("#FF3A3A"));	//BUTTON
		btndeleteDeleteButton.setBounds(296, 158, 85, 21);
		btndeleteDeleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteI.add(btndeleteDeleteButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 252, 411, 1);
		frmInvoiceTable.getContentPane().add(panel);
		
		frmInvoiceTable.getContentPane().add(i);
		btndeleteDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();
				
				 if (source == btndeleteDeleteButton) { // if submit button is called
						final String DATABASE_URL = "jdbc:mysql://localhost/project";
						
						Connection connection = null;
						PreparedStatement pstat = null;	
						
						String del= deleteInvoiceIDtextField.getText();
						
						
						int i = 0; //used to tell user if entry was successful	
						
						try{
							// establish connection to database
							connection = DriverManager.getConnection(
							DATABASE_URL, "root", "" );
							// create Statement for deleting from table
							pstat = connection.prepareStatement("Delete From Invoice Where InvoiceID=?");
							pstat.setString(1, del); //(1, invoiceid)
							
							
							
							//Delete data in the database
							i = pstat.executeUpdate();
							JOptionPane.showMessageDialog(frmInvoiceTable, i + " record successfuly removed from database");
							
						 }
						catch(SQLException sqlException ) {
							sqlException.printStackTrace();
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
	}//end void initialise
}//end class
