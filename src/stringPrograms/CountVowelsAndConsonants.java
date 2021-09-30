package stringPrograms;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = scan.nextLine();

		int countV = 0, countC = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				countV++;
			else if(str.charAt(i)==' ')
				continue;
			else
				countC++;
		}

		System.out.println("Vowels are: " + countV);
		System.out.println("Consonants are: " + countC);

	}

}
