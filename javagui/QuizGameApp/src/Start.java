import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login frame2 = new Login();
				
				frame2.setVisible(true);
				frame.dispose();
			}
		});
		btnStart.setBounds(143, 141, 123, 34);
		frame.getContentPane().add(btnStart);
		
		JLabel lblWelcomeToQuiz = new JLabel("Welcome To Quiz Game");
		lblWelcomeToQuiz.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWelcomeToQuiz.setBounds(105, 73, 236, 46);
		frame.getContentPane().add(lblWelcomeToQuiz);
	}

}
