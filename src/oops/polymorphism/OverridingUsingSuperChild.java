package oops.polymorphism;

public class OverridingUsingSuperChild extends OverridingUsingSuperBase {

	//overridden method can be called from sub-class 
	
	public void display() {
		super.display();
		System.out.println("Child");
	}
}
