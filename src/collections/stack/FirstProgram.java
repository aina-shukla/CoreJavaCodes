package collections.stack;

import java.util.Iterator;
import java.util.Stack;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st=new Stack<>();
		st.push("DXC");
		st.push("a");
		st.push("k");
		st.push("p");
		st.push("u");
		Iterator<String> itr= st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		st.pop();  //top element removed by pop
		itr = st.iterator();
		System.out.println();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
	}

}
