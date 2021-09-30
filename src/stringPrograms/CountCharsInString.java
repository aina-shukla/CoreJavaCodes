package stringPrograms;

import java.util.Scanner;

public class CountCharsInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = scan.nextLine();
		
		int count=0;
		String[] stArray = str.split("\\s");
		for(int i=0; i < stArray.length; i++) {
			int len=stArray[i].length();
			count=count+len;
		}
		System.out.println("Number of chars in string is: "+count);
		
	}

}
