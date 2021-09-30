package collections.linkdedlist;

import java.util.LinkedList;

public class ChangeOpLinkedlist {

	//After adding the elements, if we wish to change the element, it can be done using the set() method.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li = new LinkedList<String>();
		li.add("A");
		li.add("k");
		li.addFirst("f");
		li.addLast("p");
		li.add(2, "l");
			
		System.out.print(li+" ");
		System.out.println();
		li.set(3, "po");
		System.out.println(li+" ");
	}

}
