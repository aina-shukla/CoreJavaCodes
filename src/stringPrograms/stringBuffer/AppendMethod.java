package stringPrograms.stringBuffer;

public class AppendMethod {

	public static void main(String[] args) {
//The append() method concatenates the given argument with this string.

		StringBuffer bObj = new StringBuffer("Hello");
		bObj.append(" World");
		System.out.println(bObj);  // value of original object is changed
		
		//Hello World
	}

}
