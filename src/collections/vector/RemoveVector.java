package collections.vector;

import java.util.Vector;

public class RemoveVector {

	//remove(Object o): This method removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		v.remove(1);
		System.out.println(v);
	}

}
