package collections.arraylist;

import java.util.ArrayList;

public class RemoveOpArraylist {

	// In order to remove an element from an ArrayList, we can use the remove()
	// method.

	// remove(Object): This method is used to simply remove an object from the
	// ArrayList. If there are multiple such objects, then the first occurrence of
	// the object is removed.
	
	// remove(int index): Since an ArrayList is indexed, this method takes an
	// integer value which simply removes the element present at that specific index
	// in the ArrayList. After removing the element, all the elements are moved to
	// the left to fill the space and the indices of the objects are updated.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("Stay");
		al.add("happy ");
		al.add("always");
		al.add("happy");
		System.out.println("initial "+al);
		al.remove(1);
		System.out.println("index removal "+al);
		al.remove("happy");
		System.out.println("object removal "+al);
	}

}
