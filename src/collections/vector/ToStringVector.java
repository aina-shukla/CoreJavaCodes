package collections.vector;

import java.util.Vector;

public class ToStringVector {

	//toString(): The toString() method is used to return a string representation of this Vector, containing the String representation of each element.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		System.out.println(v);
		System.out.println("String vector "+v.toString());
	}

}
