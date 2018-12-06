
public class Main {
	
	public static void main(String[] args) {
		
		Cipher openCaesar = new Cipher();
		
		// first, ask if they want to encrypt or decrypt
		
		openCaesar.askED();
		char answer = openCaesar.answer();

		loop: switch(answer) {
			case('E'):
				openCaesar.getPlainText();
				openCaesar.getKey();
				openCaesar.encrypt();
				break loop;
			case('D'):
				openCaesar.getEncodedText();
				openCaesar.getKey();
				openCaesar.decrypt();
				break loop;
		
		
		}
	}
}
