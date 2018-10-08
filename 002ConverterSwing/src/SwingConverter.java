import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SwingConverter implements ActionListener {
	
	private JPanel inputPanel = initInputPanel();

	private JTextField inputText;
	private JTextField inputText2;
	private JTextArea resultArea;
	private JTextArea resultArea2;
	private JButton enterButton;
	private JButton enterButton2;
	
	// Constructor never has a return type
	public SwingConverter() {
		
		// Create and name window
		JFrame myWindow = new JFrame("Converter - Created by Mike D");

		
		// What to do on close
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		myWindow.add(inputPanel);

		
		// Set size of myWindow
		myWindow.setSize(600, 1000);

		
		// Make myWindow visible
		myWindow.setVisible(true);

		
	}
	
	public static void main(String[] args) throws Exception {
		
		// Other way to do below --> SwingConverter baseConverter = new SwingConverter();
		new SwingConverter();
		
		
	}

	
	private JPanel initInputPanel() {
		
		// Create panel
		JPanel panel = new JPanel();
	
		panel.setPreferredSize(new java.awt.Dimension(600, 500));
		panel.setBackground(new java.awt.Color(63, 255, 111));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Enter a base-10 number: ");
		//              x   y  width depth
		label.setBounds(50, 50, 220, 30);
		panel.add(label);
		
		// FOR SPHERE
		JLabel label2 = new JLabel("Enter the radius: ");
		label2.setBounds(50, 550, 220, 30);
		panel.add(label2);
		
		JTextField text;
		text = inputText = new JTextField();
		text.setBounds(230, 50, 100, 30);
		panel.add(text);
		
		JTextField text1;
		text1 = inputText2 = new JTextField();
		text1.setBounds(230, 550, 100, 30);
		panel.add(text1);
		
		JButton button = new JButton("Enter");
		button.setActionCommand("Enter");
		button.setBounds(340, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		// Save to the class variable, to be used in other methods
		enterButton = button; // Assign it to a class var to be used in other methods
		
		button = new JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(430, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		
		JButton button2 = new JButton("Calculate");
		button2.setActionCommand("Calculate");
		button2.setBounds(350, 550, 100, 30);
		button2.addActionListener(this);
		panel.add(button2);
		enterButton2 = button2;
		
		button2 = new JButton("Reset");
		button2.setActionCommand("Reset2");
		button2.setBounds(460, 550, 80, 30);
		button2.addActionListener(this);
		panel.add(button2);
		
		resultArea = new JTextArea();
		resultArea.setBounds(50, 180, 500, 200);
		resultArea.setEditable(false);
		resultArea.setBackground(new java.awt.Color(86, 249, 255));
		panel.add(resultArea);
		
		resultArea2 = new JTextArea();
		resultArea2.setBounds(50, 680, 500, 200);
		resultArea2.setEditable(false);
		resultArea2.setBackground(new java.awt.Color(86, 249, 255));
		panel.add(resultArea2);
		
		
		// Return "JPanel" panel
		return panel;
	}
	
	private void showResult() {
		
		String hexUpperCase;
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		
		Integer n = getInputNumber();
		if (n == null) {
			resultArea.append("Invalid number!" + "\n");
			return;
		} else {
			int baseTen = n.intValue();
			resultArea.append("Decimal = " + baseTen + "\n");
			resultArea.append("Binary = " + Integer.toString(baseTen, 2) + "\n");
			resultArea.append("Octal = " + Integer.toString(baseTen, 8) + "\n");
			resultArea.append("Hexadecimal = " + Integer.toString(baseTen, 16) + "\n");
			resultArea.append("Hexadecimal = " + Integer.toString(baseTen, 16).toUpperCase() + "\n");
		}
		
		
	}
	
	private void showResult2() {
		
		inputText2.setEnabled(false);
		enterButton2.setEnabled(false);
		
		Integer c = getInputNumber2();
		if (c == null) {
			resultArea2.append("Invalid number!" + "\n");
			return;
			
		} else {
			int r = c.intValue();
			double pi = Math.PI;
			double frac = 4d/3d;
			double answer = (frac*pi)*Math.pow(r, 3);
			double answer2 = (pi*4)*Math.pow(r, 2);
			
			resultArea2.append("Volume = " + answer + "\n");
			resultArea2.append("Surface Area = " + answer2 + "\n");
		}
		
		
	}
	private Integer getInputNumber() {
		
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
		} catch (Exception e) {
			// OOPS! Problem with number entry
			// This traps that error, now tell user the error
			// and let them try an enter again
			// return null is to prevent a total crash, but
			// it really is not fixing the problem
			// NOT GOOD!
			return null;
		}
	}
	
	private Integer getInputNumber2() {
		try {
			Integer c = Integer.parseInt(inputText2.getText());
			return c;
		} catch (Exception e) {
			
			return null;
		}
	}

	// This is a handler
	private void resetHandler() {
		inputText.setText("");
		resultArea.setText("");
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputText.requestFocus();
		
		
	}
	
	private void resetHandler2() {
		inputText2.setText("");
		resultArea2.setText("");
		inputText2.setEnabled(true);
		enterButton2.setEnabled(true);
		inputText2.requestFocus();
	}
	@Override
	public void actionPerformed(ActionEvent ev) {
		
		String command = ev.getActionCommand();
		if (command.equals( "Enter")) {
			showResult();
			
		} else if (command.equals("Reset")) {
			
			resetHandler();
			
		} else if (command.equals("Calculate")) {
			showResult2();
		} else if (command.equals("Reset2")) {
			resetHandler2();
		}
		
			
		
	}

	
}
