package abstractClasses;

public class AbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Like C++, in Java, an instance of an abstract class cannot be created, we can have references of abstract class type though.

		// Uncommenting the following line will cause compiler error as the  
        // line tries to create an instance of abstract class. 
        // AbstractClassBase b = new AbstractClassBase(); 
		
		AbstractClassBase obj = new AbstractClassChild();
		obj.show();
	}

}
