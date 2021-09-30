package basics;

import java.util.Arrays;
import java.util.Scanner;

public class SplitStringProgram {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String str = in.nextLine();
		
		String[] stArray = str.split("\\s");
		
		System.out.println(Arrays.toString(stArray));
	}

}
