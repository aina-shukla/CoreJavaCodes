package stringPrograms;

public class ToStringMethod {

	// If you want to represent any object as a string, toString() method comes into
	// existence.

	String name;
	int age;
	int phNum;

	ToStringMethod(String name, int age, int phNum) {
		this.name = name;
		this.age = age;
		this.phNum = phNum;
	}

	public String toString() {
		return name + " " + age + " " + phNum;
	}

	public static void main(String[] args) {
		// represents string object as string

		ToStringMethod obj1 = new ToStringMethod("abha", 25, 85443453);
		ToStringMethod obj2 = new ToStringMethod("astha", 34, 36786387);

		System.out.println(obj1);
		System.out.println(obj2);

		// If toString() method is not used, then obj1 and obj2 will print the hashcode
		// values of the objects

	}

}