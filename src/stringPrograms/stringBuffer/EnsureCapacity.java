package stringPrograms.stringBuffer;

public class EnsureCapacity {

	public static void main(String[] args) {
//The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity. 

		StringBuffer sb = new StringBuffer();
		System.out.println("default capacity: " + sb.capacity()); // default capacity: 16
		sb.append("Hello");
		System.out.println("current capacity: " + sb.capacity()); // current capacity: 16
		sb.append("java is my favourite language");
		System.out.println("after adding more string, capacity: " + sb.capacity()); // after adding more string,
																					// capacity: 34
		sb.ensureCapacity(14); // capacity not changed here, already it is 34
		System.out.println("capacity not changed here " + sb.capacity()); // capacity not changed here 34
		sb.ensureCapacity(40); //// now (34*2)+2
		System.out.println("new capacity: " + sb.capacity()); // new capacity: 70
	}

}
