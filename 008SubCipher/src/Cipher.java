import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cipher {

	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:";
	private String plainText = "";
	private String plainEncodedText = "";
	private String encodedText = "";
	private String decryptedText = "";
	private String question = "";
	
	private char answer;
	private int key = 0;
	Scanner keyboard = new Scanner(System.in);
	
	
	
	public char answer() {
		return answer;
		
	}
	public Cipher() {
		
		JOptionPane.showMessageDialog(null, "Entered the Caesar constructor");
		
	}
	
	public void getPlainText() {
		
		plainText = JOptionPane.showInputDialog("\nPlease enter plain text: ");

	}
	
	public void getEncodedText() {
		
		plainEncodedText = JOptionPane.showInputDialog("\nPlease enter encoded text: ");

	}
	public void getKey() {
		
		key = Integer.parseInt(JOptionPane.showInputDialog("\nPlease enter the key: "));

	}
	
	public void encrypt() {
		
		for (int i = 0; i < plainText.length(); i++) {
			
			char a = plainText.toLowerCase().charAt(i);
			
			if (!alpha.contains(String.valueOf(plainText.charAt(i)))) {
				encodedText += " ";
				
			} else {
				int index = (alpha.indexOf(a) + key) % alpha.length();
				encodedText += alpha.charAt(index);
			}
			
			
			
		}
		JOptionPane.showMessageDialog(null, "Encoded Text: " + encodedText);
	}
	
	public void decrypt() {
		
		for (int i = 0; i < plainEncodedText.length(); i++) {
			
			char a = plainEncodedText.toLowerCase().charAt(i);
			int index = (alpha.indexOf(a) - key) % alpha.length();
			if (index < 0) {
				index += alpha.length();
			}
			decryptedText += alpha.charAt(index);
			
		}
		JOptionPane.showMessageDialog(null, "Decrypted Text: " + decryptedText);
	}
	
	public void askED() {
		
		while (true) {
			question = JOptionPane.showInputDialog("Would you like to encrypt, or decrypt? ");
			char first = question.toUpperCase().charAt(0);
			
			if (first == 'E' || first == 'D') {
				question = question.replace(question.charAt(0), first);
				answer = question.charAt(0);
				break;			
			} else {
				question = JOptionPane.showInputDialog("Would you like to encrypt, or decrypt? ");

			}
			
		}
		JOptionPane.showMessageDialog(null, "\n" + question + " it is!");
		

	}
}
