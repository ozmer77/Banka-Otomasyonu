package test;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bankacı extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bankacı frame = new bankacı();
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
	public bankacı() {
		setBackground(new Color(245, 168, 74));
		getContentPane().setBackground(new Color(245, 168, 74));
		setTitle("Personal Sayfası");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Kredi Onayla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kredionayla onay=new Kredionayla();
				onay.show();
				bankacı.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(33, 86, 165, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Para Çek");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonalParacel cek=new PersonalParacel();
				cek.show();
				bankacı.this.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(34, 145, 164, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Para Yatır");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Personalyatır yatir=new Personalyatır();
				yatir.show();
				bankacı.this.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(241, 86, 158, 48);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("HOŞGELDİNİZ PERSONELİMİZ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(98, 10, 204, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Geri");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login=new Login();
				login.show();
				bankacı.this.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(241, 145, 158, 49);
		contentPane.add(btnNewButton_3);
	}
}
