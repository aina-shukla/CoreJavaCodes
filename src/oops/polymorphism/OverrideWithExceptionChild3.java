package oops.polymorphism;

public class OverrideWithExceptionChild3 extends OverrideWithExceptionBase {
	public void display() throws ArithmeticException  // no issue while throwing subclass exception 
	{
		System.out.println("Child3");
	}

}
