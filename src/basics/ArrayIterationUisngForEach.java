package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIterationUisngForEach {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int len = in.nextInt();
		int[] array = new int[len];

		System.out.println("Enter integers into array");
		for (int i = 0; i < len; i++) {
			array[i] = in.nextInt();
		}

		Arrays.stream(array).forEach((e) -> {
			System.out.println(e + " ");
		}

		);

	}

}
