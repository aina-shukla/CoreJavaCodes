package collections.map;

import java.util.HashMap;
import java.util.Map;

public class RemoveEleHashmap {

	// In order to remove an element from the Map, we can use the remove() method.
	// This method takes the key value and removes the mapping for a key from this
	// map if it is present in the map.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hm1= new HashMap<Integer, String>();
		hm1.put(1, "geeks");
		hm1.put(2, "geeks");
		hm1.put(3, "geeks");
		System.out.println(hm1);
		hm1.remove(2);
		System.out.println(hm1);
	}

}
