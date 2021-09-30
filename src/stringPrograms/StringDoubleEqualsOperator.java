package stringPrograms;

public class StringDoubleEqualsOperator {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");

		System.out.println(str1 == str2); // both reference variable point to same object in SCP
		System.out.println(str2 == str3); // str3 points to object in heap

		/*
		 * true false
		 */

	}

}
