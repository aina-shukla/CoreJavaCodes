package collections.map.treemap;

import java.util.TreeMap;

public class ChangingeleinTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap tmap = new TreeMap<Integer, String>();
		tmap.put(1, "alia");
		tmap.put(2, "mansi");
		tmap.put(3, "nidhi");
		tmap.put(4, "zaira");

		// traversing tree map
		System.out.println(tmap); // normal print
		tmap.put(1, "rekha");
		System.out.println(tmap);
	}

}
