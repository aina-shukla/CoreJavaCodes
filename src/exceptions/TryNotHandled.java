package exceptions;

public class TryNotHandled {

	//In this case, default handling mechanism is followed. If finally block is present, it will be executed followed by default handling mechanism.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {0,1,2,3};
			System.out.println(a[4]);
			System.out.println("inside try");
		}
		catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("inside catch");
		}
		finally {
			System.out.println("finally");
		}
		
	}

}
