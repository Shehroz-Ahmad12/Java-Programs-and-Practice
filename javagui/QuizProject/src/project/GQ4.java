package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class GQ4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GQ4 frame = new GQ4();
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
	public GQ4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		Image image =new ImageIcon(this.getClass().getResource("Geo.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		
		lblNewLabel.setBounds(235, 67, 300, 195);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Rome was founded in what year?");
		lblNewLabel_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(37, 24, 478, 33);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("763 BC");
		rdbtnNewRadioButton.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(37, 94, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("753 BC");
		rdbtnNewRadioButton_1.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(37, 137, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("783 BC");
		rdbtnNewRadioButton_2.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(37, 181, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("883 BC");
		rdbtnNewRadioButton_3.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(37, 221, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnNewButton.setBounds(419, 300, 96, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnNewButton_1.setBounds(37, 300, 96, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(190, 300, 148, 33);
		contentPane.add(lblNewLabel_2);
	}

}
