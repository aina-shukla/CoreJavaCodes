package oops.polymorphism;

public class OverrideStaticMethChild extends OverrideStaticMethBase{

	public static void show()
	{
		System.out.println("static meth from child");
	}

	public void display() {
		System.out.println("non static meth from child");
	}
}
