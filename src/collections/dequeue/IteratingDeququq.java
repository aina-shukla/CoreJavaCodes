package collections.dequeue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratingDeququq {

	// Since a deque can be iterated from both the directions, the iterator method
	// of the deque interface provides us two ways to iterate. One from the first
	// and the other from the back.
	
	public static void main(String[] args) {
		
		Deque<String> d = new LinkedList<String>(); 
		d.add("lisa");
		d.add("bryan");
		d.add("anna");
		Iterator it = d.iterator();
		Iterator it1 = d.descendingIterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		while(it1.hasNext())
			System.out.println(it1.next());
		
		}
}
