package collections.stack;

import java.util.Iterator;
import java.util.Stack;

public class RemovingElements {

	// Removing Elements: To pop an element from the stack, we can use the pop()
	// method. The element is popped from the top of the stack and is removed from
	// the same.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st=new Stack<>();
		st.push("DXC");
		st.push("a");
		st.push("k");
		st.push("p");
		st.push("u");
		System.out.println("initial "+st);
		st.pop();  //top element removed by pop
		System.out.println();
		System.out.println("updated "+st);
	}

}
