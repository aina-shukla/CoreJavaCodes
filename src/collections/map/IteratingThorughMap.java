package collections.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingThorughMap {

	// There are multiple ways to iterate through the Map. The most famous way is to
	// use a for-each loop and get the keys. The value of the key is found by using
	// the getValue() method.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("a", 12);
		m.put("b", 13);
		m.put("c",14);
		m.put("d", 20);
		for(Map.Entry<String, Integer> me : m.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
	}

}}
