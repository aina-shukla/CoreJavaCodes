package basics;

import java.util.ArrayList;

public class ListIterationUsingForEach {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			al.add(i);
		}
		al.forEach((n) -> {
			System.out.println(n);
		});

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Java");
		al1.add("Collection");
		al1.add("framework");
		al1.forEach((String name) -> {
			System.out.println(name);
		});

	}

}
