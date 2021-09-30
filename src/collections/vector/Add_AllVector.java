package collections.vector;

import java.util.ArrayList;
import java.util.Vector;

public class Add_AllVector {

	//addAll(int index, Collection c) This method inserts all of the elements in the specified Collection into this Vector at the specified.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr=new ArrayList();
		arr.add(3);
		arr.add(87);
		arr.add("CSC");
		arr.add(45);
		arr.add("Java");
		Vector v=new Vector();
		v.add(11);
		v.addAll(1, arr);
		System.out.println(v);
		
	}

}
