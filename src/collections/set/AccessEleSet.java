package collections.set;

import java.util.HashSet;
import java.util.Set;

public class AccessEleSet {

	//After adding the elements, if we wish to access the elements, we can use inbuilt methods like contains().
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hs = new HashSet<Integer>(); 
		hs.add(10);
		hs.add(25);
		hs.add(78);
		hs.add(89);
		hs.add(78);
		System.out.println(hs);
		System.out.println(hs.contains(89));
	}

}
