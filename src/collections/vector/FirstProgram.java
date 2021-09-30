package collections.vector;

import java.util.Vector;

public class FirstProgram {

	// an ArrayList is that a Vector is synchronized and an ArrayList is
	// non-synchronized.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < 5; i++) {
			v.add(i);
		}
		System.out.print("initital " + v);
		v.remove(4);
		System.out.println();
		System.out.print("updated " + v);
	}

}
