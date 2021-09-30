package collections.vector;

import java.util.Vector;

public class InsertElementVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// insertElementAt(Object obj, int index): This method inserts the specified object as a component in this vector at the specified index.
		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		v.insertElementAt(56, 3);
		System.out.println(v);
	}

}
