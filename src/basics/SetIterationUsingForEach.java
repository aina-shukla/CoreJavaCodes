package basics;

import java.util.HashSet;

public class SetIterationUsingForEach {

	public static void main(String[] args) {

		HashSet<Integer> hObj = new HashSet<Integer>();
		hObj.add(23);
		hObj.add(34);
		hObj.add(10);
		hObj.add(90);
		System.out.println(hObj);

		hObj.forEach((e) -> {
			System.out.println(e);
		}

		);

	}

}
