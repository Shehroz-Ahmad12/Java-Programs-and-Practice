import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;

public class Question5 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question5 frame = new Question5();
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
	public Question5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("5. Who is the president of Pakistan?");
		lblNewLabel.setBounds(34, 21, 372, 40);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kim Jong Un");
		buttonGroup.add(rdbtnNewRadioButton);
				
		rdbtnNewRadioButton.setBounds(34, 76, 191, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Imran Khan");
		buttonGroup.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_1.setBounds(34, 102, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Fawad Alam");
		buttonGroup.add(rdbtnNewRadioButton_2);
				
		rdbtnNewRadioButton_2.setBounds(34, 128, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Arif Alvi");		
		buttonGroup.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_3.setBounds(34, 154, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNext = new JButton("Finish");
		btnNext.setBounds(335, 227, 89, 23);
		contentPane.add(btnNext);
	}

}
