package basics;

import java.util.HashMap;

public class MapsInJava {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1, "geeks");
		hm.put(2, "for");
		hm.put(3, "geeks");
		System.out.println(hm);  //{1=geeks, 2=for, 3=geeks}
		
		hm.put(2, "and");        // duplicate key allowed, but value gets replaced with new value
		System.out.println(hm);  //{1=geeks, 2=and, 3=geeks}
	}

}
