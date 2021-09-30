package basics;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String st=in.nextLine();
		
		String rev="";
		for(int i=st.length()-1; i>=0; i--) {
			rev=rev+st.charAt(i);
		}
		if(rev.equals(st))
			System.out.println(st+ " is palindrome");
		else
			System.out.println(st+" is not palindrome");
	}

}
