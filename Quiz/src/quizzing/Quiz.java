package quizzing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//import java.awt.BorderLayout;

//import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz{

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz window = new Quiz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void NewScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz window = new Quiz();
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
	public Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 463);
		frame.setTitle("Quiz");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Quiz.class.getResource("/images/quiz.png")));
		lblNewLabel.setBounds(82, 42, 297, 139);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Can you answer all of the questions?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(204, 0, 51));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(62, 223, 328, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose();
				 //frame.setVisible(false);
				 Instructions.NewScreen();
				 //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 //frame2.setBounds(100, 100, 450, 463);
				 //frame2.setVisible(true);
			}
		});
		btnNewButton.setBounds(58, 314, 129, 67);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(250, 314, 129, 67);
		frame.getContentPane().add(btnExit);
		
	}
}


//Java - Click Button and Open New Window - eclipse by Ulas Dikme : https://www.youtube.com/watch?v=RMz9LYY2g4A

//I got a lot of my questions from  -> http://learn360.infobase.com/public_resources/87f70a03-f182-47f0-8941-a7ad7dca4c0f.pdf