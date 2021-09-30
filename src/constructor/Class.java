package constructor;

public class Class {

	Class(String name){
		System.out.println("Name is "+name);
	}
	
	Class(int age){
		System.out.println("Age is "+age);
	}
	
	Class(String surname, int address){
		System.out.println("Fullname is "+ surname+" and Address is "+ address);
	}
}
