package oops.polymorphism;

public class OverrideAccessModifierChild extends OverrideAccessModifierBase {

	//private -> private , protected -> public
	
	// private methods are not overridden 
	
	// new m1() method 
	// unique to Child class 
	private void m1() {
		System.out.println("private from child");
	}
	
	public void m2() {
		System.out.println("public from child");
	}

}
