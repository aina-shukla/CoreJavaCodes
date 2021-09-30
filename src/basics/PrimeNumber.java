package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = in.nextInt();
		boolean flag = false;
		for (int i = 0; i < num / 2; i++) {
			if (num % 2 == 0)
				flag = true;
			break;
		}
		if (!flag)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not prime");
	}

}
