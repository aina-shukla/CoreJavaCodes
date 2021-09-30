package extra.programs;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Try 1");
			System.exit(1);
		}
		finally {
			System.out.println("Finally 1");
		}
		// here the values are returned from try block and finally block. First it will
		// execute the try block but before return it should execute the finally block.
		// So this method will return 101, from the finally block instead of 100.
		try {
			System.out.println("Try 2");
			return;
		} finally {
			System.out.println("Finally 2");
		}
	}

}
