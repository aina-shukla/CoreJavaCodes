package collections.vector;

import java.util.Vector;

public class ContainsVector {

	//boolean contains(Object o): This method returns true if this vector contains the specified element
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(0,3);
		v.add(1,90);
		v.add(2,"DXC");
		v.add(3,90);
		System.out.println(v.contains("Aina"));
	}

}
