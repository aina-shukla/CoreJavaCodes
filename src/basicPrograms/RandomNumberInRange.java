package basicPrograms;

import java.util.Scanner;

public class RandomNumberInRange {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = in.nextInt();
		int num2= in.nextInt();
		System.out.println("Double value :"+Math.random()*(num1-num2+1)+num2);
		System.out.println("Int value :"+(int)Math.random()*(num1-num2+1)+num2);

	}

}
