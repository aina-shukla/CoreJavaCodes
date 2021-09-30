package collections.vector;

import java.util.Vector;

public class CopyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//void copyInto(Object[ ] anArray):This method copies the components of this vector into the specified array.
		
		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add(67);
		Integer arr[] = new Integer[3];
		v.copyInto(arr);
		for(Integer num:arr) {
			System.out.println(num);
		}
	}
}
