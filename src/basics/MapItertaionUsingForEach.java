package basics;

import java.util.HashMap;

public class MapItertaionUsingForEach {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Guinea");
		hmap.put(2, "pigs");
		hmap.put(3, "are");
		hmap.put(4, "cute");
		hmap.put(5, "pets");
		hmap.forEach((k, v) ->
		System.out.println(k + "=" + v));
	}
}