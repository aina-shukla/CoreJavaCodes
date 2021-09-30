package collections.stack;

import java.util.Stack;

public class AccessElementsInStack {

	// Accessing the Element: To retrieve or fetch the first element of the Stack or
	// the element present at the top of the Stack, we can use peek() method. The
	// element retrieved does not get deleted or removed from the Stack.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack sta=new Stack();
		sta.push(45);
		sta.push("l");
		sta.push(87);
		sta.push("dxc");
		sta.push("csc");
		System.out.println(sta);
		System.out.println("top element "+sta.peek());  //peek for displaying top element in stack
	}

}
