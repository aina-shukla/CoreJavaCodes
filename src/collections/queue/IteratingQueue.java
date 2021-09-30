package collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class IteratingQueue {

	// Iterating the Queue: There are multiple ways to iterate through the Queue.
	// The most famous way is converting the queue to the array and traversing using
	// the for loop. However, the queue also has an inbuilt iterator which can be
	// used to iterate through the queue.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q=new PriorityQueue();
		q.add("dcdd");
		q.add("psq");
		q.add("ab");
		q.add("z");
	Iterator itr =q.iterator();
while(itr.hasNext())
	System.out.println(itr.next()+" ");
	}

}
