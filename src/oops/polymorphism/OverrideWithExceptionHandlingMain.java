package oops.polymorphism;

public class OverrideWithExceptionHandlingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverrideWithExceptionHandlingBase obj=new OverrideWithExceptionHandlingBase();
		obj.m1();
		OverrideWithExceptionHandlingBase obj1=new OverrideWithExceptionHandlingChild();
		obj1.m1();
	}

}
