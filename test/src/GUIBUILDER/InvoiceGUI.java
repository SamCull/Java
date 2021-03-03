package GUIBUILDER;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InvoiceGUI {

	private JFrame frmInvoiceTable;
	private JTextField insertFirstNametextField;
	private JTextField insertLastNametextField;
	private JTextField insertDatetextField;
	private JTextField insertPricetextField;
	private JTextField insertQuantitytextField;
	private JTextField updateFirstNametextField;
	private JTextField updateLastNametextField;
	private JTextField updateDatetextField;
	private JTextField updatePricetextField;
	private JTextField updateQuantitytextField;
	private JTable invoicetable;
	private JTextField deleteFirstNametextField;
	private JTextField deleteLastNametextField;
	private JTextField deleteDatetextField;
	private JTextField deletePricetextField;
	private JTextField deleteQuantitytextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvoiceGUI window = new InvoiceGUI();
					window.frmInvoiceTable.setVisible(true);
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
		
		JLabel lblinsertFirstName = new JLabel("First Name");
		lblinsertFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertFirstName.setBounds(26, 21, 71, 26);
		insertI.add(lblinsertFirstName);
		
		JLabel lblinsertLastName = new JLabel("Last Name");
		lblinsertLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertLastName.setBounds(26, 59, 71, 26);
		insertI.add(lblinsertLastName);
		
		JLabel lblinsertDate = new JLabel("Date");
		lblinsertDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertDate.setBounds(26, 95, 56, 26);
		insertI.add(lblinsertDate);
		
		JLabel lblinsertPrice = new JLabel("Price");
		lblinsertPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertPrice.setBounds(26, 131, 56, 26);
		insertI.add(lblinsertPrice);
		
		JLabel lblinsertQuantity = new JLabel("Quantity");
		lblinsertQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinsertQuantity.setBounds(26, 167, 56, 26);
		insertI.add(lblinsertQuantity);
		
		insertFirstNametextField = new JTextField();
		insertFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		insertFirstNametextField.setBounds(117, 21, 137, 26);
		insertFirstNametextField.setColumns(10);
		insertI.add(insertFirstNametextField);
		
		insertLastNametextField = new JTextField();
		insertLastNametextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertLastNametextField.setBounds(117, 59, 137, 26);
		insertLastNametextField.setColumns(10);
		insertI.add(insertLastNametextField);
		
		insertDatetextField = new JTextField();
		insertDatetextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertDatetextField.setBounds(117, 96, 137, 26);
		insertDatetextField.setColumns(10);
		insertI.add(insertDatetextField);
		
		insertPricetextField = new JTextField();
		insertPricetextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertPricetextField.setBounds(117, 132, 137, 26);
		insertPricetextField.setColumns(10);
		insertI.add(insertPricetextField);
		
		insertQuantitytextField = new JTextField();
		insertQuantitytextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertQuantitytextField.setBounds(117, 167, 137, 26);
		insertQuantitytextField.setColumns(10);
		insertI.add(insertQuantitytextField);
		
		JButton btninsertSubmitButton = new JButton("Submit");
		btninsertSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btninsertSubmitButton.setBounds(296, 192, 85, 21);
		insertI.add(btninsertSubmitButton);
		//End of INSERT INVOICE
		
		
		//Start of UPDATE INVOICE
		JPanel updateI = new JPanel();
		tabbedPane.addTab("Update Invoice", null, updateI, null);
		updateI.setLayout(null);
		
		JLabel lblupdateFirstName = new JLabel("First Name");
		lblupdateFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateFirstName.setBounds(26, 21, 71, 26);
		updateI.add(lblupdateFirstName);
		
		JLabel lblupdateLastName = new JLabel("Last Name");
		lblupdateLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateLastName.setBounds(26, 59, 71, 26);
		updateI.add(lblupdateLastName);
		
		JLabel lblupdateDate = new JLabel("Date");
		lblupdateDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateDate.setBounds(26, 95, 56, 26);
		updateI.add(lblupdateDate);
		
		JLabel lblupdatePrice = new JLabel("Price");
		lblupdatePrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdatePrice.setBounds(26, 131, 56, 26);
		updateI.add(lblupdatePrice);
		
		JLabel lblupdateQuantity = new JLabel("Quantity");
		lblupdateQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblupdateQuantity.setBounds(26, 167, 56, 26);
		updateI.add(lblupdateQuantity);
		
		updateFirstNametextField = new JTextField();
		updateFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateFirstNametextField.setColumns(10);
		updateFirstNametextField.setBounds(117, 21, 137, 26);
		updateI.add(updateFirstNametextField);
		
		updateLastNametextField = new JTextField();
		updateLastNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateLastNametextField.setColumns(10);
		updateLastNametextField.setBounds(117, 59, 137, 26);
		updateI.add(updateLastNametextField);
		
		updateDatetextField = new JTextField();
		updateDatetextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateDatetextField.setColumns(10);
		updateDatetextField.setBounds(117, 96, 137, 26);
		updateI.add(updateDatetextField);
		
		updatePricetextField = new JTextField();
		updatePricetextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updatePricetextField.setColumns(10);
		updatePricetextField.setBounds(117, 132, 137, 26);
		updateI.add(updatePricetextField);
		
		updateQuantitytextField = new JTextField();
		updateQuantitytextField.setFont(new Font("Arial", Font.PLAIN, 12));
		updateQuantitytextField.setColumns(10);
		updateQuantitytextField.setBounds(117, 167, 137, 26);
		updateI.add(updateQuantitytextField);
		
		JButton btnpdateConfirmButton = new JButton("Confirm Changes");
		btnpdateConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnpdateConfirmButton.setBounds(262, 191, 144, 21);
		updateI.add(btnpdateConfirmButton);
		
		insertFirstNametextField = new JTextField();
		insertFirstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		insertFirstNametextField.setBounds(117, 21, 137, 26);
		insertFirstNametextField.setColumns(10);
		insertI.add(insertFirstNametextField);
		
		insertLastNametextField = new JTextField();
		insertLastNametextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertLastNametextField.setBounds(117, 59, 137, 26);
		insertLastNametextField.setColumns(10);
		insertI.add(insertLastNametextField);
		
		insertDatetextField = new JTextField();
		insertDatetextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertDatetextField.setBounds(117, 96, 136, 26);
		insertDatetextField.setColumns(10);
		insertI.add(insertDatetextField);
		
		insertPricetextField = new JTextField();
		insertPricetextField.setText("");
		insertPricetextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertPricetextField.setBounds(117, 132, 136, 26);
		insertPricetextField.setColumns(10);
		insertI.add(insertPricetextField);
		
		insertQuantitytextField = new JTextField();
		insertQuantitytextField.setFont(new Font("Arial", Font.PLAIN, 12)); //User last name field input
		insertQuantitytextField.setBounds(117, 167, 136, 26);
		insertQuantitytextField.setColumns(10);
		insertI.add(insertQuantitytextField);
		
		JButton btnupdateSubmitButton = new JButton("Submit");
		btninsertSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btninsertSubmitButton.setBounds(296, 192, 85, 21);
		insertI.add(btninsertSubmitButton);
		
		//Start of DISPLAY INVOICE
		JPanel displayI = new JPanel();
		tabbedPane.addTab("Display Invoice", null, displayI, null);
		displayI.setLayout(null);
		
		invoicetable = new JTable();
		invoicetable.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		invoicetable.setFont(new Font("Arial", Font.BOLD, 12));
		invoicetable.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "First Name", "Last Name", "Date", "Price", "Quantity"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		invoicetable.setBounds(10, 10, 411, 159);
		invoicetable.getColumnModel().getColumn(0).setPreferredWidth(85);
		invoicetable.getColumnModel().getColumn(1).setPreferredWidth(85);
		invoicetable.getColumnModel().getColumn(2).setPreferredWidth(85);
		invoicetable.getColumnModel().getColumn(3).setPreferredWidth(85);
		invoicetable.setBounds(10, 10, 391, 140);
		displayI.add(invoicetable);
		
		JButton btndisplayCloseButton = new JButton("Close");
		btndisplayCloseButton.addActionListener(new ActionListener() { //Call action to close DISPLAY table
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btndisplayCloseButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btndisplayCloseButton.setBounds(269, 160, 112, 21);
		displayI.add(btndisplayCloseButton);
		//End of DISPLAY INVOICE
		
		
		
		//Start of DELETE INVOICE
		JPanel deleteI = new JPanel();
		tabbedPane.addTab("Delete Invoice", null, deleteI, null);
		deleteI.setLayout(null);
		
		JLabel lbldeleteFirstName = new JLabel("First name");
		lbldeleteFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeleteFirstName.setBounds(26, 21, 71, 26);
		deleteI.add(lbldeleteFirstName);
		
		JLabel lbldeleteLastName = new JLabel("Last Name");
		lbldeleteLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeleteLastName.setBounds(26, 59, 71, 26);
		deleteI.add(lbldeleteLastName);
		
		JLabel lbldeleteDate = new JLabel("Date");
		lbldeleteDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeleteDate.setBounds(26, 95, 56, 26);
		deleteI.add(lbldeleteDate);
		
		JLabel lbldeletePrice = new JLabel("Price");
		lbldeletePrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeletePrice.setBounds(26, 131, 56, 26);
		deleteI.add(lbldeletePrice);
		
		JLabel lbldeleteQuantity = new JLabel("Quantity");
		lbldeleteQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbldeleteQuantity.setBounds(26, 167, 56, 26);
		deleteI.add(lbldeleteQuantity);
		
		deleteFirstNametextField = new JTextField();
		deleteFirstNametextField.setBounds(117, 21, 137, 26);
		deleteI.add(deleteFirstNametextField);
		deleteFirstNametextField.setColumns(10);
		
		deleteLastNametextField = new JTextField();
		deleteLastNametextField.setBounds(117, 59, 137, 26);
		deleteI.add(deleteLastNametextField);
		deleteLastNametextField.setColumns(10);
		
		deleteDatetextField = new JTextField();
		deleteDatetextField.setBounds(117, 96, 137, 26);
		deleteI.add(deleteDatetextField);
		deleteDatetextField.setColumns(10);
		
		deletePricetextField = new JTextField();
		deletePricetextField.setBounds(117, 132, 137, 26);
		deleteI.add(deletePricetextField);
		deletePricetextField.setColumns(10);
		
		deleteQuantitytextField = new JTextField();
		deleteQuantitytextField.setBounds(117, 167, 137, 26);
		deleteI.add(deleteQuantitytextField);
		deleteQuantitytextField.setColumns(10);
		
		JButton btndeleteDeleteButton = new JButton("Delete");
		btndeleteDeleteButton.setBackground(Color.decode("#FF3A3A"));
		btndeleteDeleteButton.setBounds(299, 189, 85, 21);
		btndeleteDeleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteI.add(btndeleteDeleteButton);
	}
}
