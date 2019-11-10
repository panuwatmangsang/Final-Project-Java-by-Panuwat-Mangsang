package projectJava;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyLogin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyLogin window = new MyLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connect = null;
	private JTextField inputUsername;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public MyLogin() {
		initialize();
		connect=sqliteConnection.dbConnection();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 153, 255));
		frame.setBounds(100, 100, 631, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0E23\u0E49\u0E32\u0E19\u0E02\u0E32\u0E22\u0E1B\u0E25\u0E32\u0E2A\u0E27\u0E22\u0E07\u0E32\u0E21");
		label.setFont(new Font("Angsana New", Font.BOLD | Font.ITALIC, 35));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(190, 21, 258, 62);
		frame.getContentPane().add(label);
		
		JLabel lblUsern = new JLabel("UserName");
		lblUsern.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblUsern.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsern.setBounds(142, 111, 147, 33);
		frame.getContentPane().add(lblUsern);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(142, 155, 147, 33);
		frame.getContentPane().add(lblPassword);
		
		inputUsername = new JTextField();
		inputUsername.setFont(new Font("Angsana New", Font.BOLD, 30));
		inputUsername.setBounds(299, 111, 189, 33);
		frame.getContentPane().add(inputUsername);
		inputUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Angsana New", Font.BOLD, 30));
		passwordField.setBounds(299, 161, 189, 33);
		frame.getContentPane().add(passwordField);
		
		JButton btnOk = new JButton("Login");
		btnOk.setBackground(new Color(0, 255, 153));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from Login where Username=? and Password=?";
					
					//call Database
					PreparedStatement pst = connect.prepareStatement(query);
					pst.setString(1,inputUsername.getText());
					pst.setString(2,passwordField.getText());
					
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while((rs!=null) && (rs.next())){
						System.out.println(rs.getString("Name"));
						count++;
						
					}
					
					if(count == 1) {
						JOptionPane.showMessageDialog(null, "Username and Password is correct");
						//start connect TypeFish
						frame.dispose();
						TypeFish connectCarpFish = new TypeFish();
						connectCarpFish.setVisible(true);
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
		btnOk.setFont(new Font("Angsana New", Font.BOLD, 30));
		btnOk.setBounds(249, 234, 113, 33);
		frame.getContentPane().add(btnOk);
		
		JLabel lbGoldFish = new JLabel("");
		lbGoldFish.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lbGoldFish.setHorizontalAlignment(SwingConstants.CENTER);
		//add image
		Image img = new ImageIcon(this.getClass().getResource("/goldFish.png")).getImage();
		lbGoldFish.setIcon(new ImageIcon(img));
		
		lbGoldFish.setBounds(10, 177, 189, 141);
		frame.getContentPane().add(lbGoldFish);
		
		JLabel lbAllFish = new JLabel("");
		lbAllFish.setHorizontalAlignment(SwingConstants.CENTER);
		//add image
		Image allFish = new ImageIcon(this.getClass().getResource("/allFish.png")).getImage();
		lbAllFish.setIcon(new ImageIcon(allFish));
		lbAllFish.setBounds(381, 215, 189, 103);
		frame.getContentPane().add(lbAllFish);
		
		JLabel lbCartoonFish = new JLabel("");
		//add image
		Image cartoonFish = new ImageIcon(this.getClass().getResource("/cartoonFish.png")).getImage();
		lbCartoonFish.setIcon(new ImageIcon(cartoonFish));
		lbCartoonFish.setHorizontalAlignment(SwingConstants.CENTER);
		lbCartoonFish.setBounds(67, 21, 113, 62);
		frame.getContentPane().add(lbCartoonFish);
		
		JLabel lbYellowFish = new JLabel("");
		//add image
		Image yellowFish = new ImageIcon(this.getClass().getResource("/yellowFish.png")).getImage();
		lbYellowFish.setIcon(new ImageIcon(yellowFish));
		lbYellowFish.setHorizontalAlignment(SwingConstants.CENTER);
		lbYellowFish.setBounds(458, 21, 113, 75);
		frame.getContentPane().add(lbYellowFish);
	}
}
