
public class MergeSortMain {

	private int[] array;
	private char[] chararray;
	private int[] tempMergArr;
	private char[] tempMergArrChar;
	private int length;

	public MergeSortMain(char[] alphaList, int[] intList) {

		int[] inputArr = intList;
		char[] charArr = alphaList;
		
		this.array = inputArr;
		this.chararray = charArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		this.tempMergArrChar = new char[length];
		doMergeSort(0, length - 1);
		for (int i = alphaList.length - 1; i >= 0; --i) {
			System.out.println(charArr[i] + ": " + inputArr[i]);
		}
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
			tempMergArrChar[i] = chararray[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				chararray[k] = tempMergArrChar[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				chararray[k] = tempMergArrChar[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			chararray[k] = tempMergArrChar[i];
			k++;
			i++;
		}

	}
}
