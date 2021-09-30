package oops.polymorphism;

public class OverrideWithExceptionChild1 extends OverrideWithExceptionBase {

	public void display() throws RuntimeException  // no issue while throwing same exception 
	{
		System.out.println("Child1");
	}
}
