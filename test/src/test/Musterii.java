package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;

public class Musterii extends JFrame {

	private JPanel contentPane;
	Bakiye bakiye;
	Login login;
	Yatırımm yatırım;
	Kredii kredi;
	Sifreekrani sifre;
	Paracek cek;
	Parayatır yatır;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Musterii frame = new Musterii();
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
	public Musterii() {
		setTitle("Müşteri Sayfası");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HESAP NO: 1001");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(143, 10, 107, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOŞGELDİNİZ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(143, 44, 107, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("YATIRIM");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    yatırım=new Yatırımm();
				yatırım.show();
				Musterii.this.setVisible(false);
			}
		});
		btnNewButton.setBounds(35, 90, 133, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("KREDİ\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kredi=new Kredii();
				kredi.show();
			    Musterii.this.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBounds(35, 154, 133, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Şifre Değiştir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 sifre=new Sifreekrani();
				sifre.show();
				Musterii.this.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(221, 154, 136, 39);
		contentPane.add(btnNewButton_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().equals("BAKİYE GÖR")) {
					 bakiye=new Bakiye();
					bakiye.show();
					Musterii.this.setVisible(false);
	
				}
				else if(comboBox.getSelectedItem().equals("PARA ÇEK")) {
					cek=new Paracek();
					cek.show();
					Musterii.this.setVisible(false);
				}
				else if(comboBox.getSelectedItem().equals("PARA YATIR")){
					 yatır=new Parayatır();
					yatır.show();
					Musterii.this.setVisible(false);
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"İŞLEM SEÇİNİZ","PARA ÇEK", "PARA YATIR", "BAKİYE GÖR"}));
		comboBox.setBounds(221, 90, 136, 30);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 login=new Login();
				login.show();
				Musterii.this.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(143, 214, 97, 39);
		contentPane.add(btnNewButton_1);
	}
}
