package collections;

import java.util.Hashtable;
import java.util.Vector;

public class VectorHashTableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {1,2,3};
		Vector<Integer> v= new Vector(); 
		Hashtable<Integer, String> h = new Hashtable();   //key, value
		
		v.addElement(1);
		v.addElement(2);
		
		h.put(0, "DXC");
		h.put(1, "CSC");
		
		System.out.println(arr[2]);
		System.out.println(v.elementAt(1));
		System.out.println(h.get(1));
		
	}

}
