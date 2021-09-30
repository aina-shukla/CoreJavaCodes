package abstractClasses;

public class AbstractConstructorChild extends AbstractConstructorBase {

	AbstractConstructorChild() {
		System.out.println("derived constructor");
	}

	@Override
	void fun() {
		// TODO Auto-generated method stub
		System.out.println("derived fun called");
	}
}
