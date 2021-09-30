package basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int input = scan.nextInt();

		int newNum = 0;
		int temp = input;
		while (input != 0) {
			int rem = input % 10;
			newNum = newNum * 10 + rem;
			input = input / 10;
		}

		if (temp == newNum)
			System.out.println(temp + " is palindrome.");
		else
			System.out.println(temp + " is not palindrome");

	}

}
