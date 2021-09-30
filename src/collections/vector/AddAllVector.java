package collections.vector;

import java.util.ArrayList;
import java.util.Vector;

public class AddAllVector {
//	addAll(Collection c) This method appends all of the elements
//	in the specified Collection to the end of this Vector.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr=new ArrayList();
		arr.add(3);
		arr.add(87);
		arr.add("CSC");
		arr.add(45);
		arr.add("Java");
		Vector v = new Vector(arr);
		System.out.println(v);
		//OR
		Vector v1=new Vector();
		v1.addAll(arr);
		System.out.println("using addAll meth "+v1);
		
		
		
		}

}
