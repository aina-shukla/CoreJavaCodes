package basics;

import java.util.Scanner;

public class ReversingWordsWithoutReversingCharsInString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String str = in.nextLine();
		
		String[] stArray = str.split("\\s");
		for(int i=stArray.length-1; i>=0;i--) {
			String rev= stArray[i];
			System.out.print(rev+" ");
		}
		
	}

}
