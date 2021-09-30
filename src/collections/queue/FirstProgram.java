package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q= new LinkedList();
		for(int i=0; i <5;i++)
			q.add(i);
		System.out.println("initial "+q);
		System.out.println("head removed "+q.remove());
		System.out.println("updated "+q);
		System.out.println("new head "+q.peek());
		System.out.println("size of queue "+q.size());
	}

}
