package basics;

import java.util.Scanner;

public class CountEvenOddNumbersInArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = in.nextInt();
		System.out.println("Enter integers");
		int[] numArray = new int[len];

		int cEven = 0, cOdd = 0;

		for (int i = 0; i < len; i++) {
			numArray[i] = in.nextInt();
		}

		for (int j = 0; j < len; j++) {
			if (numArray[j] % 2 == 0)
				cEven++;
			else
				cOdd++;
		}
		System.out.println(
				"Total even and odd numbers in the given array are " + cEven + " and " + cOdd + " respectively.");

	}

}
