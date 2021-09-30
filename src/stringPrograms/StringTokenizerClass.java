package stringPrograms;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	// The java.util.StringTokenizer class allows you to break a string into tokens.
	// It is simple way to break string.

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Github maintains git repositories");
		while (st.hasMoreElements()) {
			System.out.print(st.nextToken() + " ");
		}
	}
}