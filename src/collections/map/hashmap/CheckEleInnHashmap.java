package collections.map.hashmap;

import java.util.HashMap;

public class CheckEleInnHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Geeks");
		hm.put(2, "For");
		hm.put(3, "Geeks");

		System.out.println(hm);
		
		hm.forEach(
				(k, v) -> System.out.println(k + " : " + (v + " dxc"))
				); 
		
		if(hm.containsKey(4)) {
			String a=hm.get(2);
			System.out.println(a);
	}
		else
			System.out.println("Key not present");
		}
		} 


