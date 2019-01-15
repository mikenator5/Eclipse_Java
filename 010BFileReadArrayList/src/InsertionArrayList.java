import java.util.ArrayList;

public class InsertionArrayList {
	String alphaBet = "abcdefghijklmnopqrstuvwxyz0123456789.,?\":;-'";
	public InsertionArrayList(ArrayList<Character> alphaList, ArrayList<Integer> intList) {
		
		int i, j, temp, key2;
		char temp2;
		for (i = 1; i < alphaList.size(); i++) {
			key2 = intList.get(i);
			j = i - 1;
			while (j >= 0 && key2 > intList.get(j)) {
				temp = intList.get(j);
				temp2 = alphaList.get(j);
				intList.set(j, intList.get(j+1));
				intList.set(j+1, temp);
				temp2 = alphaList.get(j);
				alphaList.set(j, alphaList.get(j+1));
				alphaList.set(j+1, temp2);
				j--;
			}
		}

		for (int b = 0; b< alphaBet.length(); b++) {
			System.out.println(alphaList.get(b) + ": " + String.valueOf(intList.get(b)));
		}
	}

}

