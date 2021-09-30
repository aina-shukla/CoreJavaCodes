package collections.linkdedlist;

import java.util.LinkedList;

public class FirstProgram {

	// The elements are linked using pointers and addresses. Each element is known
	// as a node.

	// It also has few disadvantages like the nodes cannot be accessed directly
	// instead we need to start from the head and follow through the link to reach
	// to a node we wish to access.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> li = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			li.add(i);
		}
		System.out.println(li);
		for (int i = 0; i < 5; i++) {
			System.out.print(li.get(i) + " ");
		}
		
		

	}

}
