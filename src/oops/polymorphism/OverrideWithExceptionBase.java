package oops.polymorphism;

public class OverrideWithExceptionBase {

	//overriding when superclass method does declare an exception
	
	public void display() throws RuntimeException
	{
		System.out.println("Base");
	}
}
