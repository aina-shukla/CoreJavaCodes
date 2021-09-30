package basics;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayInDescOrder {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = in.nextInt();
		System.out.println("Enter integers");
		int[] numArray = new int[len];

		for (int i = 0; i < len; i++) {
			numArray[i] = in.nextInt();
		}

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int temp = 0;
				if (numArray[i] < numArray[j]) {
					temp = numArray[j];
					numArray[j] = numArray[i];
					numArray[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numArray));

	}

}
