package basics;

import java.util.Scanner;

public class ReplaceMethodInString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String str = in.nextLine();
		String repString = str.replace('i', 'l');
		System.out.println(repString);

		String repString1 = str.replaceAll("is", "was");
		System.out.println(repString1);

		String repString2 = str.replaceFirst("a", "p");
		System.out.println(repString2);
	}

}
