package collections.vector;

import java.util.Vector;

public class CloneVector {

	//Object clone() This method returns a clone of this vector.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		v.add(0,3);
		v.add(1,90);
		v.add(2,"DXC");
		v.add(3,90);
		Vector vclone= new Vector();
		vclone = (Vector)v.clone();
		System.out.println(vclone);

	}

}
