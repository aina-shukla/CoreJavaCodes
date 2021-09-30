package collections.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveEleSet {

	//The values can be removed from the Set using the remove() method.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hs = new HashSet<Integer>(); 
		hs.add(10);
		hs.add(25);
		hs.add(78);
		hs.add(89);
		System.out.println(hs);
		hs.remove(25);
		System.out.println(hs);
	}

}
