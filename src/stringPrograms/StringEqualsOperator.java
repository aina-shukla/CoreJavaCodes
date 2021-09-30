package stringPrograms;

public class StringEqualsOperator {

	public static void main(String[] args) {

		String str1 = "JAVA";
		String str2 = "java";
		String str3 = "java";

		System.out.println(str1.equals(str3)); // compares this string to the specified object
		System.out.println(str1.equalsIgnoreCase(str2)); // compares this String to another string, ignoring case
		System.out.println(str2.equals(str3));

		/*
		 * false true true
		 */

	}

}
