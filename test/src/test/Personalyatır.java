package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Personalyatır extends JFrame implements yatırım{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personalyatır frame = new Personalyatır();
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
	public Personalyatır() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bakiyeniz:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(71, 49, 82, 13);
		contentPane.add(lblNewLabel);
		
		String str=Double.toString(para);
		JLabel lblNewLabel_1 = new JLabel(str);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(163, 49, 71, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Yatır");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(174, 161, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton geri = new JButton("Geri");
		geri.setFont(new Font("Tahoma", Font.BOLD, 13));
		geri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankacı bankacı=new bankacı();
				bankacı.show();
				dispose();
			}
		});
		geri.setBounds(174, 202, 85, 21);
		contentPane.add(geri);
		
		textField = new JTextField();
		textField.setBounds(163, 98, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Miktar:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(71, 100, 71, 13);
		contentPane.add(lblNewLabel_2);
		
	}

}
