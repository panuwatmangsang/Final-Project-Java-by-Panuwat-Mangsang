package projectJava;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;

public class CarpFish extends JFrame {

	
	private JPanel contentPaneCarpFish;
	private JComboBox cbCohaku;
	private JComboBox cbSunke;
	private JComboBox cbShowa;
	private JComboBox cbComet;
	private JComboBox cbAlrunda;
	private JComboBox cbBalloonEye;
	private JComboBox cbCrawnTail;
	private JComboBox cbHalfMoon;
	private JComboBox cbDelda;
	
	/**
	 * Launch the application.
	 */
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarpFish frame = new CarpFish();
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
	
	public static String value; 
	public static String value2; 
	public static String value3;
	public static String value4;
	public static String value5;
	public static String value6;
	public static String value7;
	public static String value8;
	public static String value9;
	
	public CarpFish() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 604);
		contentPaneCarpFish = new JPanel();
		contentPaneCarpFish.setBackground(new Color(102, 255, 102));
		contentPaneCarpFish.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneCarpFish);
		contentPaneCarpFish.setLayout(null);
		
		JLabel label = new JLabel("\u0E04\u0E38\u0E13\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E1B\u0E25\u0E32\u0E0A\u0E19\u0E34\u0E14/\u0E2A\u0E32\u0E22\u0E1E\u0E31\u0E19\u0E18\u0E38\u0E4C\u0E44\u0E2B\u0E19");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Angsana New", Font.BOLD, 30));
		label.setBounds(245, 11, 313, 45);
		contentPaneCarpFish.add(label);
		
		JLabel label_1 = new JLabel("\u0E42\u0E04\u0E2E\u0E32\u0E01\u0E38");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_1.setBounds(172, 117, 112, 31);
		contentPaneCarpFish.add(label_1);
		
		JLabel lblNewLabel = new JLabel("\u0E0B\u0E31\u0E19\u0E40\u0E01\u0E49");
		lblNewLabel.setFont(new Font("Angsana New", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(172, 156, 112, 31);
		contentPaneCarpFish.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E42\u0E0A\u0E27\u0E32");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(172, 198, 112, 31);
		contentPaneCarpFish.add(lblNewLabel_1);
		
		JButton button = new JButton("\u0E2A\u0E32\u0E22\u0E1E\u0E31\u0E19\u0E18\u0E38\u0E4C");
		button.setFont(new Font("Angsana New", Font.BOLD, 27));
		button.setBackground(new Color(0, 204, 255));
		button.setBounds(172, 67, 112, 39);
		contentPaneCarpFish.add(button);
		
		JButton button_1 = new JButton("\u0E04\u0E07\u0E40\u0E2B\u0E25\u0E37\u0E2D");
		button_1.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_1.setBackground(new Color(102, 153, 204));
		button_1.setBounds(306, 67, 106, 39);
		contentPaneCarpFish.add(button_1);
		
		JButton button_2 = new JButton("\u0E08\u0E33\u0E19\u0E27\u0E19");
		button_2.setBackground(new Color(255, 153, 255));
		button_2.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_2.setBounds(594, 67, 112, 39);
		contentPaneCarpFish.add(button_2);
		
		JButton btnBuyCarpFish = new JButton("\u0E0B\u0E37\u0E49\u0E2D");
		btnBuyCarpFish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				value =(String)cbCohaku.getSelectedItem();
				value2 =(String)cbSunke.getSelectedItem();
				value3 =(String)cbShowa.getSelectedItem();
				value4 =(String)cbComet.getSelectedItem();
				value5 =(String)cbAlrunda.getSelectedItem();
				value6 =(String)cbBalloonEye.getSelectedItem();
				value7 =(String)cbCrawnTail.getSelectedItem();
				value8 =(String)cbHalfMoon.getSelectedItem();
				value9 =(String)cbDelda.getSelectedItem();
				showStock connectShowStock = new showStock();
				connectShowStock.setVisible(true);
			}
		});
		btnBuyCarpFish.setBackground(new Color(51, 255, 51));
		btnBuyCarpFish.setFont(new Font("Angsana New", Font.BOLD, 30));
		btnBuyCarpFish.setBounds(329, 505, 112, 45);
		contentPaneCarpFish.add(btnBuyCarpFish);
		
		//################################################################################
		//start comboBox
		cbCohaku = new JComboBox();	
		cbCohaku.setToolTipText("");
		for(int i=0;i<=25;i++) {
			cbCohaku.addItem(String.valueOf(i)); 
		}
		cbCohaku.setBounds(604, 117, 89, 31);
		contentPaneCarpFish.add(cbCohaku);
		
		//################################################################################
		
		cbSunke = new JComboBox();
		cbSunke.setToolTipText("");
		for(int i=0;i<=24;i++) {
			cbSunke.addItem(String.valueOf(i));
		}
		cbSunke.setBounds(604, 159, 89, 31);
		contentPaneCarpFish.add(cbSunke);
		
		//################################################################################
		
		cbShowa = new JComboBox();
		cbShowa.setToolTipText("");
		for(int i=0;i<=22;i++) {
			cbShowa.addItem(String.valueOf(i));
		}
		cbShowa.setBounds(604, 201, 89, 31);
		contentPaneCarpFish.add(cbShowa);
		
		
		JLabel lblNewLabel_2 = new JLabel("25");
		lblNewLabel_2.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(306, 115, 106, 31);
		contentPaneCarpFish.add(lblNewLabel_2);
		
		JLabel label_2 = new JLabel("24");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_2.setBounds(306, 154, 106, 31);
		contentPaneCarpFish.add(label_2);
		
		JLabel label_3 = new JLabel("22");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_3.setBounds(306, 196, 106, 31);
		contentPaneCarpFish.add(label_3);
		
		JButton button_3 = new JButton("\u0E23\u0E32\u0E04\u0E32");
		button_3.setBackground(new Color(255, 102, 102));
		button_3.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_3.setBounds(446, 67, 112, 39);
		contentPaneCarpFish.add(button_3);
		
		JLabel lblNewLabel_3 = new JLabel("120");
		lblNewLabel_3.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(446, 115, 112, 31);
		contentPaneCarpFish.add(lblNewLabel_3);
		
		JLabel label_4 = new JLabel("110");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_4.setBounds(446, 154, 112, 31);
		contentPaneCarpFish.add(label_4);
		
		JLabel label_5 = new JLabel("100");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_5.setBounds(446, 196, 112, 31);
		contentPaneCarpFish.add(label_5);
		
		//################################################################################
		//start comboBox
		cbComet = new JComboBox();
		cbComet.setToolTipText("");
		for(int i=0;i<=23;i++) {
			cbComet.addItem(String.valueOf(i));
		}
		cbComet.setBounds(604, 243, 89, 31);
		contentPaneCarpFish.add(cbComet);
		
		//################################################################################
		
		cbAlrunda = new JComboBox();
		cbAlrunda.setToolTipText("");
		for(int i=0;i<=20;i++) {
			cbAlrunda.addItem(String.valueOf(i));
		}
		cbAlrunda.setBounds(604, 285, 89, 31);
		contentPaneCarpFish.add(cbAlrunda);
		
		//################################################################################
		
		cbBalloonEye = new JComboBox();
		cbBalloonEye.setToolTipText("");
		for(int i=0;i<=24;i++) {
			cbBalloonEye.addItem(String.valueOf(i));
		}
		cbBalloonEye.setBounds(604, 326, 89, 31);
		contentPaneCarpFish.add(cbBalloonEye);
		
		//################################################################################
		
		cbCrawnTail = new JComboBox();
		cbCrawnTail.setToolTipText("");
		for(int i=0;i<=14;i++) {
			cbCrawnTail.addItem(String.valueOf(i));
		}
		cbCrawnTail.setBounds(604, 368, 89, 31);
		contentPaneCarpFish.add(cbCrawnTail);
		
		//################################################################################
		
		cbHalfMoon = new JComboBox();
		cbHalfMoon.setToolTipText("");
		for(int i=0;i<=12;i++) {
			cbHalfMoon.addItem(String.valueOf(i));
		}
		cbHalfMoon.setBounds(604, 410, 89, 31);
		contentPaneCarpFish.add(cbHalfMoon);
		
		//################################################################################
		
		cbDelda = new JComboBox();
		cbDelda.setToolTipText("");
		for(int i=0;i<=16;i++) {
			cbDelda.addItem(String.valueOf(i));
		}
		cbDelda.setBounds(604, 452, 89, 31);
		contentPaneCarpFish.add(cbDelda);
		//end comboBox
		//################################################################################
		
		JLabel label_6 = new JLabel("\u0E42\u0E04\u0E40\u0E21\u0E17");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_6.setBounds(172, 240, 112, 31);
		contentPaneCarpFish.add(label_6);
		
		JLabel label_7 = new JLabel("\u0E2D\u0E2D\u0E23\u0E31\u0E19\u0E14\u0E32");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_7.setBounds(172, 282, 112, 31);
		contentPaneCarpFish.add(label_7);
		
		JLabel label_8 = new JLabel("\u0E15\u0E32\u0E25\u0E39\u0E01\u0E42\u0E1B\u0E48\u0E07");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_8.setBounds(172, 323, 112, 31);
		contentPaneCarpFish.add(label_8);
		
		JLabel label_9 = new JLabel("23");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_9.setBounds(306, 238, 106, 31);
		contentPaneCarpFish.add(label_9);
		
		JLabel label_10 = new JLabel("20");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_10.setBounds(306, 280, 106, 31);
		contentPaneCarpFish.add(label_10);
		
		JLabel label_11 = new JLabel("24");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_11.setBounds(306, 321, 106, 31);
		contentPaneCarpFish.add(label_11);
		
		JLabel label_12 = new JLabel("45");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_12.setBounds(446, 238, 112, 31);
		contentPaneCarpFish.add(label_12);
		
		JLabel label_13 = new JLabel("40");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_13.setBounds(446, 280, 112, 31);
		contentPaneCarpFish.add(label_13);
		
		JLabel label_14 = new JLabel("40");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_14.setBounds(446, 321, 112, 31);
		contentPaneCarpFish.add(label_14);
		
		JLabel label_15 = new JLabel("\u0E04\u0E23\u0E32\u0E27\u0E19\u0E4C\u0E40\u0E17\u0E25");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_15.setBounds(172, 368, 112, 31);
		contentPaneCarpFish.add(label_15);
		
		JLabel label_16 = new JLabel("25");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_16.setBounds(446, 363, 112, 31);
		contentPaneCarpFish.add(label_16);
		
		JLabel label_17 = new JLabel("25");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_17.setBounds(446, 405, 112, 31);
		contentPaneCarpFish.add(label_17);
		
		JLabel label_18 = new JLabel("25");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_18.setBounds(446, 447, 112, 31);
		contentPaneCarpFish.add(label_18);
		
		JLabel label_19 = new JLabel("14");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_19.setBounds(306, 363, 106, 31);
		contentPaneCarpFish.add(label_19);
		
		JLabel label_20 = new JLabel("12");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_20.setBounds(306, 405, 106, 31);
		contentPaneCarpFish.add(label_20);
		
		JLabel label_21 = new JLabel("16");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_21.setBounds(306, 447, 106, 31);
		contentPaneCarpFish.add(label_21);
		
		JLabel label_22 = new JLabel("\u0E2E\u0E32\u0E25\u0E4C\u0E1F\u0E21\u0E39\u0E25");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_22.setBounds(172, 410, 112, 31);
		contentPaneCarpFish.add(label_22);
		
		JLabel label_23 = new JLabel("\u0E40\u0E14\u0E25\u0E14\u0E32");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_23.setBounds(172, 452, 112, 31);
		contentPaneCarpFish.add(label_23);
		
		JButton button_4 = new JButton("\u0E0A\u0E19\u0E34\u0E14");
		button_4.setBackground(new Color(255, 204, 51));
		button_4.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_4.setBounds(35, 67, 106, 39);
		contentPaneCarpFish.add(button_4);
		
		JLabel label_24 = new JLabel("\u0E1B\u0E25\u0E32\u0E04\u0E23\u0E32\u0E1F");
		label_24.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setBounds(34, 117, 107, 31);
		contentPaneCarpFish.add(label_24);
		
		JLabel label_25 = new JLabel("\u0E1B\u0E25\u0E32\u0E17\u0E2D\u0E07");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_25.setBounds(35, 240, 107, 31);
		contentPaneCarpFish.add(label_25);
		
		JLabel label_26 = new JLabel("\u0E1B\u0E25\u0E32\u0E01\u0E31\u0E14");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Angsana New", Font.BOLD, 20));
		label_26.setBounds(35, 365, 107, 31);
		contentPaneCarpFish.add(label_26);
		
		
		

		
	}
}
