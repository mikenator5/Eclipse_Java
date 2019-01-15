import java.util.Arrays;

public class SelectionSort {

	
	public SelectionSort (int[] list, char[] alpha) {
		int i, j, minValue, minIndex, temp = 0;
		char temp2 = 0;
		for (i = 0; i < list.length; i++) {
			minValue = list[i];
			minIndex = i;
			for (j = i; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if (minValue < list[i]) {
				temp = list[i];
				temp2 = alpha[i];
				list[i] = list[minIndex];
				alpha[i] = alpha[minIndex];
				list[minIndex] = temp;
				alpha[minIndex] = temp2;
			}
		}
		
		for (int b = list.length - 1; b >= 0; --b) {
			System.out.println(alpha[b] + ": " + list[b]);
		}
		

	}

}
