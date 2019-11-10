package projectJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class testSqlite {

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testSqlite window = new testSqlite();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connectEdit = null;
	private JFrame frame;
	private JTextField nameField;
	private JPasswordField passwordField;
	private JComboBox comboBoxTest;
	
	public void fillComboBox() {
		try {
			String query = "select * from Stock";
			PreparedStatement pst = connectEdit.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				comboBoxTest.addItem(rs.getInt("Number"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the application.
	 */
	public testSqlite() {
		initialize();
		connectEdit=sqliteConnectonStock.dbConnectionNumber();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 204, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTest = new JButton("test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from NumberOfFish where Breed=? and Number=?";
					
					//call Database
					PreparedStatement pst = connectEdit.prepareStatement(query);
					pst.setString(1,nameField.getText());
					pst.setString(2,passwordField.getText());
					
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while((rs!=null) && (rs.next())){
						System.out.println(rs.getString("Breed"));
						count++;
						
					}
					
					if(count == 1) {
						JOptionPane.showMessageDialog(null, "Username and Password is correct");
						
						//start connect TypeFish
						frame.dispose();
						TypeFish connectTypeFish = new TypeFish();
						connectTypeFish.setVisible(true);
						//end connect TypeFish
						
					}else if(count > 1) {
						JOptionPane.showMessageDialog(null, "Dublicate Username and Password");
					}else {
						JOptionPane.showMessageDialog(null, "Username and Password is not correct. Try again...");
					}
					rs.close();
					pst.close();
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnTest.setBackground(new Color(102, 255, 102));
		btnTest.setBounds(36, 216, 121, 34);
		frame.getContentPane().add(btnTest);
		
		nameField = new JTextField();
		nameField.setBounds(36, 89, 167, 34);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(36, 148, 168, 34);
		frame.getContentPane().add(passwordField);
		
		comboBoxTest = new JComboBox();
		comboBoxTest.setBounds(257, 40, 146, 26);
		frame.getContentPane().add(comboBoxTest);
		
		
	}
}
