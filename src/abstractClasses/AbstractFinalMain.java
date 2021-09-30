package abstractClasses;

public class AbstractFinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstract classes can also have final methods (methods that cannot be overridden). For example, the following program compiles and runs fine.
		AbstractFinalBase obj = new AbstractFinalChild();
		obj.fun();
	}

}
