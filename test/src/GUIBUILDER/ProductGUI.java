package GUIBUILDER;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ProductGUI {

	private JFrame frmProductTable;
	private JTextField insertProductNametextField;
	private JTextField insertProductPricetextField;				
	private JTextField insertProductQuantitytextField;		
	private JTextField updateProductNametextField;				
	private JTextField updateProductPricetextField;				
	private JTextField updateProductQuantitytextField;
	private JTextField deleteProductIDtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductGUI window = new ProductGUI();
					window.frmProductTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProductGUI() {
		initialize();
		frmProductTable.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProductTable = new JFrame();
		frmProductTable.setFont(new Font("Dialog", Font.BOLD, 12));
		frmProductTable.setTitle("Product Table");
		frmProductTable.setBounds(100, 100, 450, 300);
		frmProductTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProductTable.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 416, 232);
		frmProductTable.getContentPane().add(tabbedPane);
		
		
		//Start of INSERT product
		JPanel insertP = new JPanel();
		tabbedPane.addTab("Insert Product", null, insertP, null);
		insertP.setLayout(null);
		
		JLabel lblinsertProductName = new JLabel("Product name");
		lblinsertProductName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertProductName.setBounds(26, 21, 91, 26);
		insertP.add(lblinsertProductName);
		
		JLabel lblinsertProductPrice = new JLabel("Product Price");
		lblinsertProductPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertProductPrice.setBounds(26, 71, 91, 26);
		insertP.add(lblinsertProductPrice);
		
		JLabel lblinsertProductQuantity = new JLabel("Product Quantity");
		lblinsertProductQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertProductQuantity.setBounds(26, 121, 112, 26);
		insertP.add(lblinsertProductQuantity);
				
		insertProductNametextField = new JTextField();
		insertProductNametextField.setBounds(153, 23, 148, 26);
		insertProductNametextField.setColumns(10);
		insertP.add(insertProductNametextField);

		
		insertProductPricetextField = new JTextField();
		insertProductPricetextField.setColumns(10);
		insertProductPricetextField.setBounds(153, 73, 148, 26);
		insertP.add(insertProductPricetextField);
		
		insertProductQuantitytextField = new JTextField();
		insertProductQuantitytextField.setColumns(10);
		insertProductQuantitytextField.setBounds(153, 121, 148, 26);
		insertP.add(insertProductQuantitytextField);
		
		JPanel p = new JPanel();	
		JButton btninsertSubmitButton = new JButton("Submit");
		btninsertSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btninsertSubmitButton.setBounds(296, 158, 85, 21);
		insertP.add(btninsertSubmitButton);
		
		//Inserting CONNECTION TO SQL for INSERT PRODUCT
		frmProductTable.getContentPane().add(p);
		btninsertSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();

		        if (source == btninsertSubmitButton) { // if submit button is called
		        	
		        		final String DATABASE_URL = "jdbc:mysql://localhost/project";
		        		Connection connection = null ;
		        		PreparedStatement pstat = null;
		        		String productname = insertProductNametextField.getText();
		        		String productprice = insertProductPricetextField.getText();
		        		String productquantity= insertProductQuantitytextField.getText();
		        		
		        		int i = 0;
		        		
		        		{
		        			try {
		        		// establish connection to database
		        		connection = DriverManager.getConnection(DATABASE_URL, "root", "" );
		        		// create Prepared Statement for inserting data into table
		        		pstat = connection.prepareStatement("INSERT INTO Product (ProductName, ProductPrice, ProductQuantity ) VALUES (?,?,?)");
		        		pstat . setString (1, productname );
		        		pstat . setString (2, productprice);
		        		pstat . setString (3, productquantity);
		        		// insert data into table
		        		i = pstat .executeUpdate();
		        		JOptionPane.showMessageDialog(frmProductTable, i + " product added to database ");
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
		//End of Insert Product
		
		
			//End of Insert Product
		
		
		//Start of UPDATE Product
		JPanel updateP = new JPanel();
		tabbedPane.addTab("Update Product", null, updateP, null);
		updateP.setLayout(null);
		
		JLabel lblupdateProductName = new JLabel("Product Name");
		lblupdateProductName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateProductName.setBounds(26, 21, 92, 26);
		updateP.add(lblupdateProductName);
		
		JLabel lblupdateProductPrice = new JLabel("Product Price");
		lblupdateProductPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateProductPrice.setBounds(26, 71, 92, 26);
		updateP.add(lblupdateProductPrice);
		
		JLabel lblupdatePhoneNum = new JLabel("Product Quantity");
		lblupdatePhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdatePhoneNum.setBounds(26, 121, 108, 26);
		updateP.add(lblupdatePhoneNum);
		
		JButton btnupdateConfirmButton = new JButton("Confirm Changes");
		btnupdateConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnupdateConfirmButton.setBounds(237, 158, 139, 21);
		updateP.add(btnupdateConfirmButton);
		
		updateProductNametextField = new JTextField();
		updateProductNametextField.setColumns(10);
		updateProductNametextField.setBounds(149, 21, 148, 26);
		updateP.add(updateProductNametextField);
		
		updateProductPricetextField = new JTextField();
		updateProductPricetextField.setColumns(10);
		updateProductPricetextField.setBounds(149, 73, 148, 26);
		updateP.add(updateProductPricetextField);
		
		updateProductQuantitytextField = new JTextField();
		updateProductQuantitytextField.setColumns(10);
		updateProductQuantitytextField.setBounds(149, 121, 148, 26);
		updateP.add(updateProductQuantitytextField);
		
		frmProductTable.getContentPane().add(p);
		btnupdateConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();

		        if (source == btnupdateConfirmButton) { // if update button is called
		        	final String DATABASE_URL = "jdbc:mysql://localhost/project";
					
			        String productname = updateProductNametextField.getText();
			        String productprice = updateProductPricetextField.getText();
			        String productquantity = updateProductQuantitytextField.getText();
						Connection connection = null;
						PreparedStatement pstat = null;
						int i =0;
									
						try{
				              // establish connection to database
				              connection = DriverManager.getConnection(
				                  DATABASE_URL, "root","");
				              // create Prepared Statement for updating table
				              pstat = connection.prepareStatement("Update Product SET ProductQuantity = ?, ProductPrice = ? WHERE ProductName = ?" );
				              //replaces position of ? with first and last name and phone number
				              pstat.setString(1, productquantity);
				              pstat.setString(2, productprice);
				              pstat.setString(3, productname);
				              

				              //Update data in database
				              i = pstat.executeUpdate();
				              JOptionPane.showMessageDialog(frmProductTable, i + " product details updated in database ");				          
				              }//end try
				          catch(SQLException sqlException ) {
				        	  JOptionPane.showMessageDialog(frmProductTable, "Too many numbers added for phone number, max 10 numbers only"); // if > than 10 numbers in phone

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
		
		
		
		//End of Update product
		
		
		
		//Start of DISPLAY product
		JPanel displayP = new JPanel();
		tabbedPane.addTab("Display Product", null, displayP, null);
		displayP.setLayout(null);
		
	 	JButton btndisplayProductButton = new JButton("Display");
	 	btndisplayProductButton.setBounds(140, 90, 125, 46);
	 	displayP.add(btndisplayProductButton);

 
	btndisplayProductButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			//Object source = event.getSource();
	if(event.getSource() == btndisplayProductButton) {
		//btndisplayproductButton showTable = new JWindow();
		SearchResultProduct sr = new SearchResultProduct(); 
		sr.createUI();
			}//end if
		}//end actionPerformed
});//end ActionListener
	
	
		//End of Display product
		
		
		//Start of DELETE product
		JPanel deleteP = new JPanel();
		tabbedPane.addTab("Delete Product", null, deleteP, null);
		deleteP.setLayout(null);
		
		JLabel lbldeleteProductID = new JLabel("ProductID");
		lbldeleteProductID.setFont(new Font("Tahoma", Font.BOLD, 12));	//product LABEL
		lbldeleteProductID.setBounds(35, 88, 85, 26);
		deleteP.add(lbldeleteProductID);
		
		deleteProductIDtextField = new JTextField();
		deleteProductIDtextField.setFont(new Font("Arial", Font.PLAIN, 12));	//TEXTFIELD
		deleteProductIDtextField.setColumns(10);
		deleteProductIDtextField.setBackground(Color.WHITE);
		deleteProductIDtextField.setBounds(165, 89, 172, 26);
		deleteP.add(deleteProductIDtextField);
		
		JButton btndeleteDeleteButton = new JButton("Delete");
		btndeleteDeleteButton.setBackground(Color.decode("#FF3A3A"));	//BUTTON
		btndeleteDeleteButton.setBounds(296, 158, 85, 21);
		btndeleteDeleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteP.add(btndeleteDeleteButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 252, 411, 1);
		frmProductTable.getContentPane().add(panel);
		
		frmProductTable.getContentPane().add(p);
		btndeleteDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object source = event.getSource();
				
				 if (source == btndeleteDeleteButton) { // if submit button is called
						final String DATABASE_URL = "jdbc:mysql://localhost/project";
						
						Connection connection = null;
						PreparedStatement pstat = null;	
						
						String del= deleteProductIDtextField.getText();
						
						
						int i = 0; //used to tell user if entry was successful	
						
						try{
							// establish connection to database
							connection = DriverManager.getConnection(
							DATABASE_URL, "root", "" );
							// create Statement for deleting from table
							pstat = connection.prepareStatement("Delete From Product Where ProductID=?");
							pstat.setString(1, del); //(1, productid)
							
							
							
							//Delete data in the database
							i = pstat.executeUpdate();
							JOptionPane.showMessageDialog(frmProductTable, i + " record successfuly removed from database,");
							
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

	}
}
