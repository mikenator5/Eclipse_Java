import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inFile = new File("data.txt");
		Scanner in = new Scanner(inFile);
		
		int i = 0;
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			i++;
			System.out.println(i + ": " + line);
			
		}
		in.close();
	}

}
