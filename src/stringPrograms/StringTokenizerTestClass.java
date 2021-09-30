package stringPrograms;

import java.util.StringTokenizer;

public class StringTokenizerTestClass {

	// / The java.util.StringTokenizer class allows you to break a string into
	// tokens.
	// It is simple way to break string.
	
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Github,maintains,git,repositories");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken(","));
		}
	}

}