import java.util.ArrayList;

public class Insertion {
	String alphaBet = "abcdefghijklmnopqrstuvwxyz0123456789.,?\":;-'";
	public Insertion(char[] alphaList, int[] intList) {
			
			int i, j, temp, key2;
			char temp2;
			for (i = 1; i < alphaList.length; i++) {
				key2 = intList[i];
				j = i - 1;
				while (j >= 0 && key2 > intList[j]) {
					temp = intList[j];
					intList[j]=intList[j+1];
					intList[j+1]=temp;
					temp2 = alphaList[j];
					alphaList[j] = alphaList[j+1];
					alphaList[j+1] = temp2;
					j--;
				}
			}
			
			for (int b = 0; b< alphaBet.length(); b++) {
				System.out.println(alphaList[b] + ": " + String.valueOf(intList[b]));
			}
	}

	
}
