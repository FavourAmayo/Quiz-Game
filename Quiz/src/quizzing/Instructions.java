package quizzing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JLabel;
//import javax.swing.SwingConstants;

public class Instructions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions window = new Instructions();
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
	public Instructions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 441);
		frame.setTitle("Quiz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBegin = new JButton("Begin");
		btnBegin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			    frame.dispose();
				Quiz2.NewScreen();
			}
		});
		btnBegin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBegin.setBounds(144, 305, 140, 63);
		frame.getContentPane().add(btnBegin);
		
		JLabel lblNewLabel = new JLabel("You will be going through a ten question quiz. \r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(72, 57, 278, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblThereWillBe = new JLabel(" There will be a question at the top \r\n");
		lblThereWillBe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblThereWillBe.setBounds(72, 86, 278, 35);
		frame.getContentPane().add(lblThereWillBe);
		
		JLabel lblAndItIs = new JLabel("and it is your job to pick the answer that our \r\n");
		lblAndItIs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAndItIs.setBounds(72, 121, 278, 35);
		frame.getContentPane().add(lblAndItIs);
		
		JLabel lblSurveyGroupChose = new JLabel("survey group chose the most.\r\n");
		lblSurveyGroupChose.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSurveyGroupChose.setBounds(72, 151, 278, 35);
		frame.getContentPane().add(lblSurveyGroupChose);
		
		JLabel lblTryYourBest = new JLabel("Try your best to get the highest possible score. \r\n");
		lblTryYourBest.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTryYourBest.setBounds(72, 183, 278, 35);
		frame.getContentPane().add(lblTryYourBest);
		
		JLabel lblYourFinalScore = new JLabel("Your final score will be presented \r\n");
		lblYourFinalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYourFinalScore.setBounds(72, 214, 278, 35);
		frame.getContentPane().add(lblYourFinalScore);
		
		JLabel lblAtTheEnd = new JLabel("at the end. Good Luck!");
		lblAtTheEnd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAtTheEnd.setBounds(72, 247, 278, 35);
		frame.getContentPane().add(lblAtTheEnd);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose();
				Quiz.NewScreen();
				Quiz2.score = 0;
			}
		});
		button.setForeground(new Color(255, 0, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(21, 33, 89, 23);
		frame.getContentPane().add(button);
	}

}
