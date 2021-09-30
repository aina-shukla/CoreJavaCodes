package stringPrograms;

public class StringContains {

	public static void main(String[] args) {
		// contains() method searches the sequence of characters in this string.

		String str = "This method searches the sequence of characters in this string";
		System.out.println(str.contains("method"));
		System.out.println(str.contains("the sequence of"));
		System.out.println(str.contains("find"));

		/*
		 * true true false
		 */
	}

}