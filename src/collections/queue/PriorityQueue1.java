package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	// PriorityQueue class which is implemented in the collection framework provides
	// us a way to process the objects based on the priority. It is known that a
	// queue follows First-In-First-Out algorithm, but sometimes the elements of the
	// queue are needed to be processed according to the priority, that’s when the
	// PriorityQueue comes into play. Let’s see how to create a queue object using
	// this class.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q=new PriorityQueue();
		q.add(10);
		q.add(30);
		q.add(45);
		//q.add(15);
		System.out.println(q);
	    System.out.println(q.peek());
	    System.out.println(q.poll());
	    System.out.println(q.peek()); 
	}
	

}
