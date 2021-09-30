package oops.polymorphism;

public class OverrideWithExceptionHandlingChild extends OverrideWithExceptionHandlingBase {

	public void m1() throws ArithmeticException{  // no issue while throwing unchecked exception 
		System.out.println("m1 child");
	}
	
//	public void m2() throws Exception {     //compile-time error,issue while throwin checked exception 
//		System.out.println("m2 child");
//	}
}
