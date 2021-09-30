package basics;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumberInString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int len= in.nextInt();
		int array[]=new int[len];
		System.out.println("Enter integers in array");
		for(int i=0; i<len; i++) {
			array[i]=in.nextInt();
		}
		
		//sorting array
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				int temp=0;
				if(array[i]>array[j])
				{
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		
		System.out.println("Sorted array is "+ Arrays.toString(array));
		System.out.println("Second highest number in the array is "+array[len-2]);
		
	}

}
