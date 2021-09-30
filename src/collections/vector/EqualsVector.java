package collections.vector;

import java.util.Vector;

public class EqualsVector {

	//boolean equals(Object o): This method compares the specified Object with this Vector for equality.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		
		Vector v1 = new Vector();
		v1.add(3);
		v1.add(90);
		v1.add("DXC");
		
		System.out.println(v.equals(v1));
	}

}
