package collections.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> d = new LinkedList<String>(); 
		d.add("aina");  //tail
		d.addFirst("ms."); //head
		d.addLast("shukla"); //tail
		d.push("dxc"); //head
		d.offer("csc"); //tail
		d.offerLast("tech"); //head
		System.out.println(d);
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
	}

}
