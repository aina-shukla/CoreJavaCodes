package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstProg {

	// HashMap uses a technique called Hashing. Hashing is a technique of converting
	// a large String to small String that represents the same String so that the
	// indexing and search operations are faster. HashSet also uses HashMap
	// internally.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Geeks");
		hm.put(2, "For");
		hm.put(3, "Geeks");

		System.out.println(hm); // normal print
		
		//print using for each
		hm.forEach(
				(k,v) -> System.out.println((k+10)+" "+v)
				);
		
		for (Map.Entry<Integer, String> e : hm.entrySet())
			System.out.println(e.getKey() + "-" + e.getValue());
	}

}
