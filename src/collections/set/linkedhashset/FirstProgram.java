package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class FirstProgram {

	// The difference is that this uses a doubly linked list to store the data and retains the ordering of the elements.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs 
        = new LinkedHashSet<String>(); 
		lhs.add("String");
		lhs.add("int");
		lhs.add("char");
		lhs.add("int");
		lhs.add("big int");
		System.out.println(lhs);
		lhs.remove("char");
		System.out.println(lhs);
	}

}
