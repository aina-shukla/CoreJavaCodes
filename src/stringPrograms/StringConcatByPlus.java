package stringPrograms;

public class StringConcatByPlus {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Coding";
		String str3 = str1 + " " + str2;
		System.out.println(str3);

		String str4 = "Learning" + " Java";
		System.out.println(str4);

		String str5 = 40 + 10 + "Github" + 89 + 90;
		System.out.println(str5);    //50Github8990
		
		//After a string literal, all the + will be treated as string concatenation operator.
	}

}
