package exceptions;

public class ArithmeticExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 3, b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
