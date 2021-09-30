package basics;

public class StringProgram {

	public static void main(String[] args) {

		String st = "Sachin";
		st.concat("Singh"); // STrings are immutable
		System.out.println(st); // Sachin

		String str = st.concat("Singh"); // assigned to new variable, value of previous not changed
		System.out.println(str); // SachinSingh

		StringBuffer sbObj = new StringBuffer(st);
		System.out.println(sbObj);
		sbObj.append("Shukla"); // StringBuffer is mutable
		System.out.println(sbObj); // SachinSingh

		StringBuilder sblObj = new StringBuilder(st);
		System.out.println(sblObj);
		sblObj.append("Mishra"); // StringBuilder is mutable
		System.out.println(sblObj); // SachinSingh

	}

}
