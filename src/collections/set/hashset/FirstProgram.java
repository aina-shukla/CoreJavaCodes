package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class FirstProgram {

	// The objects that we insert into the HashSet do not guarantee to be inserted
	// in the same order. The objects are inserted based on their hashcode. This
	// class also allows the insertion of NULL elements.
	//it is set, so dup not allowed

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashSet<String> hs = new HashSet<String>(); 
		  
	        hs.add("Geeks"); 
	        hs.add("For"); 
	        hs.add("Geeks"); 
	        hs.add("Is"); 
	        hs.add("Very helpful"); 
	        Iterator itr=hs.iterator();
	        while(itr.hasNext())
	        	System.out.println(itr.next());
	}

}
