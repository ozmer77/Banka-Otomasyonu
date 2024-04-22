package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PersonalParacel extends JFrame implements yatırım {

	private JPanel contentPane;
	private JTextField textField;
Bakiye secondFrame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalParacel frame = new PersonalParacel();
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
	public PersonalParacel() {
		setTitle("Personal Para Çek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Miktar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(57, 93, 63, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(142, 91, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(141, 40, 63, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Çek");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double miktar=Double.parseDouble(textField.getText());
				 double para1=para-miktar;
				 
				 String para2=Double.toString(para1);
					lblNewLabel_1.setText(para2);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(153, 142, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankacı mus=new bankacı();
				mus.show();
				PersonalParacel.this.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(153, 204, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Bakiye:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(57, 40, 63, 13);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_1.setText("10980");
		
	}
}
