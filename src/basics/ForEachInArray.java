package basics;

import java.util.Scanner;

public class ForEachInArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = in.nextInt();
		System.out.println("Enter integers");
		int[] numArray = new int[len];

		for (int i = 0; i < len; i++) {
			numArray[i] = in.nextInt();
		}
		
		for(int i:numArray) {
			System.out.println(i);
		}
	}
}
