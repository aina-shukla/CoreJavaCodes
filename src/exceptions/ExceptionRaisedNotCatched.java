package exceptions;

public class ExceptionRaisedNotCatched {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exception raised: If an exception has occurred in try block then control flow will be finally block followed by default exception handling mechanism.
		
		try {
			int a[]= {0,1,2,3};
			System.out.println(a[4]);
			System.out.println("inside try");
		}
		finally {
			System.out.println("finally executed");
		}
	}

}
