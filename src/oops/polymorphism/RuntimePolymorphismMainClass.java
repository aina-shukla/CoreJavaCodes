package oops.polymorphism;

public class RuntimePolymorphismMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method overriding
		
		RuntimePolymorphism obj=new RuntimePolymorphism();
		obj.print();
		
		RuntimePolymorphism obj1=new RunTimePolymorphism1();
		obj1.print();
		
		RuntimePolymorphism obj2 = new RuntimePolymorphism2();
		obj2.print();
		
		RunTimePolymorphism1 ob=new RunTimePolymorphism1();
		ob.print();
	}

}
