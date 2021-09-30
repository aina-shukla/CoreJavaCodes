package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {

		List<Integer> li = new LinkedList<Integer>();
		li.add(12);
		li.add(13);
		li.add(90);
		li.add(67);

		Iterator<Integer> itr = ((LinkedList<Integer>) li).descendingIterator(); // reversing list using Iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
