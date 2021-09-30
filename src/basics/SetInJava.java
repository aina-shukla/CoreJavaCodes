package basics;

import java.util.HashSet;

public class SetInJava {

	public static void main(String[] args) {

		HashSet<String> setObj = new HashSet<String>();
		setObj.add("geeks");
		setObj.add("for");
		setObj.add("geeks"); // duplicates not allowed, successfully compiled
		System.out.println(setObj); // [geeks, for]

	}

}
