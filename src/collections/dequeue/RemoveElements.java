package collections.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> d = new LinkedList<String>(); 
		d.add("aina");  //tail
		d.addFirst("ms."); //head
		d.addLast("shukla"); //tail
		System.out.println(d);
		System.out.println(d.pop());
		System.out.println(d);
		System.out.println(d.poll());
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
		System.out.println(d);
	}

}
