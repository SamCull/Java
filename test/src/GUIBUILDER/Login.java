package GUIBUILDER;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { 
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(34, 52, 100, 30); //Details on "Username" box
		frame.getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(34, 157, 100, 30); //Details on "Password" box
		frame.getContentPane().add(lblPassword);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 12));
		username.setBounds(175, 54, 142, 30); //Details on "Username" textbox
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(175, 159, 142, 30); //Details on "Password" box
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			//ADDED FROM DESIGN PAGE
			public void actionPerformed(ActionEvent e) {
				String uname = username.getText();
				String pwd = passwordField.getText();
				
				if(uname.equals("name") && pwd.equals("password")) {
					JOptionPane.showMessageDialog(frame, "You have logged in ");
				}
				else {
					JOptionPane.showMessageDialog(frame, "Invalid username/password entered ");
				}
			}
		});
		btnNewButton.setBounds(138, 218, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
