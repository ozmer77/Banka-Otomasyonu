package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Kredii extends JFrame implements kredi,yatırım,faiz {

	private JPanel contentPane;
	
	Kredionayla onay;
	Musterii musteri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kredii frame = new Kredii();
					frame.setVisible(true);
					//frame.setSize(400,100);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kredii() {
		setTitle("Kredi");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton yüz = new JRadioButton("100 BİN TL");
		
		yüz.setBounds(27, 54, 103, 21);
		contentPane.add(yüz);
		
		JRadioButton ikiyüz = new JRadioButton("200 BİN TL");
		ikiyüz.setBounds(27, 109, 103, 21);
		contentPane.add(ikiyüz);
		
		JRadioButton üçyüz = new JRadioButton("300 BİN TL");
		üçyüz.setBounds(27, 164, 103, 21);
		contentPane.add(üçyüz);
		
		JLabel lblNewLabel = new JLabel("ALACAĞINIZI KREDİ MİKTARINI SEÇİNİZ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(59, 10, 282, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MUHTEMEL BAKİYENİZ:");
		//lblNewLabel_1.setText("aaaaa");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		//lblNewLabel_1.setToolTipText("aaaaaa");
		lblNewLabel_1.setBounds(201, 69, 140, 36);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(243, 112, 65, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(219, 135, 117, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(243, 168, 72, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("KREDİ İSTE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(yüz.isSelected()) {
					
					
					degiskenmusteri mus=new degiskenmusteri();
					double para1=mus.change1();
					
					 String para2=Double.toString(para1);
						lblNewLabel_2.setText(para2);	
						lblNewLabel_3.setText("ONAY BEKLİYOR");
						
						String borc=Double.toString(kredimiktarı*faiz);
						lblNewLabel_5.setText(borc);
						
						 onay=new Kredionayla();
						 onay.textField.setText("100bin TL Kredi onayı bekliyor");
						//onay.show();
						//Kredii.this.setVisible(false);
						
						
						
				}
				else if(ikiyüz.isSelected()) {
					
					double para1=para+kredimiktarı2;
					 String para2=Double.toString(para1);
						lblNewLabel_2.setText(para2);	
						lblNewLabel_3.setText("ONAY BEKLİYOR");
						
						
					 
						
						String borc=Double.toString(kredimiktarı2*faizk1);
						lblNewLabel_5.setText(borc);
						
						onay=new Kredionayla();
						onay.textField.setText("200 bin TL Kredi onayı bekliyor");
						
				}
				else if( üçyüz.isSelected()) {
					double para1=para+kredimiktarı3;
					 String para2=Double.toString(para1);
						lblNewLabel_2.setText(para2);	
						lblNewLabel_3.setText("ONAY BEKLİYOR");
						
						String borc=Double.toString(kredimiktarı*faizk2);
						lblNewLabel_5.setText(borc);
						onay=new Kredionayla();
						onay.textField.setText("300 Bin TL Kredi onayı bekliyor");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton_1, "Yanlış Seçim");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(235, 232, 129, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("GERİ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 musteri=new Musterii();
				musteri.show();
				Kredii.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(39, 232, 85, 21);
		contentPane.add(btnNewButton);
		
		
		
		String para1=Double.toString(para);
		lblNewLabel_2.setText(para1);
		
		JLabel lblNewLabel_4 = new JLabel("BORÇ:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(201, 167, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
	}

}
