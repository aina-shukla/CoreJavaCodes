package extra.programs;

public class TryFinally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Try 2");
			return;
		} finally {
			System.out.println("Finally 2");
		}
	}

}
