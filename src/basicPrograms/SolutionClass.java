package basicPrograms;

import java.util.Scanner;

public class SolutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final MyCalculator my_calculator = new MyCalculator();
		    final Scanner in = new Scanner(System.in);
		    
		        while (in .hasNextInt()) {
		        	System.out.println("Enter two integers");
		            int n = in.nextInt();
		            int p = in.nextInt();
		            
		            try {
		                System.out.println(my_calculator.power(n, p));
		            } catch (Exception e) {
		                System.out.println(e);
		            }
		        }
		    }
}