package projectJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TypeFish extends JFrame {

	Connection account = null;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeFish frame = new TypeFish();
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
	public TypeFish() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0E41\u0E19\u0E30\u0E19\u0E33\u0E1B\u0E25\u0E32\u0E2A\u0E27\u0E22\u0E07\u0E32\u0E21");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Angsana New", Font.BOLD, 30));
		label.setBounds(319, 11, 294, 48);
		contentPane.add(label);
		
		JButton btnNext = new JButton("");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CarpFish conCF = new CarpFish();
				conCF.setVisible(true);
			}
		});
		//add image
		Image next = new ImageIcon(this.getClass().getResource("/next.png")).getImage();
		btnNext.setIcon(new ImageIcon(next));
		btnNext.setBackground(new Color(153, 255, 102));
		btnNext.setBounds(811, 452, 81, 48);
		contentPane.add(btnNext);
		
		JLabel cohaku = new JLabel("");
		Image imgCo = new ImageIcon(this.getClass().getResource("/Cohaku.png")).getImage();
		cohaku.setIcon(new ImageIcon(imgCo));
		cohaku.setBounds(68, 59, 123, 175);
		contentPane.add(cohaku);
		
		JLabel label_1 = new JLabel("\u0E42\u0E04\u0E2E\u0E32\u0E01\u0E38");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_1.setBounds(68, 233, 123, 35);
		contentPane.add(label_1);
		
		JLabel sunke = new JLabel("");
		Image imgSu = new ImageIcon(this.getClass().getResource("/Sunke.png")).getImage();
		sunke.setIcon(new ImageIcon(imgSu));
		sunke.setBounds(227, 59, 123, 175);
		contentPane.add(sunke);
		
		JLabel label_2 = new JLabel("\u0E0B\u0E31\u0E19\u0E40\u0E01\u0E49");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_2.setBounds(227, 233, 105, 35);
		contentPane.add(label_2);
		
		JLabel showa = new JLabel("");
		Image imgSo = new ImageIcon(this.getClass().getResource("/Showa.png")).getImage();
		showa.setIcon(new ImageIcon(imgSo));
		showa.setBounds(366, 59, 98, 175);
		contentPane.add(showa);
		
		JLabel label_3 = new JLabel("\u0E42\u0E0A\u0E27\u0E48\u0E32");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_3.setBounds(360, 233, 98, 35);
		contentPane.add(label_3);
		
		JLabel comet = new JLabel("");
		Image imgCom = new ImageIcon(this.getClass().getResource("/Comet.png")).getImage();
		comet.setIcon(new ImageIcon(imgCom));
		comet.setBounds(83, 279, 185, 126);
		contentPane.add(comet);
		
		JLabel lblNewLabel = new JLabel("\u0E42\u0E04\u0E40\u0E21\u0E17");
		lblNewLabel.setFont(new Font("Angsana New", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(131, 410, 100, 35);
		contentPane.add(lblNewLabel);
		
		JLabel alrunda = new JLabel("");
		Image imgAl = new ImageIcon(this.getClass().getResource("/Alrunda.png")).getImage();
		alrunda.setIcon(new ImageIcon(imgAl));
		alrunda.setBounds(291, 279, 156, 120);
		contentPane.add(alrunda);
		
		JLabel label_4 = new JLabel("\u0E2D\u0E2D\u0E23\u0E31\u0E19\u0E14\u0E32");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_4.setBounds(319, 410, 100, 35);
		contentPane.add(label_4);
		
		JLabel balloonEye = new JLabel("");
		Image imgBa = new ImageIcon(this.getClass().getResource("/BalloonEye.png")).getImage();
		balloonEye.setIcon(new ImageIcon(imgBa));
		balloonEye.setBounds(494, 70, 129, 111);
		contentPane.add(balloonEye);
		
		JLabel label_5 = new JLabel("\u0E15\u0E32\u0E25\u0E39\u0E01\u0E42\u0E1B\u0E48\u0E07");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_5.setBounds(504, 192, 100, 35);
		contentPane.add(label_5);
		
		JLabel crawntail = new JLabel("");
		Image imgCr = new ImageIcon(this.getClass().getResource("/CrawnTail.png")).getImage();
		crawntail.setIcon(new ImageIcon(imgCr));
		crawntail.setBounds(692, 256, 200, 139);
		contentPane.add(crawntail);
		
		JLabel halfmoon = new JLabel("");
		Image imgHa = new ImageIcon(this.getClass().getResource("/HalfMoon.png")).getImage();
		halfmoon.setIcon(new ImageIcon(imgHa));
		halfmoon.setBounds(457, 258, 216, 147);
		contentPane.add(halfmoon);
		
		JLabel label_7 = new JLabel("\u0E2E\u0E32\u0E23\u0E4C\u0E1F\u0E21\u0E39\u0E19");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_7.setBounds(494, 410, 100, 35);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u0E40\u0E14\u0E25\u0E14\u0E32");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_8.setBounds(692, 192, 100, 35);
		contentPane.add(label_8);
		
		JLabel delda = new JLabel("");
		Image imgDe = new ImageIcon(this.getClass().getResource("/Delda.png")).getImage();
		delda.setIcon(new ImageIcon(imgDe));
		delda.setBounds(665, 70, 147, 120);
		contentPane.add(delda);
		
		JLabel label_6 = new JLabel("\u0E04\u0E23\u0E32\u0E27\u0E40\u0E17\u0E25");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Angsana New", Font.BOLD, 25));
		label_6.setBounds(735, 406, 100, 35);
		contentPane.add(label_6);
		
		
	}
}
