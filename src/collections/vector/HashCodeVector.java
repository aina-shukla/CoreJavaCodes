
package collections.vector;

import java.util.Vector;

public class HashCodeVector {

	//int hashCode(): This method returns the hash code value for this Vector.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		System.out.println(v.hashCode());
	}

}
