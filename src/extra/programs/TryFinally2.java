package extra.programs;

public class TryFinally2 {

	static int m1() {

		try {
			return 100;
		}

		catch (Exception e) {
			return 101;
		}

		finally {
			return 102;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(m1());

	}
}
