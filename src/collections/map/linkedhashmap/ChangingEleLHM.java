package collections.map.linkedhashmap;

import java.util.LinkedHashMap;

public class ChangingEleLHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "abc");
		lhm.put(2, "lkm");
		lhm.put(3, "opu");
		lhm.put(4, "poee");
		System.out.println(lhm);
		lhm.put(4,"rrr");
		System.out.println(lhm);
	}

}
