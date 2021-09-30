package basics;

import java.util.Arrays;
import java.util.Scanner;

public class HighestAndLowestNumberInArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = in.nextInt();
		int[] array = new int[len];

		System.out.println("Enter integers in array");
		for (int i = 0; i < len; i++) {
			array[i] = in.nextInt();
		}

		System.out.println("Given array is " + Arrays.toString(array));

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		System.out.println("Sorted array is " + Arrays.toString(array));
		System.out.println("Smallest number in given array is " + array[0]);
		System.out.println("Highest number in given array is " + array[len - 1]);

	}

}
