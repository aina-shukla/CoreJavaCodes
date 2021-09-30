package collections.map;

import java.util.HashMap;
import java.util.Map;

public class ChangeEleHashmap {

	// After adding the elements if we wish to change the element, it can be done by
	// again adding the element with the put() method. Since the elements in the map
	// are indexed using the keys, the value of the key can be changed by simply
	// inserting the updated value for the key for which we wish to change.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hm1= new HashMap<Integer, String>();
		hm1.put(1, "geeks");
		hm1.put(2, "geeks");
		hm1.put(3, "geeks");
		System.out.println(hm1);
		hm1.put(2, "for");
		System.out.println(hm1);
	}

}
