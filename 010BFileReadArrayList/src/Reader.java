import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Reader {

	
	//@SuppressWarnings("resource")	
	public static void main(String[] args) {
		
		
		
		String fileName = "/home/compsci/eclipse-workspace/textfiles/Kennedy_Cuba_Crisis.txt";
		String line;
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<Character> bList = new ArrayList<Character>();

		ArrayList<Integer> intList2 = new ArrayList<Integer>();
		ArrayList<Character> alphaList2 = new ArrayList<Character>();
		
		String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.,?\":;-'";
		
		char[] alphaList = new char[alpha.length()];
		int[] intList = new int[alpha.length()];
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(fileName));
			if (!input.ready()) {
				throw new IOException();
			}
			
			while ((line = input.readLine()) != null) {
				aList.add(line);
				}
			input.close();
		} catch(IOException e) {
			System.out.println("Error: " + e);
		}
		
		// Convert aList to string
		String listString = String.join("", aList).toLowerCase();
		
		// Add the characters the bList
		for (int i = 0; i < listString.length(); i++) {
			bList.add(listString.charAt(i));	
		}
		
		
		// Print out the frequency of letters in alpha
		for (int b = 0; b < alpha.length(); b++) {
			
			int occurrences = Collections.frequency(bList, alpha.charAt(b));
			alphaList[b] = alpha.charAt(b);
			intList[b] = occurrences;
			alphaList2.add(alphaList[b]);
			intList2.add(intList[b]);
			//System.out.println(alpha.charAt(b) + ": " + occurrences);
		}
		String[] options = {"Bubble", "Insertion", "InsertionArrayList", "MergeSort", "QuickSort", "SelectionSort"};
		int answer = JOptionPane.showOptionDialog(null, "Which program do you want to run?", "Click a program", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
		switch(answer) {
			case(0):
				Sorter mySorter = new Sorter(alphaList, intList);
				break;
			case(1):
				Insertion myInsertion = new Insertion(alphaList, intList);
				break;
			case(2):
				InsertionArrayList myArrayList = new InsertionArrayList(alphaList2, intList2);
				break;
			case(3):
				MergeSortMain myMergeSort = new MergeSortMain(alphaList, intList);
				break;
			case(4):
				QuickSort myQuickSort = new QuickSort(intList, alphaList);
				break;
			case(5):
				SelectionSort mySelectionSort = new SelectionSort(intList, alphaList);
				break;
		}
		
		// Print out each item in the ArrayList
		//int sz = aList.size();
		//for (int i = 0; i < sz; i++) {
		//	System.out.println(aList.get(i).toString());
		//}
	}

	
	}

