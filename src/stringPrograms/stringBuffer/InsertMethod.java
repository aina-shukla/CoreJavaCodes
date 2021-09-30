package stringPrograms.stringBuffer;

public class InsertMethod {

	public static void main(String[] args) {
		// The insert() method inserts the given string with this string at the given
		// position.

		StringBuffer sb = new StringBuffer("github maintain git repositories");
		sb.insert(6, " is used to");
		System.out.println(sb); // github is used to maintain git repositories
	}

}
