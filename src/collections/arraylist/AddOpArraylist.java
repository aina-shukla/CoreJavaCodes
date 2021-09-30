package collections.arraylist;

import java.util.ArrayList;

public class AddOpArraylist {

	//add(Object): This method is used to add an element at the end of the ArrayList.
	//add(int index, Object): This method is used to add an element at a specific index in the ArrayList.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(87);
		al.add(90);
		al.add(2, 65);
		al.add(3);
		System.out.println(al);
		
	}

}
