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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class BettaFish extends JFrame {

	private JPanel contentPaneBettaFish;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BettaFish frame = new BettaFish();
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
	public BettaFish() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 381);
		contentPaneBettaFish = new JPanel();
		contentPaneBettaFish.setBackground(new Color(255, 153, 153));
		contentPaneBettaFish.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneBettaFish);
		contentPaneBettaFish.setLayout(null);
		
		JLabel label = new JLabel("\u0E1B\u0E25\u0E32\u0E01\u0E31\u0E14");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Angsana New", Font.BOLD, 30));
		label.setBounds(288, 11, 90, 42);
		contentPaneBettaFish.add(label);
		
		JButton button = new JButton("\u0E2A\u0E32\u0E22\u0E1E\u0E31\u0E19\u0E18\u0E38\u0E4C");
		button.setBackground(new Color(51, 204, 255));
		button.setFont(new Font("Angsana New", Font.BOLD, 27));
		button.setBounds(41, 58, 127, 42);
		contentPaneBettaFish.add(button);
		
		JButton button_1 = new JButton("\u0E04\u0E07\u0E40\u0E2B\u0E25\u0E37\u0E2D");
		button_1.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_1.setBackground(new Color(102, 102, 255));
		button_1.setBounds(189, 58, 99, 42);
		contentPaneBettaFish.add(button_1);
		
		JButton button_2 = new JButton("\u0E08\u0E33\u0E19\u0E27\u0E19\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23");
		button_2.setBackground(new Color(255, 153, 255));
		button_2.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_2.setBounds(447, 58, 178, 42);
		contentPaneBettaFish.add(button_2);
		
		JLabel label_1 = new JLabel("\u0E04\u0E23\u0E32\u0E27\u0E19\u0E4C\u0E40\u0E17\u0E25");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_1.setBounds(41, 111, 127, 33);
		contentPaneBettaFish.add(label_1);
		
		JLabel lblNewLabel = new JLabel("\u0E2E\u0E32\u0E25\u0E4C\u0E1F\u0E21\u0E39\u0E19");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel.setBounds(41, 168, 127, 33);
		contentPaneBettaFish.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("\u0E40\u0E14\u0E25\u0E15\u0E32");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_2.setBounds(41, 221, 127, 33);
		contentPaneBettaFish.add(label_2);
		
		JButton btnBetttaFish = new JButton("\u0E0B\u0E37\u0E49\u0E2D");
		btnBetttaFish.setBackground(new Color(51, 255, 51));
		btnBetttaFish.setFont(new Font("Angsana New", Font.BOLD, 27));
		btnBetttaFish.setBounds(287, 285, 110, 45);
		contentPaneBettaFish.add(btnBetttaFish);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			//connect page
			public void actionPerformed(ActionEvent e) {
				dispose();
				TypeFish backTypeFish = new TypeFish();
				backTypeFish.setVisible(true);
			}
		});
		//add image
		Image back = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnBack.setIcon(new ImageIcon(back));
		
		btnBack.setBackground(new Color(255, 153, 153));
		btnBack.setBounds(10, 285, 97, 46);
		contentPaneBettaFish.add(btnBack);
		
		JComboBox cbCrownTail = new JComboBox();
		cbCrownTail.setBounds(481, 116, 110, 33);
		contentPaneBettaFish.add(cbCrownTail);
		
		JComboBox cbHalfMoon = new JComboBox();
		cbHalfMoon.setBounds(481, 173, 110, 33);
		contentPaneBettaFish.add(cbHalfMoon);
		
		JComboBox cbDelda = new JComboBox();
		cbDelda.setBounds(481, 226, 110, 33);
		contentPaneBettaFish.add(cbDelda);
		
		JLabel label_3 = new JLabel("14");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_3.setBounds(189, 111, 99, 39);
		contentPaneBettaFish.add(label_3);
		
		JLabel label_4 = new JLabel("12");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_4.setBounds(189, 162, 99, 39);
		contentPaneBettaFish.add(label_4);
		
		JLabel label_5 = new JLabel("16");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_5.setBounds(189, 215, 99, 39);
		contentPaneBettaFish.add(label_5);
		
		JButton button_3 = new JButton("\u0E23\u0E32\u0E04\u0E32");
		button_3.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_3.setBackground(new Color(255, 102, 102));
		button_3.setBounds(314, 58, 112, 39);
		contentPaneBettaFish.add(button_3);
		
		JLabel lblNewLabel_1 = new JLabel("25");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_1.setBounds(314, 111, 110, 33);
		contentPaneBettaFish.add(lblNewLabel_1);
		
		JLabel label_6 = new JLabel("25");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_6.setBounds(314, 168, 110, 33);
		contentPaneBettaFish.add(label_6);
		
		JLabel label_7 = new JLabel("25");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_7.setBounds(314, 221, 110, 33);
		contentPaneBettaFish.add(label_7);
	}

}
