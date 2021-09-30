package stringPrograms;

import java.util.Scanner;

public class CountPunctuationCharsInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = scan.nextLine();

		char[] cArray = str.toCharArray();
		int count = 0;

		for(int i=0; i<cArray.length; i++) {
			if(cArray[i]>=33 && cArray[i]<=47 || cArray[i]>=58 && cArray[i]<=64 || cArray[i]>=91 && cArray[i]<=96 || cArray[i]>=123 && cArray[i]<=126)
				count++;
			
		}
		System.out.println("Count is: "+count);
		scan.close();
	}

}
