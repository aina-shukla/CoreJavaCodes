package collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class FirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap tmap = new TreeMap<Integer, String>();
		tmap.put(1, "alia");
		tmap.put(2, "nansi");
		tmap.put(3, "midhi");
		tmap.put(4, "baira");

		// traversing tree map
		System.out.println(tmap); // normal print

		tmap.forEach( // usig for each
				(k, v) -> System.out.println(k + "-" + v));

//		for (Map.Entry<Integer, String> e : tmap.entrySet())  //using enhanced for
//			System.out.println(e.getKey()+" "+e.getValue());

		if (tmap.containsKey(1))
			System.out.println("key 1 is present");
		if (tmap.containsValue("mansi"))
			System.out.println("value mansi is present");

	}

}
