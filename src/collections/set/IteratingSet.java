package collections.set;

import java.util.HashSet;
import java.util.Set;

public class IteratingSet {

	// There are various ways to iterate through the Set. The most famous one is to use the enhanced for loop.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hs = new HashSet<Integer>(); 
		hs.add(10);
		hs.add(25);
		hs.add(78);
		hs.add(89);
		//System.out.println(hs);
		for(Integer i:hs)
			System.out.println(i);
	}

}
