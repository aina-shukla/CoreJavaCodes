package stringPrograms;

public class StringCompareToIgnoreCaseOperator {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "programming";
		String str3 = "learning";
		String str4 = "Java";

		System.out.println(str1.compareTo(str2)); // negative value
		System.out.println(str1.compareTo(str4)); // positive value
		System.out.println(str3.compareTo(str4)); // positive value

		/*
		 * -6 32 34
		 */

	}

}
