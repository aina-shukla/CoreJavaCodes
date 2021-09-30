package collections.vector;

import java.util.Vector;

public class ClearVector {

	//void clear() This method removes all of the elements from this vector.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(0,3);
		v.add(1,90);
		v.add(2,"DXC");
		v.add(3,90);
		System.out.println(v);
		v.clear();
		System.out.println("Checking vector "+v);
	}

}
