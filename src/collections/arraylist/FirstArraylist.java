package collections.arraylist;

import java.util.ArrayList;

public class FirstArraylist {

/*List <T> al = new ArrayList<> ();
List <T> ll = new LinkedList<> ();
List <T> v = new Vector<> ();
Where T is the type of the object
*/
	
	//ArrayList provides us with dynamic arrays in Java.
	
	//The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1; i<=5;i++) {
			al.add(i);
		}
		System.out.println("Initial array "+al);
		al.remove(3);  //remove at index 3
		System.out.println("Array when element is removed "+al);
		System.out.println("printing array one by one");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
