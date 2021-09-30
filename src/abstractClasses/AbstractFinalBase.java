package abstractClasses;

public abstract class AbstractFinalBase {

	// Abstract classes can also have final methods (methods that cannot be overridden). For example, the following program compiles and runs fine.
	final void fun() {
		System.out.println("base");
	}
}
