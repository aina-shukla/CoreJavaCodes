package collections.vector;

import java.util.Vector;

public class EnsureCapacityVector {

	// ensureCapacity(int minCapacity): This method increases the capacity of this
	// vector, if necessary, to ensure that it can hold at least the number of
	// components specified by the minimum capacity argument .
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v =new Vector();
		v.ensureCapacity(23);
		System.out.println(v.capacity());
	}

}
