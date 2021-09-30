package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemEleQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q=new PriorityQueue();
		q.add("dcdd");
		q.add("psq");
		q.add("ab");
		q.add("z");
		System.out.println(q);
		System.out.println(q.remove());  //remove head
System.out.println(q);
System.out.println(q.poll());  //remove head
System.out.println(q);	}

}
