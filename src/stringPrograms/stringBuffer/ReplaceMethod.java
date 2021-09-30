package stringPrograms.stringBuffer;

public class ReplaceMethod {

	public static void main(String[] args) {
//The replace() method replaces the given string from the specified beginIndex and endIndex.

      StringBuffer sb= new StringBuffer("Hello world");
      System.out.println(sb.replace(3, 6, "Bye")); //HelByeworld
	}

}
