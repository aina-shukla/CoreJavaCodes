package collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TraversingTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap tmap = new TreeMap<Integer, String>();
		tmap.put(1, "alia");
		tmap.put(2, "nsi");
		tmap.put(3, "mnidhi");
		tmap.put(4, "zaira");

		// traversing tree map
		System.out.println(tmap); // normal print
		
		tmap.forEach(
				(k,v)->System.out.println(k+" "+v)
				);
		
//		for (Map.Entry<Integer, String> e : tmap.entrySet())  //using enhanced for
//			System.out.println(e.getKey()+" "+e.getValue());
	}

}
