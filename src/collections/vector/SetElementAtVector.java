package collections.vector;

import java.util.Vector;

public class SetElementAtVector {

	//setElementAt(Object obj, int index): This method sets the component at the specified index of this vector to be the specified object.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		System.out.println(v);
		v.setElementAt(76, 2);
		System.out.println("changed vector "+v);}

}
