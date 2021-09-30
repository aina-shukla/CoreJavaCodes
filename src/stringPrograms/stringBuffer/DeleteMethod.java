package stringPrograms.stringBuffer;

public class DeleteMethod {

	public static void main(String[] args) {
//The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.

		StringBuffer sb = new StringBuffer("Hello world");
		System.out.println(sb.delete(3, 6)); // Helworld
		System.out.println(sb.deleteCharAt(5)); // Helwold
	}

}
