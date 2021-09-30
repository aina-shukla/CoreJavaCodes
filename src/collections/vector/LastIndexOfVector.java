package collections.vector;

import java.util.Vector;

public class LastIndexOfVector {

	// lastIndexOf(Object o): This method returns the index of the last occurrence
	// of the specified element in this vector, or -1 if this vector does not
	// contain the element.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(0,3);
		v.add(1,90);
		v.add(2,"DXC");
		v.add(3,90);
		System.out.println(v.lastIndexOf(12));  //returns index
	}

}
