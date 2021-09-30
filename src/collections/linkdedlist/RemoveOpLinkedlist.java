package collections.linkdedlist;

import java.util.LinkedList;

public class RemoveOpLinkedlist {

	// In order to remove an element from a LinkedList, we can use the remove()
	// method.

	// remove(Object): This method is used to simply remove an object from the
	// LinkedList. If there are multiple such objects, then the first occurrence of
	// the object is removed.

	// remove(int index): Since a LinkedList is indexed, this method takes an
	// integer value which simply removes the element present at that specific index
	// in the LinkedList. After removing the element, all the elements are moved to
	// the left to fill the space and the indices of the objects are updated.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li = new LinkedList<String>();
		li.add("A");
		li.add("k");
		li.addFirst("f");
		li.addLast("p");
		li.add(2, "l");
			
		System.out.print("initial "+li+" ");
		System.out.println();
		
		li.remove();
		System.out.println(li);
		
		li.remove(2);
		System.out.println(li);
		
		li.remove("p");
		System.out.println(li);
	}

}
