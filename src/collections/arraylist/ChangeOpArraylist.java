package collections.arraylist;

import java.util.ArrayList;

public class ChangeOpArraylist {

	//After adding the elements, if we wish to change the element, it can be done using the set() method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("Learning");
		al.add("builds");
		al.add("you");
		System.out.print("initial "+al);
		al.set(2, "character");
		System.out.println();
		System.out.print("updated "+al);
	}

}
