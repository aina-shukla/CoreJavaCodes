package basicPrograms;

import java.util.Scanner;

public class AnagramsPrograms {

	    static boolean isAnagram(String a, String b) {
	        // Complete the function
	        boolean status = false;
	        
	        if(a.length()!=b.length())
	         return false;
	        else{
	         char[] arr1=a.toLowerCase().toCharArray();
	         char[] arr2=b.toLowerCase().toCharArray();
	         java.util.Arrays.sort(arr1);
	         java.util.Arrays.sort(arr2);
	         status = java.util.Arrays.equals(arr1,arr2);
	         return status;
	        }
	    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter two strings");
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}