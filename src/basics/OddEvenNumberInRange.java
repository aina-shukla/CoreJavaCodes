package basics;

import java.util.Scanner;

public class OddEvenNumberInRange {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter range");
		int r1 = in.nextInt();
		int r2 = in.nextInt();

		for (int i = r1; i < r2; i++) {
			if (i % 2 == 0)
				System.out.println(i + " is even");
			else
				System.out.println(i + " is odd");
		}	
	}
}
