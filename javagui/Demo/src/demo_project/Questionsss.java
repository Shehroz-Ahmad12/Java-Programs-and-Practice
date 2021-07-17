package demo_project;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import demo_project.question_array;
import javax.swing.ButtonGroup;
public class Questionsss extends JFrame {
	ArrayList<question_array>QuestionArrayList;
	
	JLabel questionLabel;
	JRadioButton option1;
	JRadioButton option2;
	JRadioButton option3;
	JRadioButton option4;
	
	String[] ques= {"When Rome was founded?", "How old is Indus Civilization?",""};
	String[][] answers = {{"Hello","H","What","Now"},{"w","s","a","d"},{"c","x","v","c"}};
	String[] correctAns = {"H","a","x"};
	private JPanel contentPane;
	int questionCount=0;
	int answerCount1=0;
	int answerCount2=0;
	int correctAnsCount=0;
	int ScoreCount=0;
	String correctAnswer="3";
	String option1Text;
	String option2Text;
	String option3Text;
	String option4Text;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questionsss frame = new Questionsss();
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
	public Questionsss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		JLabel questionLabel = new JLabel("How old are you");
		questionLabel.setBounds(80, 48, 369, 43);
		contentPane.add(questionLabel);
		
		
		
		JRadioButton option1 = new JRadioButton("2");
		buttonGroup.add(option1);
		option1.setBounds(80, 112, 109, 23);
		contentPane.add(option1);
		
		JRadioButton option2 = new JRadioButton("3");
		buttonGroup.add(option2);
		option2.setBounds(80, 138, 109, 23);
		contentPane.add(option2);
		
		JRadioButton option3 = new JRadioButton("4");
		buttonGroup.add(option3);
		option3.setBounds(80, 164, 109, 23);
		contentPane.add(option3);
		
		JRadioButton option4 = new JRadioButton("5");
		buttonGroup.add(option4);
		option4.setBounds(80, 190, 109, 23);
		contentPane.add(option4);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				option1Text=option1.getText();
				option2Text=option2.getText();
				option3Text=option3.getText();
				option4Text=option4.getText();
					if((option1.isSelected())) {
						if (option1Text==correctAnswer) {
							JOptionPane.showMessageDialog(null, "Correct Answer");
						
							ScoreCount++;
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;
							answerCount1++;
							
						}
						else{
							JOptionPane.showMessageDialog(null, "Wrong Answer");
							
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;}
						}
					
					
					else if((option2.isSelected())) {
						if (option2Text==correctAnswer) {
							JOptionPane.showMessageDialog(null, "Correct Answer");
							
							ScoreCount++;
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;
							answerCount1++;
							
						}else {
							JOptionPane.showMessageDialog(null, "Wrong Answer");
							
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;
						}
						}
					
					
					else if((option3.isSelected())) {
						if (option3Text==correctAnswer) {
							JOptionPane.showMessageDialog(null, "Correct Answer");
							
							ScoreCount++;
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;
							answerCount1++;
							
						}
						else{
							JOptionPane.showMessageDialog(null, "Wrong Answer");
							
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;}
						}
					
					
					else if((option4.isSelected())) {
						if (option4Text==correctAnswer) {
							JOptionPane.showMessageDialog(null, "Correct Answer");
							
							ScoreCount++;
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;
							answerCount1++;
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Wrong Answer");
							
							
							answerCount2=0;
							questionLabel.setText(ques[questionCount]);
							questionCount++;
							option1.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option2.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option3.setText(answers[answerCount1][answerCount2]);
							answerCount2++;
							option4.setText(answers[answerCount1][answerCount2]);
							correctAnswer=correctAns[correctAnsCount];
							correctAnsCount++;}
						}
					
					else {
						JOptionPane.showMessageDialog(null, "Please Select an Option");
					}				
					
					
					
					
					
					
					
				}
		});
		submitButton.setBounds(452, 319, 89, 23);
		contentPane.add(submitButton);
		
		
		
	}
		public void setData() {
			answerCount2=0;
			questionLabel.setText(ques[questionCount]);
			questionCount++;
			option1.setText(answers[answerCount1][answerCount2]);
			answerCount2++;
			option2.setText(answers[answerCount1][answerCount2]);
			answerCount2++;
			option3.setText(answers[answerCount1][answerCount2]);
			answerCount2++;
			option4.setText(answers[answerCount1][answerCount2]);
			correctAnswer=correctAns[correctAnsCount];
			correctAnsCount++;
}}
