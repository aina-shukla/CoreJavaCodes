package collections.vector;

import java.util.Vector;

public class GetVector {

	//Object get(int index):This method returns the element at the specified position in this Vector.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(0,3);
		v.add(1,90);
		v.add(2,"DXC");
		v.add(3,90);
		System.out.println(v.get(3));  //returns element at 3
	}

}
