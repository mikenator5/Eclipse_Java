import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("Credits.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Course: 30 Credits");
			pw.println("Year: 120 Credits");
			pw.println("Degree: 360 Credits");
			
			pw.close();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
