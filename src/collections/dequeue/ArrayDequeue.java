package collections.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {

	// ArrayDeque class which is implemented in the collection framework provides us
	// with a way to apply resizable-array. This is a special kind of array that
	// grows and allows users to add or remove an element from both sides of the
	// queue.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> d = new ArrayDeque<Integer>(10); 
		d.add(76);
		d.add(90);
		d.add(23);
		d.add(56);
		System.out.println(d);
		d.clear();
		d.addFirst(10);
		d.addFirst(20);
		d.addLast(15);
		d.addLast(25);
		System.out.println(d);
	}

}
