package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;

public class Login extends JFrame {
	HashMap<String, String> kullaniciSifreleri;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField kimlik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		kullaniciSifreleri = new HashMap<>();
        kullaniciSifreleri.put("1234", "sifre1");
        kullaniciSifreleri.put("5678", "sifre2");
        String sifre1=kullaniciSifreleri.get("1234");
        String sifre2=kullaniciSifreleri.get("5678");
        boolean kullanici1=kullaniciSifreleri.containsKey(sifre1);
        boolean kullanici2=kullaniciSifreleri.containsKey(sifre2);
       
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("    Parola:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(45, 122, 85, 21);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(168, 125, 107, 19);
		contentPane.add(passwordField);
		
		JRadioButton müsteriradiobutton = new JRadioButton("Müşteri");
		müsteriradiobutton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
		
			}
		});
		müsteriradiobutton.setBounds(71, 20, 103, 21);
		contentPane.add(müsteriradiobutton);
		
		JRadioButton personalradiobutton = new JRadioButton("Personel");
		personalradiobutton.setBounds(241, 20, 103, 21);
		contentPane.add(personalradiobutton);
		
		
		JButton login = new JButton("login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sifre2.equals(passwordField.getText()) && personalradiobutton.isSelected() &&  "5678".equals(kimlik.getText()) ) {
				bankacı bankaci=new bankacı();
					bankaci.show();
					dispose();
				}
				else if(sifre1.equals(passwordField.getText())&& müsteriradiobutton.isSelected() && "1234".equals(kimlik.getText()) ) {
					Musterii musteri=new Musterii();
					musteri.show();
					Login.this.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(login, "YANLIŞ ŞİFRE");
				}
			}
		});
		login.setBounds(178, 185, 85, 21);
		contentPane.add(login);
		
		JLabel kullanıcıadi = new JLabel("Kimlik Numarası:");
		kullanıcıadi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		kullanıcıadi.setBounds(51, 84, 107, 21);
		contentPane.add(kullanıcıadi);
		
		kimlik = new JTextField();
		kimlik.setBounds(168, 87, 107, 19);
		contentPane.add(kimlik);
		kimlik.setColumns(10);
	}
}
