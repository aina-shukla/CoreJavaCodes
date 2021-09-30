package exceptions;

public class ExceptionDidnotOccur {

	// In this case catch block never runs as they are only meant to be run when an
	// exception occurs. finally block(if present) will be executed followed by rest
	// of the program.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {0,1,2,3};
			System.out.println(a[0]);
			System.out.println("inside try");
		}
		catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("inside catch");
		}
		System.out.println("outside each clause");
	}

}
