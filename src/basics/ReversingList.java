package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReversingList {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(89);
		li.add(45);
		li.add(12);
		li.add(67);

		ListIterator<Integer> itr = li.listIterator(li.size()); // reversing list using List Iterator
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
