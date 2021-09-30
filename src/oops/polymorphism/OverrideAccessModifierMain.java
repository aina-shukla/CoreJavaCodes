package oops.polymorphism;

public class OverrideAccessModifierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverrideAccessModifierBase obj1= new OverrideAccessModifierBase();
		obj1.m2();
	//	obj2.m1(); 		//m1() has private access in Parent, so it cannot be called through main

		OverrideAccessModifierBase obj2= new OverrideAccessModifierChild();
		obj2.m2();
	//	obj2.m1();		//m1() has private access in Parent, so it cannot be called through main

	}

}
