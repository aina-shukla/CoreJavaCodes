package basics;

import java.util.Scanner;

public class FactorsOfAnInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = in.nextInt();

		System.out.println("Factor of " + num + " are:");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
