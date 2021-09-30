package exceptions;

public class TryCatchFinallyClause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {0,1,2,3};
			System.out.println(a[4]);
			System.out.println("inside try");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("inside catch");
		}
		finally {
			System.out.println("inside finally block");
		}
		System.out.println("outside try catch finally clause");
	}

}
