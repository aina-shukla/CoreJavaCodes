package collections.linkdedlist;

import java.util.LinkedList;

public class IterateOpLinkedlist {

	// There are multiple ways to iterate through the LinkedList. The most famous
	// ways are by using the basic for loop in combination with a get() method to
	// get the element at a specific index and the advanced for loop.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li = new LinkedList<String>();
		li.add("A");
		li.add("k");
		li.addFirst("f");
		li.addLast("p");
		li.add(2, "l");
		
		for (int i=0; i<5;i++) {
			System.out.print(li.get(i)+" ");
		}
		System.out.println();
		for(String st:li) {
			System.out.print(st+" ");
		}
	}

}
