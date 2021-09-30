package collections.map.sortedmap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(new Integer(2), "practice");
		sm.put(new Integer(3), "quiz");
		sm.put(new Integer(5), "code");
		sm.put(new Integer(4), "contribute");
		sm.put(new Integer(1), "geeksforgeeks");
		System.out.println(sm);
		
		sm.forEach(  //using for each
				(k,v)->System.out.println(k+" "+v)
			)	;
		
		for(Map.Entry<Integer,String> m : sm.entrySet())  //using for
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
