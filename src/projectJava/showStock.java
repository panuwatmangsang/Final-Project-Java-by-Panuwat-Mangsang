package projectJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class showStock extends JFrame {

	private JPanel sumTest1;
	private JTextField showMyStockCohaku;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showStock frame = new showStock();
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
	
	private JTextField sumCohaku;
	private JTextField sumSunke;
	private JTextField showMyStockShowa;
	private JTextField sumShowa;
	private JTextField showMyStockComet;
	private JTextField showMyStockAlrunda;
	private JTextField showMyStockBalloonEye;
	private JTextField sumComet;
	private JTextField sumAlrunda;
	private JTextField sumBalloonEye;
	private JTextField showMyStockCom;
	private JTextField showMyStockAl;
	private JTextField sumCom;
	private JTextField sumAl;
	private JTextField showMyStockSunke;
	private JTextField showMyStockBall;
	private JTextField sumBall;
	private JTextField showMyStockCrawn;
	private JTextField sumCrawn;
	private JTextField showMyStockHalf;
	private JTextField sumHalf;
	private JTextField showMyStockDelda;
	private JTextField sumDelda;
	private JTextField total;
	private JTextField inp;
	private JTextField change;
	
	public static int money;
	public static int result;
	public static String myChange;
	
	public showStock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 532);
		sumTest1 = new JPanel();
		sumTest1.setBackground(new Color(102, 204, 255));
		sumTest1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(sumTest1);
		sumTest1.setLayout(null);
		
		
		
		showMyStockCohaku = new JTextField();
		showMyStockCohaku.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockCohaku.setEditable(false);
		showMyStockCohaku.setText(CarpFish.value);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockCohaku.setBounds(621, 122, 86, 20);
		sumTest1.add(showMyStockCohaku);
		showMyStockCohaku.setColumns(10);
		
		sumCohaku = new JTextField();
		sumCohaku.setHorizontalAlignment(SwingConstants.CENTER);
		sumCohaku.setEditable(false);
		sumCohaku.setText("");
		sumCohaku.setText(String.valueOf(25 - Integer.valueOf(CarpFish.value)));
		sumCohaku.setBounds(486, 122, 86, 20);
		sumTest1.add(sumCohaku);
		sumCohaku.setColumns(10);
		
		sumSunke = new JTextField();
		sumSunke.setHorizontalAlignment(SwingConstants.CENTER);
		sumSunke.setEditable(false);
		sumSunke.setText("");
		sumSunke.setText(String.valueOf(24 - Integer.valueOf(CarpFish.value2)));
		sumSunke.setBounds(486, 153, 86, 20);
		sumTest1.add(sumSunke);
		sumSunke.setColumns(10);
		
		showMyStockShowa = new JTextField();
		showMyStockShowa.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockShowa.setEditable(false);
		showMyStockShowa.setText(CarpFish.value3);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockShowa.setBounds(621, 184, 86, 20);
		sumTest1.add(showMyStockShowa);
		showMyStockShowa.setColumns(10);
		
		sumShowa = new JTextField();
		sumShowa.setHorizontalAlignment(SwingConstants.CENTER);
		sumShowa.setEditable(false);
		sumShowa.setText("");
		sumShowa.setText(String.valueOf(22 - Integer.valueOf(CarpFish.value3)));
		sumShowa.setBounds(486, 184, 86, 20);
		sumTest1.add(sumShowa);
		sumShowa.setColumns(10);
		
		showMyStockCom = new JTextField();
		showMyStockCom.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockCom.setEditable(false);
		showMyStockCom.setText(CarpFish.value4);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockCom.setBounds(621, 215, 86, 20);
		sumTest1.add(showMyStockCom);
		showMyStockCom.setColumns(10);
		
		showMyStockAl = new JTextField();
		showMyStockAl.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockAl.setEditable(false);
		showMyStockAl.setText(CarpFish.value5);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockAl.setBounds(621, 246, 86, 20);
		sumTest1.add(showMyStockAl);
		showMyStockAl.setColumns(10);
		
		sumCom = new JTextField();
		sumCom.setHorizontalAlignment(SwingConstants.CENTER);
		sumCom.setEditable(false);
		sumCom.setText(String.valueOf(23 - Integer.valueOf(CarpFish.value4)));
		sumCom.setBounds(486, 215, 86, 20);
		sumTest1.add(sumCom);
		sumCom.setColumns(10);
		
		sumAl = new JTextField();
		sumAl.setHorizontalAlignment(SwingConstants.CENTER);
		sumAl.setEditable(false);
		sumAl.setText(String.valueOf(20 - Integer.valueOf(CarpFish.value5)));
		sumAl.setBounds(486, 246, 86, 20);
		sumTest1.add(sumAl);
		sumAl.setColumns(10);
		
		showMyStockSunke = new JTextField();
		showMyStockSunke.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockSunke.setEditable(false);
		showMyStockSunke.setText(CarpFish.value2);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockSunke.setBounds(621, 153, 86, 20);
		sumTest1.add(showMyStockSunke);
		showMyStockSunke.setColumns(10);
		
		showMyStockBall = new JTextField();
		showMyStockBall.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockBall.setEditable(false);
		showMyStockBall.setText(CarpFish.value6);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockBall.setBounds(621, 277, 86, 20);
		sumTest1.add(showMyStockBall);
		showMyStockBall.setColumns(10);
		
		sumBall = new JTextField();
		sumBall.setHorizontalAlignment(SwingConstants.CENTER);
		sumBall.setEditable(false);
		sumBall.setText(String.valueOf(24 - Integer.valueOf(CarpFish.value6)));
		sumBall.setBounds(486, 277, 86, 20);
		sumTest1.add(sumBall);
		sumBall.setColumns(10);
		
		showMyStockCrawn = new JTextField();
		showMyStockCrawn.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockCrawn.setEditable(false);
		showMyStockCrawn.setText(CarpFish.value7);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockCrawn.setBounds(621, 308, 86, 20);
		sumTest1.add(showMyStockCrawn);
		showMyStockCrawn.setColumns(10);
		
		sumCrawn = new JTextField();
		sumCrawn.setHorizontalAlignment(SwingConstants.CENTER);
		sumCrawn.setEditable(false);
		sumCrawn.setText(String.valueOf(14 - Integer.valueOf(CarpFish.value7)));
		sumCrawn.setBounds(486, 308, 86, 20);
		sumTest1.add(sumCrawn);
		sumCrawn.setColumns(10);
		
		showMyStockHalf = new JTextField();
		showMyStockHalf.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockHalf.setEditable(false);
		showMyStockHalf.setText(CarpFish.value8);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockHalf.setBounds(621, 339, 86, 20);
		sumTest1.add(showMyStockHalf);
		showMyStockHalf.setColumns(10);
		
		sumHalf = new JTextField();
		sumHalf.setHorizontalAlignment(SwingConstants.CENTER);
		sumHalf.setEditable(false);
		sumHalf.setText(String.valueOf(12 - Integer.valueOf(CarpFish.value8)));
		sumHalf.setBounds(486, 339, 86, 20);
		sumTest1.add(sumHalf);
		sumHalf.setColumns(10);
		
		showMyStockDelda = new JTextField();
		showMyStockDelda.setHorizontalAlignment(SwingConstants.CENTER);
		showMyStockDelda.setEditable(false);
		showMyStockDelda.setText(CarpFish.value9);   //sum = String.valueOf(25 - Integer.valueOf(CarpFish.value));
		showMyStockDelda.setBounds(621, 370, 86, 20);
		sumTest1.add(showMyStockDelda);
		showMyStockDelda.setColumns(10);
		
		sumDelda = new JTextField();
		sumDelda.setHorizontalAlignment(SwingConstants.CENTER);
		sumDelda.setEditable(false);
		sumDelda.setText(String.valueOf(16 - Integer.valueOf(CarpFish.value9)));
		sumDelda.setBounds(486, 370, 86, 20);
		sumTest1.add(sumDelda);
		sumDelda.setColumns(10);
		
		//##############################################################################################################
		
		JLabel lblNewLabel = new JLabel("\u0E2A\u0E34\u0E49\u0E19\u0E04\u0E49\u0E32\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Angsana New", Font.BOLD, 30));
		lblNewLabel.setBounds(386, 13, 296, 41);
		sumTest1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u0E2A\u0E34\u0E49\u0E19\u0E04\u0E49\u0E32\u0E04\u0E07\u0E40\u0E2B\u0E25\u0E37\u0E2D");
		btnNewButton.setBackground(new Color(51, 255, 102));
		btnNewButton.setFont(new Font("Angsana New", Font.BOLD, 25));
		btnNewButton.setBounds(463, 65, 133, 41);
		sumTest1.add(btnNewButton);
		
		JButton button = new JButton("\u0E08\u0E33\u0E19\u0E27\u0E19");
		button.setBackground(new Color(204, 153, 255));
		button.setFont(new Font("Angsana New", Font.BOLD, 25));
		button.setBounds(621, 65, 86, 41);
		sumTest1.add(button);
		
		JButton button_1 = new JButton("\u0E23\u0E32\u0E04\u0E32");
		button_1.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_1.setBackground(new Color(255, 102, 102));
		button_1.setBounds(315, 65, 117, 41);
		sumTest1.add(button_1);
		
		JLabel label = new JLabel("120");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Angsana New", Font.BOLD, 25));
		label.setBounds(315, 122, 117, 20);
		sumTest1.add(label);
		
		JLabel label_1 = new JLabel("110");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_1.setBounds(315, 153, 117, 20);
		sumTest1.add(label_1);
		
		JLabel label_2 = new JLabel("100");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_2.setBounds(315, 184, 117, 20);
		sumTest1.add(label_2);
		
		JLabel label_3 = new JLabel("45");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_3.setBounds(315, 215, 117, 20);
		sumTest1.add(label_3);
		
		JLabel label_4 = new JLabel("40");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_4.setBounds(315, 246, 117, 20);
		sumTest1.add(label_4);
		
		JLabel label_5 = new JLabel("40");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_5.setBounds(315, 277, 117, 20);
		sumTest1.add(label_5);
		
		JLabel label_6 = new JLabel("25");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_6.setBounds(315, 308, 117, 20);
		sumTest1.add(label_6);
		
		JLabel label_7 = new JLabel("25");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_7.setBounds(315, 339, 117, 20);
		sumTest1.add(label_7);
		
		JLabel label_8 = new JLabel("25");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_8.setBounds(315, 370, 117, 20);
		sumTest1.add(label_8);
		
		JButton btnNewButton_1 = new JButton("\u0E04\u0E33\u0E19\u0E27\u0E19\u0E40\u0E07\u0E34\u0E19");
		btnNewButton_1.setBackground(new Color(153, 102, 255));
		btnNewButton_1.setFont(new Font("Angsana New", Font.BOLD, 30));
		btnNewButton_1.setBounds(759, 64, 263, 41);
		sumTest1.add(btnNewButton_1);
		
		JButton button_2 = new JButton("\u0E2A\u0E32\u0E22\u0E1E\u0E31\u0E19\u0E18\u0E38\u0E4C");
		button_2.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_2.setBackground(new Color(0, 204, 255));
		button_2.setBounds(179, 66, 112, 39);
		sumTest1.add(button_2);
		
		JButton button_3 = new JButton("\u0E0A\u0E19\u0E34\u0E14");
		button_3.setFont(new Font("Angsana New", Font.BOLD, 27));
		button_3.setBackground(new Color(255, 204, 51));
		button_3.setBounds(46, 65, 106, 41);
		sumTest1.add(button_3);
		
		JLabel label_9 = new JLabel("\u0E1B\u0E25\u0E32\u0E04\u0E23\u0E32\u0E1F");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_9.setBounds(46, 122, 107, 20);
		sumTest1.add(label_9);
		
		JLabel label_10 = new JLabel("\u0E42\u0E04\u0E2E\u0E32\u0E01\u0E38");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_10.setBounds(179, 108, 107, 39);
		sumTest1.add(label_10);
		
		JLabel label_11 = new JLabel("\u0E0B\u0E31\u0E19\u0E40\u0E01\u0E49");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_11.setBounds(179, 156, 107, 20);
		sumTest1.add(label_11);
		
		JLabel label_12 = new JLabel("\u0E42\u0E0A\u0E27\u0E32");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_12.setBounds(179, 187, 107, 20);
		sumTest1.add(label_12);
		
		JLabel label_13 = new JLabel("\u0E42\u0E04\u0E40\u0E21\u0E17");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_13.setBounds(179, 215, 107, 20);
		sumTest1.add(label_13);
		
		JLabel label_14 = new JLabel("\u0E2D\u0E2D\u0E23\u0E31\u0E19\u0E14\u0E32");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_14.setBounds(179, 246, 107, 20);
		sumTest1.add(label_14);
		
		JLabel label_15 = new JLabel("\u0E15\u0E32\u0E25\u0E39\u0E01\u0E42\u0E1B\u0E48\u0E07");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_15.setBounds(179, 277, 107, 29);
		sumTest1.add(label_15);
		
		JLabel label_16 = new JLabel("\u0E04\u0E23\u0E32\u0E27\u0E19\u0E4C\u0E40\u0E17\u0E25");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_16.setBounds(179, 308, 107, 20);
		sumTest1.add(label_16);
		
		JLabel label_17 = new JLabel("\u0E2E\u0E32\u0E23\u0E4C\u0E1F\u0E21\u0E39\u0E19");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_17.setBounds(179, 339, 107, 20);
		sumTest1.add(label_17);
		
		JLabel label_18 = new JLabel("\u0E40\u0E14\u0E25\u0E14\u0E32");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_18.setBounds(179, 370, 107, 20);
		sumTest1.add(label_18);
		
		JLabel label_19 = new JLabel("\u0E1B\u0E25\u0E32\u0E17\u0E2D\u0E07");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_19.setBounds(46, 218, 107, 20);
		sumTest1.add(label_19);
		
		JLabel label_20 = new JLabel("\u0E1B\u0E25\u0E32\u0E01\u0E31\u0E14");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_20.setBounds(45, 311, 107, 20);
		sumTest1.add(label_20);
		
		//##############################################################################################################
		
		//backToCarpFish
		JButton btnBackCF = new JButton("");
		btnBackCF.setBackground(new Color(102, 204, 255));
		btnBackCF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CarpFish connectCF = new CarpFish();
				connectCF.setVisible(true);
			}
		});
		//add image
		Image back = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnBackCF.setIcon(new ImageIcon(back));
		btnBackCF.setBounds(28, 412, 106, 59);
		sumTest1.add(btnBackCF);
		
		//##############################################################################################################
		
		JLabel lblNewLabel_1 = new JLabel("\u0E23\u0E32\u0E04\u0E32\u0E23\u0E27\u0E21");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(759, 113, 92, 29);
		sumTest1.add(lblNewLabel_1);
		
		total = new JTextField();
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setEditable(false);
		int sum = 120 * Integer.valueOf(CarpFish.value) + 110 * Integer.valueOf(CarpFish.value2) + 100 * Integer.valueOf(CarpFish.value3) + 45 * Integer.valueOf(CarpFish.value4) + 40 * Integer.valueOf(CarpFish.value5) + 40 * Integer.valueOf(CarpFish.value6) + 25 * Integer.valueOf(CarpFish.value7) + 25 * Integer.valueOf(CarpFish.value8) + 25 * Integer.valueOf(CarpFish.value9);
		total.setText(String.valueOf(sum));
		total.setBounds(936, 122, 86, 20);
		sumTest1.add(total);
		total.setColumns(10);
		
		JLabel lbMoney = new JLabel("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E01\u0E23\u0E2D\u0E01\u0E08\u0E33\u0E19\u0E27\u0E19\u0E40\u0E07\u0E34\u0E19");
		lbMoney.setHorizontalAlignment(SwingConstants.LEFT);
		lbMoney.setFont(new Font("Angsana New", Font.BOLD, 25));
		lbMoney.setBounds(759, 144, 171, 29);
		sumTest1.add(lbMoney);
		
		JLabel label_22 = new JLabel("\u0E40\u0E07\u0E34\u0E19\u0E17\u0E2D\u0E19");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_22.setBounds(759, 175, 92, 29);
		sumTest1.add(label_22);
		
		inp = new JTextField();
		inp.setHorizontalAlignment(SwingConstants.CENTER);
