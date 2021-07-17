import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question3 frame = new Question3();
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
	public Question3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("3. Who is the CEO of Tesla?");
		lblNewLabel.setBounds(34, 21, 372, 40);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mark Zuckerberg");
		buttonGroup.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton.setBounds(34, 76, 191, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Elon Musk");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		
		rdbtnNewRadioButton_1.setBounds(34, 102, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bill Gates");
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_2.setBounds(34, 128, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Steve Jobs");
		buttonGroup.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_3.setBounds(34, 154, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Question4 obj4 =new Question4();
				obj4.setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(335, 227, 89, 23);
		contentPane.add(btnNext);
		
		
		
		
		
	
	}

}
