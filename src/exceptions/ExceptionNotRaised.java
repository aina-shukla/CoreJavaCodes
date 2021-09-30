package exceptions;

public class ExceptionNotRaised {

	//Exception not raised: If an exception does not occur in try block then control flow will be finally block followed by rest of the program
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {0,1,2,3};
			System.out.println(a[2]);
			System.out.println("inside try");
		}
		finally {
			System.out.println("finally executed");
		}
	}

}
