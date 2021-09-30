package stringPrograms;

public class WaysToCreateStringObject {

	public static void main(String[] args) {

		String str1 = "Welcome"; // by using string literal
		char[] charArray = { 't', 'o' };
		String str2 = new String(charArray); // converting char array to string
		String str3 = new String("Java"); // bu using new keyword

		System.out.print(str1 + " ");
		System.out.print(str2 + " ");
		System.out.print(str3);

	}

}