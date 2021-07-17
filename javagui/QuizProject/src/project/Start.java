package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome To Quiz Game");
		lblWelcome.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		lblWelcome.setBounds(100, 47, 247, 59);
		contentPane.add(lblWelcome);
		
		JButton btnNewButton= new JButton("Start");
		btnNewButton.setFont(new Font("Kristen ITC", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login obj = new Login();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(154, 132, 135, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblShehrozAhmad = new JLabel("Credits: Shehroz Ahmad");
		lblShehrozAhmad.setFont(new Font("Kristen ITC", Font.PLAIN, 11));
		lblShehrozAhmad.setBounds(154, 218, 135, 42);
		contentPane.add(lblShehrozAhmad);
		
		
	}
}
