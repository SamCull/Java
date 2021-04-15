package GUIBUILDER;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class SearchResultProduct implements ActionListener{
	JFrame frame, frame1;
	JTextField textbox;
	JLabel displayCustomerlabel;
	JButton displayCustomerbutton;
	JPanel panel;
	static JTable table;

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/project";
	String userName = "root";
	String password = "";
	String[] columnNames = {"ProductID", "ProductName", "ProductPrice", "ProductQuantity"};

	public void createUI()
	{
	frame = new JFrame("Database Search Result");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	textbox = new JTextField();
	textbox.setBounds(120,30,150,20); 
	displayCustomerlabel = new JLabel("ProductID: "); //Label
	displayCustomerlabel.setBounds(10, 30, 100, 20);
	displayCustomerbutton = new JButton("Search DB"); //Search button
	displayCustomerbutton.setBounds(120,130,150,20);
	displayCustomerbutton.addActionListener(this);

	frame.add(textbox);
	frame.add(displayCustomerlabel);
	frame.add(displayCustomerbutton);
	frame.setVisible(true);
	frame.setSize(500, 400); 
	} 

	public void actionPerformed(ActionEvent ae)
	{
	displayCustomerbutton = (JButton)ae.getSource();
	System.out.println("Showing Table Data.......");
	showTableData(); 
	} 

	public void showTableData()
	{

	frame1 = new JFrame("Database Search Result");
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setLayout(new BorderLayout()); 
	//TableModel tm = new TableModel();
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columnNames);
	//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
	//table = new JTable(model);
	table = new JTable();
	table.setModel(model); 
	table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	table.setFillsViewportHeight(true);
	JScrollPane scroll = new JScrollPane(table);
	scroll.setHorizontalScrollBarPolicy(
	JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	scroll.setVerticalScrollBarPolicy(
	JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
	String textvalue = textbox.getText();
	String prodID= "";
	String prodname= "";
	String prodprice = "";
	String prodquantity = "";
	try
	{ 
	Class.forName(driverName); 
	Connection con = DriverManager.getConnection(url, userName, password);
	String sql = "select * from product where ProductID= "+textvalue;
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	int i =0;
	if(rs.next())
	{
	prodID = rs.getString("ProductID");
	prodname = rs.getString("ProductName");
	prodprice = rs.getString("ProductPrice");
	prodquantity = rs.getString("ProductQuantity"); 
	model.addRow(new Object[]{prodID, prodname, prodprice, prodquantity});
	i++; 
	}
	if(i <1)
	{
	JOptionPane.showMessageDialog(null, "No Record Found","Error",
	JOptionPane.ERROR_MESSAGE);
	}
	if(i ==1)
	{
	System.out.println(i+" Record Found");
	}
	else
	{
	System.out.println(i+" Records Found");
	}
	}
	catch(Exception ex)
	{
	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
	JOptionPane.ERROR_MESSAGE);
	}
	frame1.add(scroll);
	frame1.setVisible(true);
	frame1.setSize(400,300);
	}

	public static void main(String args[])
	{
	SearchResultInvoice sr = new SearchResultInvoice();
	sr.createUI(); 
	}
	}
