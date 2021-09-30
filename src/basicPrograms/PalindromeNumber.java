package basicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();
		int rem, sum = 0, temp;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is palindrome");
		} else
			System.out.println(temp + " is not palindrome");
	}

}
