package collections.vector;

import java.util.Vector;

public class IsEmptyVector {

	//boolean isEmpty(): This method tests if this vector has no components.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(0,3);
		v.add(1,90);
		v.add(2,"DXC");
		v.add(3,90);
		System.out.println(v);
		v.clear();
		System.out.println("Check vector is empty - "+v.isEmpty());
	}

}
