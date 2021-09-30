package stringPrograms.stringBuffer;

public class CapacityMethod {

	public static void main(String[] args) {
//The capacity() method of StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16.

		StringBuffer sb = new StringBuffer();
		System.out.println("default capacity: " + sb.capacity()); // default capacity: 16
		sb.append("Hello");
		System.out.println("current capacity: " + sb.capacity()); // current capacity: 16
		sb.append("java is my favourite language");
		System.out.println("after adding more string, capacity: " + sb.capacity()); // after adding more string,
																					// capacity: 34

	}

}
