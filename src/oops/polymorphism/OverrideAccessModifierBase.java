package oops.polymorphism;

public class OverrideAccessModifierBase {

	private void m1() {   // private methods are not overridden 
		System.out.println("private from base");
	}
	
	protected void m2() {
		System.out.println("protected from base");
	}
	
}
