package basics;

import java.util.Scanner;

public class ReplacingWhiteSpacesInString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String str = in.nextLine();
		
		String repString = str.replaceAll("\\s", "");
		System.out.println(repString);
	}

}
