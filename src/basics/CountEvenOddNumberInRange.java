package basics;

import java.util.Scanner;

public class CountEvenOddNumberInRange {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter range");
		int range1 = in.nextInt();
		int range2 = in.nextInt();
		int countEven = 0, countOdd = 0;
		for (int i = range1; i <= range2; i++) {
			if (i % 2 == 0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("Total even and odd numbers between " + range1 + " and " + range2 + " are " + countEven
				+ " and " + countOdd + " respectively.");
	}

}
