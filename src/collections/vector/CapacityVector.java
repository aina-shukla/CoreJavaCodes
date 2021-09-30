package collections.vector;

import java.util.Vector;

public class CapacityVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int capacity(): This method returns the current capacity of this vector.
		
			Vector v = new Vector(3);
			v.add(3);
			v.add(90);
			v.add("DXC");
			System.out.println(v.capacity());
	}

}
