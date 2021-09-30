package abstractClasses;

public class AbstractMethMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In Java, we can have an abstract class without any abstract method. This
		// allows us to create classes that cannot be instantiated, but can only be
		// inherited.

		AbstractMethChild obj = new AbstractMethChild();
		obj.fun();
	}

}
