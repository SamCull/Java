package GUIBUILDER;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ProductGUI {

	private JFrame frmProductTable;
	private JTextField insertProductNametextField;
	private JTextField insertProductPricetextField;
	private JTextField insertProductQuantitytextField;
	private JTextField updateProductNametextField;
	private JTextField updateProductPricetextField;
	private JTextField updateProductQuantitytextField;
	private JTable producttable;

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
		
		
		//Start of INSERT CUSTOMER
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
		insertP.add(insertProductNametextField);
		insertProductNametextField.setColumns(10);
		
		insertProductPricetextField = new JTextField();
		insertProductPricetextField.setColumns(10);
		insertProductPricetextField.setBounds(153, 73, 148, 26);
		insertP.add(insertProductPricetextField);
		
		insertProductQuantitytextField = new JTextField();
		insertProductQuantitytextField.setColumns(10);
		insertProductQuantitytextField.setBounds(153, 121, 148, 26);
		insertP.add(insertProductQuantitytextField);
			
		JButton btninsertSubmitButton = new JButton("Submit");
		btninsertSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btninsertSubmitButton.setBounds(296, 158, 85, 21);
		insertP.add(btninsertSubmitButton);
			//End of Insert Customer
		
		
		//Start of UPDATE CUSTOMER
		JPanel updateC = new JPanel();
		tabbedPane.addTab("Update Product", null, updateC, null);
		updateC.setLayout(null);
		
		JLabel lblupdateProductName = new JLabel("Product Name");
		lblupdateProductName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateProductName.setBounds(26, 21, 92, 26);
		updateC.add(lblupdateProductName);
		
		JLabel lblupdateProductPrice = new JLabel("Product Price");
		lblupdateProductPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateProductPrice.setBounds(26, 71, 92, 26);
		updateC.add(lblupdateProductPrice);
		
		JLabel lblupdatePhoneNum = new JLabel("Product Quantity");
		lblupdatePhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdatePhoneNum.setBounds(26, 121, 108, 26);
		updateC.add(lblupdatePhoneNum);
		
		JButton btnupdateConfirmButton = new JButton("Confirm Changes");
		btnupdateConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnupdateConfirmButton.setBounds(237, 158, 139, 21);
		updateC.add(btnupdateConfirmButton);
		
		updateProductNametextField = new JTextField();
		updateProductNametextField.setColumns(10);
		updateProductNametextField.setBounds(149, 21, 148, 26);
		updateC.add(updateProductNametextField);
		
		updateProductPricetextField = new JTextField();
		updateProductPricetextField.setColumns(10);
		updateProductPricetextField.setBounds(149, 73, 148, 26);
		updateC.add(updateProductPricetextField);
		
		updateProductQuantitytextField = new JTextField();
		updateProductQuantitytextField.setColumns(10);
		updateProductQuantitytextField.setBounds(149, 121, 148, 26);
		updateC.add(updateProductQuantitytextField);
		//End of Update Customer
		
		
		
		//Start of DISPLAY CUSTOMER
		JPanel displayC = new JPanel();
		tabbedPane.addTab("Display Product", null, displayC, null);
		displayC.setLayout(null);
		
		producttable = new JTable();
		producttable.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		producttable.setFont(new Font("Arial", Font.BOLD, 12));
		producttable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Product ID", "Product Name", "Product Price", "Product Quantity"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Product ID", "Product Name", "Product Price", "Product Quantity"
			}
		));
		producttable.setBounds(10, 10, 391, 128);
		displayC.add(producttable);
		//End of Display Customer
		
		
		//Start of DELETE CUSTOMER
		JPanel deleteC = new JPanel();
		tabbedPane.addTab("Delete Product", null, deleteC, null);
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
		

		
		JButton btndeleteDeleteButton = new JButton("Delete");
		btndeleteDeleteButton.setBackground(Color.decode("#FF3A3A"));
		btndeleteDeleteButton.setBounds(296, 158, 85, 21);
		btndeleteDeleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteC.add(btndeleteDeleteButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 252, 411, 1);
		frmProductTable.getContentPane().add(panel);
	}
}
