package basics;

import java.util.Scanner;

public class FactorialProgramUisngLoop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = in.nextInt();

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}