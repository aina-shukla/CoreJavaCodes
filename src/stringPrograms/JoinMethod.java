package stringPrograms;

public class JoinMethod {

	public static void main(String[] args) {
		// join() method returns a string joined with given delimiter. In string join
		// method, delimiter is copied for each elements.

		String str1 = String.join("-", "welcome", "to", "the", "world");
		System.out.println(str1);

	}

}
