package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Categories extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categories frame = new Categories();
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
	public Categories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("History");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnNewButton.setBounds(154, 78, 119, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Geography");
		btnNewButton_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnNewButton_1.setBounds(154, 134, 119, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Technology");
		btnNewButton_2.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnNewButton_2.setBounds(154, 190, 119, 35);
		contentPane.add(btnNewButton_2);
		
		JLabel lblChooseACategory = new JLabel("Choose a Category");
		lblChooseACategory.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		lblChooseACategory.setBounds(109, 11, 195, 56);
		contentPane.add(lblChooseACategory);
	}
}
