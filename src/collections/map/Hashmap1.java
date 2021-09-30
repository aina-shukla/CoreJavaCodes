package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	// In order to add an element to the map, we can use the put() method. However,
	// the insertion order is not retained in the hashmap. Internally, for every
	// element, a separate hash is generated and the elements are indexed based on
	// this hash to make it more efficient.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hm1= new HashMap<Integer, String>();   //using generics
		Map<Integer,String> hm2=new HashMap();  //default initialization
		hm1.put(0, "a");
		hm1.put(1, "b");
		hm1.put(2, "c");
		hm1.put(3, "d");
		hm2.put(0, "a");
		hm2.put(1, "b");
		hm2.put(2, "c");
		hm2.put(3, "d");
		System.out.println(hm1);
		System.out.println(hm2);
		
	}

}
