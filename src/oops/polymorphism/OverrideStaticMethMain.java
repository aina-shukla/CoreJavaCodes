package oops.polymorphism;

public class OverrideStaticMethMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Can we Override static methods in java?
//		We can declare static methods with same signature in subclass, but it is not considered overriding as there won’t be any run-time polymorphism. Hence the answer is ‘No’.
//		If a derived class defines a static method with same signature as a static method in base class, the method in the derived class hides the method in the base class.

		// // As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		OverrideStaticMethBase child = new OverrideStaticMethChild();
		child.show();
		child.display();
	}

}
