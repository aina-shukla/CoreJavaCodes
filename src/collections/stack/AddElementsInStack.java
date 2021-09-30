package collections.stack;

import java.util.Stack;

public class AddElementsInStack {

	// Adding Elements: In order to add an element to the stack, we can use the
	// push() method. This push() operation place the element at the top of the
	// stack.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st=new Stack<>();
		st.push("DXC");
		st.push("a");
		st.push("k");
		Stack sta=new Stack();
		sta.push(26);
		sta.push("u");  //push for add element
		System.out.println(st);
		System.out.println(sta);
	}

}
