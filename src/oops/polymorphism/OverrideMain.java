package oops.polymorphism;

public class OverrideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.
		OverrideBase o1= new OverrideBase();
		o1.show();
		OverrideBase o2=new OverrideChild();
		o2.show();
	}

}
