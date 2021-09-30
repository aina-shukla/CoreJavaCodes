package basics;

import java.util.Scanner;

public class DuplicateCharsInString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String str = in.nextLine();
		
		char[] c_array = str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(c_array[i]==c_array[j])
					System.out.println("Duplicate chars in "+ str+ ": "+c_array[j]);
			}
		}		
	}		
}