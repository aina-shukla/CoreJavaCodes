package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class AddEleInQueue {

	// Adding Elements: In order to add an element in a queue, we can use the add()
	// method. The insertion order is not retained in the PriorityQueue. The
	// elements are stored based on the priority order which is ascending by
	// default.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q=new PriorityQueue();
		q.add("dcdd");
		q.add("psq");
		q.add("ab");
		q.add("z");
		System.out.println(q);
		
		Queue<Integer> q1=new PriorityQueue();
		q1.add(1);
		q1.add(9);
		q1.add(6);
		q1.add(87);
		System.out.println(q1);
	}

}
