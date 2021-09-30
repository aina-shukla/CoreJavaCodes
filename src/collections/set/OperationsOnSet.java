package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OperationsOnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> a1= new HashSet();
		Set<Integer> a2 = new HashSet();
		ArrayList<Integer> al1= new ArrayList<Integer>();
		ArrayList<Integer> al2= new ArrayList<Integer>();
		al1.add(12);
		al1.add(20);
		al1.add(10);
		al1.add(25);
		al1.add(30);
		al2.add(12);
		al2.add(35);
		al2.add(20);
		al2.add(40);
		al2.add(30);
		a1.addAll(al1);
		a2.addAll(al2);
		Set<Integer> union = new HashSet<Integer>(a1);
		union.addAll(a2);  //This operation adds all the elements in one set with the other.
		System.out.println("Union "+union);
		Set<Integer> intersection = new HashSet<Integer>(a1);
		intersection.retainAll(a2);
		System.out.println("intersection "+intersection);  //This operation returns all the common elements from the given two sets.
		Set<Integer> difference = new HashSet<Integer>(a1);
		difference.removeAll(a2);
		System.out.println("difference "+difference);  //This operation removes all the values present in one set from the other set.
	}

}
