package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Yatırımm extends JFrame implements yatırım {
	double miktar;
	private JPanel contentPane;
	private JTextField txtMiktar;
	Bakiye secondFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yatırımm frame = new Yatırımm();
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
	public Yatırımm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		txtMiktar = new JTextField();
		txtMiktar.setBounds(281, 59, 96, 19);
		contentPane.add(txtMiktar);
		txtMiktar.setColumns(10);
		txtMiktar.setText("0");
		
		
		
		JLabel lblNewLabel = new JLabel("29.5");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(157, 14, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("31.5");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(157, 62, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1928.52");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(157, 116, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Miktar:");
		lblNewLabel_3.setBackground(new Color(255, 128, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(281, 28, 62, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bakiyeniz:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 165, 129, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(127, 169, 106, 23);
		contentPane.add(lblNewLabel_5);
		
		String para1=Double.toString(para);
		lblNewLabel_5.setText(para1);
		
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Musterii musteri=new Musterii();
				musteri.show();
				Yatırımm.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(170, 223, 96, 30);
		contentPane.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Dolar");
		rdbtnNewRadioButton.setBounds(21, 10, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnEuro = new JRadioButton("Euro");
		rdbtnEuro.setBounds(21, 58, 103, 21);
		contentPane.add(rdbtnEuro);
		
		JRadioButton rdbtnAltn = new JRadioButton("Altın");
		rdbtnAltn.setBounds(21, 112, 103, 21);
		contentPane.add(rdbtnAltn);
		
		JButton btnNewButton = new JButton("Satın Al");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					double miktar=Double.parseDouble(txtMiktar.getText());
					 double para1=para-miktar*dolar;
					 String para2=Double.toString(para1);
						lblNewLabel_5.setText(para2);
						secondFrame  = new Bakiye();
						
					    secondFrame.textField.setText(lblNewLabel_5.getText());
					    //secondFrame.setVisible( true );
				}
				else if(rdbtnEuro.isSelected()) {
					double miktar=Double.parseDouble(txtMiktar.getText());
					 double para1=para-miktar*euro;
					 String para2=Double.toString(para1);
						lblNewLabel_5.setText(para2);
						secondFrame  = new Bakiye();
						
					    secondFrame.textField.setText(lblNewLabel_5.getText());
					    //secondFrame.setVisible( true );
				}
				else if(rdbtnAltn.isSelected()) {
					double miktar=Double.parseDouble(txtMiktar.getText());
					 double para1=para-miktar*altın;
					 String para2=Double.toString(para1);
						lblNewLabel_5.setText(para2);
						secondFrame  = new Bakiye();
						
					    secondFrame.textField.setText(lblNewLabel_5.getText());
					    //secondFrame.setVisible( true );
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"Bir yatırım seçiniz");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(281, 98, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Sat");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					double miktar=Double.parseDouble(txtMiktar.getText());
					 double para1=para+miktar*dolar;
					 String para2=Double.toString(para1);
						lblNewLabel_5.setText(para2);
						secondFrame  = new Bakiye();
						
					    secondFrame.textField.setText(lblNewLabel_5.getText());
					    secondFrame.setVisible( true );
				}
				else if(rdbtnEuro.isSelected()) {
					double miktar=Double.parseDouble(txtMiktar.getText());
					 double para1=para+miktar*euro;
					 String para2=Double.toString(para1);
						lblNewLabel_5.setText(para2);
						secondFrame  = new Bakiye();
						
					    secondFrame.textField.setText(lblNewLabel_5.getText());
					    secondFrame.setVisible( true );
				}
				else if(rdbtnAltn.isSelected()) {
					double miktar=Double.parseDouble(txtMiktar.getText());
					 double para1=para+miktar*altın;
					 String para2=Double.toString(para1);
						lblNewLabel_5.setText(para2);
						secondFrame  = new Bakiye();
						
					    secondFrame.textField.setText(lblNewLabel_5.getText());
					    secondFrame.setVisible( true );
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"Bir yatırım seçiniz");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(281, 139, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
