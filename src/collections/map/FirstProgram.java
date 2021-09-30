package collections.map;

import java.util.HashMap;
import java.util.Map;

public class FirstProgram {

	// A map is a data structure which supports the key-value pair mapping for the
	// data. This interface doesn’t support duplicate keys because the same key
	// cannot have multiple mappings. A map is useful if there is a data and we wish
	// to perform operations on the basis of the key.

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
		
	}

}
