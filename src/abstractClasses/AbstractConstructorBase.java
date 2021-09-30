package abstractClasses;

public abstract class AbstractConstructorBase {

	// Like C++, an abstract class can contain constructors in Java. And a
	// constructor of abstract class is called when an instance of a inherited class
	// is created. For example, the following is a valid Java program

	AbstractConstructorBase() {
		System.out.println("base constructor");
	}

	abstract void fun();
}
