package stringPrograms;

public class ToCharArrayClass {

	public static void main(String[] args) {
		// toCharArray() method converts this string into character array.
		
		String str="Any string";
		char[] ch= str.toCharArray()
;
		for(char c:ch) {
			System.out.print(c);
		}
	}

}
