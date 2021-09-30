package collections.vector;

import java.util.Vector;

public class RemoveElementVector {

	// removeElement(Object obj): This method removes the first occurrence of the argument from this vector.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC"); 
		v.removeElement(90);
		System.out.println(v);
	}

}
