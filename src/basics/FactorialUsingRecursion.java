package basics;

import java.util.Scanner;

public class FactorialUsingRecursion {

	static int factorial(int num) {

		if (num == 0)
			return 1;
		else
			return (num * factorial(num - 1));
	}

	public static void main(String[] args) {
		int fact = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = in.nextInt();

		fact = factorial(num);
		System.out.println("factorial of " + num + " is " + fact);

	}

}
