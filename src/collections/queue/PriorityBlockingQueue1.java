package collections.queue;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue1 {

	// It is to be noted that both the implementations, the PriorityQueue and
	// LinkedList are not thread-safe. PriorityBlockingQueue is one alternative
	// implementation if thread-safe implementation is needed. PriorityBlockingQueue
	// is an unbounded blocking queue that uses the same ordering rules as class
	// PriorityQueue and supplies blocking retrieval operations.

//Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> pbq = new PriorityBlockingQueue<Integer>(); 
		pbq.add(5);
		pbq.add(25);
		pbq.add(15);
		System.out.println(pbq);
		System.out.println(pbq.peek());
		System.out.println(pbq.poll());
		System.out.println(pbq.peek());
	}

}
