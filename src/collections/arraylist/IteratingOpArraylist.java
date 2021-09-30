package collections.arraylist;

import java.util.ArrayList;

public class IteratingOpArraylist {

	// There are multiple ways to iterate through the ArrayList. The most famous
	// ways are by using the basic for loop in combination with a get() method to
	// get the element at a specific index and the advanced for loop.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("Stay");
		al.add("happy");
		al.add("always");
		System.out.println("initial "+al);
		for(int i=0; i<al.size();i++) {  //for loop
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
	    for (String st:al) {  //enhanced for
	    	System.out.print(st+" ");
	    }
	}

}
