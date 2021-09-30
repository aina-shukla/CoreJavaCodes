package collections.vector;

import java.util.Vector;

public class FirstElementVector {

	//Object firstElement(): This method returns the first component (the item at index 0) of this vector.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		System.out.println(v.firstElement());
	}

}
