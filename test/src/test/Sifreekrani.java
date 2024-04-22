package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Sifreekrani extends JFrame {
	//private HashMap<String, String> kullaniciSifreleri;
	Login login;
	private JPanel contentPane;
	private JTextField yenisifre;
	private JTextField terkrarsifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sifreekrani frame = new Sifreekrani();
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
	public Sifreekrani() {
		/*kullaniciSifreleri = new HashMap<>();
        kullaniciSifreleri.put("1234", "sifre1");
        kullaniciSifreleri.put("5678", "sifre2");
        String sifre1=kullaniciSifreleri.get("1234");
        String sifre2=kullaniciSifreleri.get("5678");*/
		
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yeni Şifre");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(88, 64, 94, 28);
		contentPane.add(lblNewLabel);
		
		yenisifre = new JTextField();
		yenisifre.setBounds(200, 70, 96, 19);
		contentPane.add(yenisifre);
		yenisifre.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Yeni Şifre Tekrar");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(74, 131, 108, 28);
		contentPane.add(lblNewLabel_1);
		
		terkrarsifre = new JTextField();
		terkrarsifre.setBounds(200, 137, 96, 19);
		contentPane.add(terkrarsifre);
		terkrarsifre.setColumns(10);
		
		JButton btnNewButton = new JButton("Şifreyi Yenile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(yenisifre.getText().equals(terkrarsifre.getText())) {
					 login =new Login();
					
					login.kullaniciSifreleri.put("1234", yenisifre.getText());
					JOptionPane.showMessageDialog(btnNewButton, "Şifre değiştirildi, 5 saniye içinde yeniden giriş yapacaksınız");
					
					Timer timer = new Timer(5000, new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			                login.show();
			                Sifreekrani.this.setVisible(false);
			            }
			        });
			        timer.setRepeats(false); // Tek seferlik çalışması için

			        // Timer'ı başlat
			        timer.start();
			        
			        
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "YANLIŞ ŞİFRE");
					
				}
			}
		
		});
			    
			
					
				
				
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(261, 194, 120, 28);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Musterii musteri=new Musterii();
				musteri.show();
				Sifreekrani.this.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(74, 194, 108, 28);
		contentPane.add(btnNewButton_1);
	}
}
