package collections.vector;

import java.util.Vector;

public class SetSizeVector {

	//setSize(int newSize): This method sets the size.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(3);
		v.add(90);
		v.add("DXC");
		System.out.println("initial size "+v.size());
		v.setSize(20);
		System.out.println("new size "+v.size());
	}

}
