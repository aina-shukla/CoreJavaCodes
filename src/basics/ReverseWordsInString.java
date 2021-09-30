package basics;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String str = in.nextLine();
		
		String[] stArray = str.split("\\s");
		int length = stArray.length;
		for(int i=0; i<length; i++) {
			String pString = stArray[i];
			StringBuffer sb = new StringBuffer(pString);
			sb.reverse();
			System.out.print(sb+" ");
		}
		
		
		
	}

}
