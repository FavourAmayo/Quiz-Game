package quizzing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndScreen window = new EndScreen();
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
	public EndScreen() {
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
		
		JLabel lblCongraatulations = new JLabel("CONGRATULATIONS!!!");
		lblCongraatulations.setHorizontalAlignment(SwingConstants.CENTER);
		lblCongraatulations.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCongraatulations.setBounds(90, 60, 264, 60);
		frame.getContentPane().add(lblCongraatulations);
		
		JLabel lblYourScore = new JLabel("Your Score: ");
		lblYourScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourScore.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblYourScore.setBounds(155, 137, 139, 28);
		frame.getContentPane().add(lblYourScore);
		
		JLabel label = new JLabel(""+Quiz2.score);
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(155, 228, 126, 44);
		frame.getContentPane().add(label);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz2.score = 0;
				Quiz.NewScreen();
				frame.dispose();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnHome.setBounds(49, 331, 139, 44);
		frame.getContentPane().add(btnHome);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(235, 331, 139, 44);
		frame.getContentPane().add(btnExit);
	}

}
