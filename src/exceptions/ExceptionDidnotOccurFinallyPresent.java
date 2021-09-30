package exceptions;

public class ExceptionDidnotOccurFinallyPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {0,1,2,3};
			System.out.println(a[2]);
			System.out.println("inside try");
		}
		catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("inside catch");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("outside rach clause");
	}

}
