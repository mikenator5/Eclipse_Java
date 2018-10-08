import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator implements ActionListener {
		
		// class variables or instance variables or field variables
		JFrame frame;
		JTextField textField;
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub, bmul, bdiv, beq, bclr, bksp, bsqr, bcbe, bsqt, blog;
		
		double firstNumber;
		double secondNumber;
		double result;
		
		int operator;
		
		// constructor
		public Calculator() {
			
			frame = new JFrame("Calculator, Created by Mike D");
			
			textField = new JTextField();
			textField.setBounds(100, 40, 460, 30);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.getContentPane().setBackground(new java.awt.Color(176, 248, 252));
			frame.setVisible(true);
			frame.setSize(650, 800);
			frame.setLayout(null);
			frame.add(textField);
			
			b0 = new JButton("0");
			b0.setBounds(100, 450, 50, 40);
			b0.setFont(new Font("Serif", Font.BOLD,18));
			b0.setBackground(new Color(107, 255, 146));
			frame.add(b0);
			
			b1 = new JButton("1");
			b1.setBounds(100, 350, 50, 40);
			b1.setFont(new Font("Serif", Font.BOLD,18));
			b1.setBackground(new Color(107, 255, 146));
			frame.add(b1);
			
			b2 = new JButton("2");
			b2.setBounds(200, 350, 50, 40);
			b2.setFont(new Font("Serif", Font.BOLD,18));
			b2.setBackground(new Color(107, 255, 146));
			frame.add(b2);
			
			b3 = new JButton("3");
			b3.setBounds(300, 350, 50, 40);
			b3.setFont(new Font("Serif", Font.BOLD,18));
			b3.setBackground(new Color(107, 255, 146));
			frame.add(b3);
			
			b4 = new JButton("4");
			b4.setBounds(100, 250, 50, 40);
			b4.setFont(new Font("Serif", Font.BOLD,18));
			b4.setBackground(new Color(107, 255, 146));
			frame.add(b4);
			
			b5 = new JButton("5");
			b5.setBounds(200, 250, 50, 40);
			b5.setFont(new Font("Serif", Font.BOLD,18));
			b5.setBackground(new Color(107, 255, 146));
			frame.add(b5);
			
			b6 = new JButton("6");
			b6.setBounds(300, 250, 50, 40);
			b6.setFont(new Font("Serif", Font.BOLD,18));
			b6.setBackground(new Color(107, 255, 146));
			frame.add(b6);
			
			b7 = new JButton("7");
			b7.setBounds(100, 150, 50, 40);
			b7.setFont(new Font("Serif", Font.BOLD,18));
			b7.setBackground(new Color(107, 255, 146));
			frame.add(b7);
			
			b8 = new JButton("8");
			b8.setBounds(200, 150, 50, 40);
			b8.setFont(new Font("Serif", Font.BOLD,18));
			b8.setBackground(new Color(107, 255, 146));
			frame.add(b8);
			
			b9 = new JButton("9");
			b9.setBounds(300, 150, 50, 40);
			b9.setFont(new Font("Serif", Font.BOLD,18));
			b9.setBackground(new Color(107, 255, 146));
			frame.add(b9);
			
			bdec = new JButton(".");
			bdec.setBounds(200, 450, 50, 40);
			bdec.setFont(new Font("Serif", Font.BOLD,18));
			bdec.setBackground(new Color(255, 225, 107));
			frame.add(bdec);
			
			beq = new JButton("=");
			beq.setBounds(300, 450, 50, 40);
			beq.setFont(new Font("Serif", Font.BOLD,18));
			beq.setBackground(new Color(255, 225, 107));
			frame.add(beq);

			bdiv = new JButton("÷");
			bdiv.setBounds(400, 150, 50, 40);
			bdiv.setFont(new Font("Serif", Font.BOLD,18));
			bdiv.setBackground(new Color(255, 225, 107));
			frame.add(bdiv);
			
			bmul = new JButton("x");
			bmul.setBounds(400, 250, 50, 40);
			bmul.setFont(new Font("Serif", Font.BOLD,18));
			bmul.setBackground(new Color(255, 225, 107));
			frame.add(bmul);
			
			bsub = new JButton("-");
			bsub.setBounds(400, 350, 50, 40);
			bsub.setFont(new Font("Serif", Font.BOLD,18));
			bsub.setBackground(new Color(255, 225, 107));
			frame.add(bsub);
			
			badd = new JButton("+");
			badd.setBounds(400, 450, 50, 40);
			badd.setFont(new Font("Serif", Font.BOLD,18));
			badd.setBackground(new Color(255, 225, 107));
			frame.add(badd);
			
			bsqr = new JButton("x²");
			bsqr.setBounds(500, 150, 80, 40);
			bsqr.setFont(new Font("Serif", Font.BOLD,18));
			bsqr.setBackground(new Color(255, 225, 107));
			frame.add(bsqr);
			
			bcbe = new JButton("x³");
			bcbe.setBounds(500, 250, 80, 40);
			bcbe.setFont(new Font("Serif", Font.BOLD,18));
			bcbe.setBackground(new Color(255, 225, 107));
			frame.add(bcbe);
			
			bsqt = new JButton("√");
			bsqt.setBounds(500, 350, 80, 40);
			bsqt.setFont(new Font("Serif", Font.BOLD,18));
			bsqt.setBackground(new Color(255, 225, 107));
			frame.add(bsqt);
			
			blog = new JButton("Log");
			blog.setBounds(500, 450, 80, 40);
			blog.setFont(new Font("Serif", Font.BOLD,18));
			blog.setBackground(new Color(255, 225, 107));
			frame.add(blog);
			
			bclr = new JButton("Clear");
			bclr.setBounds(100, 550, 150, 40);
			bclr.setFont(new Font("Serif", Font.BOLD,18));
			bclr.setBackground(new Color(255, 225, 107));
			frame.add(bclr);
			
			bksp = new JButton("⌫");
			bksp.setBounds(400, 550, 150, 40);
			bksp.setFont(new Font("Serif", Font.BOLD,18));
			bksp.setBackground(new Color(255, 225, 107));
			frame.add(bksp);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setSize(650, 800);
			frame.setVisible(true);
			
			b0.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			bdec.addActionListener(this);
			badd.addActionListener(this);
			bsub.addActionListener(this);
			bmul.addActionListener(this);
			bdiv.addActionListener(this);
			beq.addActionListener(this);
			bclr.addActionListener(this);
			bksp.addActionListener(this);
			bsqr.addActionListener(this);
			bcbe.addActionListener(this);
			bsqt.addActionListener(this);
			blog.addActionListener(this);
			
		}
		// Listener -- waiting for an event, mouse click, mouse over, etc.
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// Handler -- call a handler method
			if (e.getSource() == b1) {
				textField.setText(textField.getText().concat("1"));
			}
			if (e.getSource() == b2) {
				textField.setText(textField.getText().concat("2"));
			}
			if (e.getSource() == b3) {
				textField.setText(textField.getText().concat("3"));
			}
			if (e.getSource() == b4) {
				textField.setText(textField.getText().concat("4"));
			}
			if (e.getSource() == b5) {
				textField.setText(textField.getText().concat("5"));
			}
			if (e.getSource() == b6) {
				textField.setText(textField.getText().concat("6"));
			}
			if (e.getSource() == b7) {
				textField.setText(textField.getText().concat("7"));
			}
			if (e.getSource() == b8) {
				textField.setText(textField.getText().concat("8"));
			}
			if (e.getSource() == b9) {
				textField.setText(textField.getText().concat("9"));
			}
			if (e.getSource() == b0) {
				textField.setText(textField.getText().concat("0"));
			}

		
			if (e.getSource() == bdec) {
				textField.setText(textField.getText().concat("."));
			}
			
			if (e.getSource() == bksp) {
				textField.setText(textField.getText().substring(0, textField.getText().length()-1));
			}
			
			if (e.getSource() == bclr) {
				textField.setText("");
			}
			
			
			if (e.getSource() == badd) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			}
			
			if (e.getSource() == bsub) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			}

			if (e.getSource() == bmul) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			}
			
			if (e.getSource() == bdiv) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			}
			
			if (e.getSource() == bsqr) {
				firstNumber = Double.parseDouble(textField.getText());
				result = Math.pow(firstNumber, 2);
				textField.setText(""+result);

			}
			if (e.getSource() == bcbe) {
				firstNumber = Double.parseDouble(textField.getText());
				result = Math.pow(firstNumber, 3);
				textField.setText(""+result);
			}
			if (e.getSource() == bsqt) {
				firstNumber = Double.parseDouble(textField.getText());
				result = Math.sqrt(firstNumber);
				textField.setText(""+result);
			}
			if (e.getSource() == blog) {
				firstNumber = Double.parseDouble(textField.getText());
				result = Math.log10(firstNumber);
				textField.setText(""+result);
			}

			if (e.getSource() == beq) {
				secondNumber = Double.parseDouble(textField.getText());
				switch(operator) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				default: result = 0.0;
				}
				textField.setText(""+result);
			}
			
			
		}
		
		// Handler
		
	} // end of Calculator