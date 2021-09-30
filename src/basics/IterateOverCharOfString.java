package basics;

import java.util.Scanner;

public class IterateOverCharOfString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String str = in.nextLine();
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}

	}

}
