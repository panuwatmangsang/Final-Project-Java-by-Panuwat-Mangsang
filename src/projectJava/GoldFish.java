package projectJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class GoldFish extends JFrame {

	private JPanel contentPaneGoldFish;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoldFish frame = new GoldFish();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public static String data; 
	public static String data2; 
	public static String data3;
	
	public GoldFish() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 381);
		contentPaneGoldFish = new JPanel();
		contentPaneGoldFish.setBackground(new Color(255, 255, 204));
		contentPaneGoldFish.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneGoldFish);
		contentPaneGoldFish.setLayout(null);
		
				
		JButton btnFinish = new JButton("\u0E2D\u0E2D\u0E01");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnFinish.setFont(new Font("Angsana New", Font.BOLD, 27));
		btnFinish.setBackground(new Color(51, 255, 51));
		btnFinish.setBounds(274, 273, 94, 39);
		contentPaneGoldFish.add(btnFinish);
		
		JLabel ty = new JLabel("");
		Image imgty = new ImageIcon(this.getClass().getResource("/ty.jpg")).getImage();
		ty.setIcon(new ImageIcon(imgty));
		ty.setBounds(74, 33, 264, 229);
		contentPaneGoldFish.add(ty);
	}
}
