package quizzing;

import java.awt.EventQueue;
//import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2 {

	private JFrame frame;
	static int score = 0;
	//private JLabel scoring;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 window = new Quiz2();
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
	public Quiz2() {
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
		
		JLabel lblQuestionWhich = new JLabel("Question 1: Which framework is the best?");
		lblQuestionWhich.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuestionWhich.setForeground(new Color(102, 0, 153));
		lblQuestionWhich.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestionWhich.setBounds(55, 46, 330, 63);
		frame.getContentPane().add(lblQuestionWhich);
		
		final JLabel lblScore = new JLabel("Score: 0");
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblScore.setBounds(300, 21, 96, 30);
		frame.getContentPane().add(lblScore);
		
		final JButton btnNewButton = new JButton("VueJS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz3.NewScreen();
				score = score + 20;
				lblScore.setText("Score: " + score);
				frame.dispose();
				//btnNewButton.setEnabled(false); //maybe I don't need this piece of code
				//scoring = new JLabel("");
				//scoring.setText("Score: " + score);
				//scoring.setBounds(300, 21, 96, 30);
				//frame.getContentPane().add(scoring);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(51, 184, 140, 63);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNodejs = new JButton("NodeJS");
		btnNodejs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz3.NewScreen();
				score = score + 30;
				lblScore.setText("Score: " + score);
				frame.dispose();
				//btnNewButton.setEnabled(false); //maybe I don't need this piece of code
			}
		});
		btnNodejs.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNodejs.setBounds(236, 184, 140, 63);
		frame.getContentPane().add(btnNodejs);
		
		JButton btnReactjs = new JButton("ReactJS");
		btnReactjs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz3.NewScreen();
				score = score + 40;
				lblScore.setText("Score: " + score);
				frame.dispose();
				//btnNewButton.setEnabled(false); //maybe I don't need this piece of code
			}
		});
		btnReactjs.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReactjs.setBounds(51, 292, 140, 63);
		frame.getContentPane().add(btnReactjs);
		
		JButton btnAngularjs = new JButton("AngularJS");
		btnAngularjs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz3.NewScreen();
				score = score + 10;
				lblScore.setText("Score: " + score);
				frame.dispose();
				//btnNewButton.setEnabled(false); //maybe I don't need this piece of code
			}
		});
		btnAngularjs.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAngularjs.setBounds(236, 292, 140, 63);
		frame.getContentPane().add(btnAngularjs);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz.NewScreen();
				//quiz.setVisible(true);
				//quiz.setBounds(100, 100, 450, 441);
				frame.dispose();
				score = 0;
				
			}
		});
		btnHome.setForeground(new Color(255, 0, 0));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.setBounds(21, 33, 89, 23);
		frame.getContentPane().add(btnHome);
	}
	
	/*
	public void close(){
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	*/
	
	

}
