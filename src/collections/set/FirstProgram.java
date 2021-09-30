package collections.set;

import java.util.HashSet;
import java.util.Set;

public class FirstProgram {

	//Set is an interface, objects cannot be created of the type set.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<String> hash_Set= new HashSet<String>(); 
		 hash_Set.add("set");
		 hash_Set.add("set");
		 hash_Set.add("dequeue");
		 hash_Set.add("link");
		 hash_Set.add("last");
		 System.out.println(hash_Set);
	}

}
