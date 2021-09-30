package collections.linkdedlist;

import java.util.LinkedList;

public class SecProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LinkedList<String> li = new LinkedList<String>();
	li.add("A");
	li.add("k");
	li.addFirst("f");
	li.addLast("p");
	li.add(2, "l");
		
	System.out.print(li+" ");
	System.out.println();
	li.remove("k");
	li.remove(2);
	li.removeFirst();
	li.removeLast();
	System.out.println(li);
	
	System.out.println("empty list "+li.removeAll(li));
	
	}

}