//		inp.setText("");
		inp.setBounds(936, 153, 86, 20);
		sumTest1.add(inp);
		inp.setColumns(10);
		
		change = new JTextField();
		change.setHorizontalAlignment(SwingConstants.CENTER);
		change.setEditable(false);
//		change.setText(myChange - (String.valueOf(Integer.valueOf(money) - (120 * Integer.valueOf(CarpFish.value) + 110 * Integer.valueOf(CarpFish.value2)))));
		change.setBounds(936, 184, 86, 20);
		sumTest1.add(change);
		change.setColumns(10);
		
		JButton btnOK = new JButton("\u0E22\u0E37\u0E19\u0E22\u0E31\u0E19");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				money =Integer.parseInt(inp.getText());
//				result =Integer.parseInt(total.getText());
				
				myChange =String.valueOf(money-sum);
				
				change.setText(myChange);
			}
		});
		btnOK.setBackground(new Color(255, 51, 51));
		btnOK.setFont(new Font("Angsana New", Font.BOLD, 25));
		btnOK.setBounds(831, 215, 117, 39);
		sumTest1.add(btnOK);
		
		JButton button_4 = new JButton("\u0E40\u0E2A\u0E23\u0E47\u0E08\u0E2A\u0E34\u0E49\u0E19");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GoldFish conGF = new GoldFish();
				conGF.setVisible(true);
			}
		});
		button_4.setBackground(new Color(51, 255, 102));
		button_4.setFont(new Font("Angsana New", Font.BOLD, 30));
		button_4.setBounds(425, 412, 147, 51);
		sumTest1.add(button_4);
		
		//##############################################################################################################
	}
}
