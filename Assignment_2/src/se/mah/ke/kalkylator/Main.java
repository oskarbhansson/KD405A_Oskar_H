package se.mah.ke.kalkylator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Calculator myCalculator = new Calculator();
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(6, 6, 268, 56);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btnNewButton.setBounds(6, 163, 58, 56);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button.setBounds(76, 163, 58, 56);
		contentPane.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_1.setBounds(146, 163, 58, 56);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_2.setBounds(6, 229, 58, 56);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_3.setBounds(76, 229, 58, 56);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_4.setBounds(146, 229, 58, 56);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button_5.setBounds(6, 297, 58, 56);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_6.setBounds(76, 297, 58, 56);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_7.setBounds(146, 297, 58, 56);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		button_8.setBounds(6, 365, 128, 56);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton(",");
		button_9.setBounds(146, 365, 58, 56);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		button_10.setBounds(216, 365, 58, 56);
		contentPane.add(button_10);
		
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("+");
				myCalculator.plus();
			}
		});
		button_11.setBounds(216, 297, 58, 56);
		contentPane.add(button_11);
		
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("-");
				myCalculator.minus();
				
			}
		});
		button_12.setBounds(216, 229, 58, 56);
		contentPane.add(button_12);
		myCalculator.minus();
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("X");
				myCalculator.mult();
			}
		});
		btnX.setBounds(216, 163, 58, 56);
		contentPane.add(btnX);
		myCalculator.mult();
		
		JButton button_14 = new JButton("/");
		button_14.setBounds(216, 95, 58, 56);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("%");
		button_15.setBounds(146, 95, 58, 56);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton(":)");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(":)");
			}
		});
		button_16.setBounds(76, 95, 58, 56);
		contentPane.add(button_16);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				myCalculator.clear();
			}
		});
		btnAc.setBounds(6, 95, 58, 56);
		contentPane.add(btnAc);
	}
}
