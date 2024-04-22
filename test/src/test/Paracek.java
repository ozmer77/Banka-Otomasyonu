package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;



import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Paracek extends JFrame implements yatırım {

	private JPanel contentPane;
	private JTextField textField;
	
	private JTextField lblNewLabel_2; 
	  Bakiye secondFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paracek frame = new Paracek();
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
	public Paracek() {
		
		setTitle("Para Çekme Sayfası");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(151, 73, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String str=Double.toString(para);
		JLabel lblNewLabel_2 = new JLabel(str);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(156, 21, 80, 14);
		contentPane.add(lblNewLabel_2);
		
		 
		JButton btnNewButton = new JButton("Çek");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double miktar=Double.parseDouble(textField.getText());
				 degiskenmusteri mus=new degiskenmusteri();
				 mus.para1=mus.para;
				
				 double para=mus.para1-miktar;
				 mus.para=para;
				  
				 
				 String para2=Double.toString(para);
					lblNewLabel_2.setText (para2);
					secondFrame  = new Bakiye();
					
				    secondFrame.textField.setText(lblNewLabel_2.getText());
				    secondFrame.setVisible( true );
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(151, 140, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Musterii mus=new Musterii();
				mus.show();
				Paracek.this.setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(151, 203, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Miktar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 73, 66, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bakiyeniz:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(52, 21, 78, 13);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		
	}
}
