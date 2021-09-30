package collections.set;

import java.util.HashSet;
import java.util.Set;

public class AddEleSet {

	//the insertion order is not retained in the Set.
	//duplicate elements are not allowed and all the duplicate elements are ignored. And also, Null values are not accepted by the Set.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hs = new HashSet<Integer>(); 
		hs.add(10);
		hs.add(25);
		hs.add(78);
		hs.add(89);
		System.out.println(hs);
	}

}
