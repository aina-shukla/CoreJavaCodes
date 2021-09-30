package collections.vector;

import java.util.Vector;

public class RemoveAllVector {

	//removeAllElements(): This method removes all components from this vector and sets its size to zero.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		v.removeAllElements();
		System.out.println("size "+v.size());
		System.out.println("elements "+v);
	}

}
