package collections.vector;

import java.util.Vector;

public class TrimToSizeVector {

	//trimToSize(): This method trims the capacity of this vector to be the vector’s current size.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();  //initial capacity 10
		v.add(3);
		v.add(90);
		v.add("DXC");
		System.out.println("Initial capacity "+v.capacity());
		v.trimToSize();
		System.out.println("Trim capacity "+v.capacity());
	}

}
