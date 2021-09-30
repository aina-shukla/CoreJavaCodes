package oops.polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading.
		
		//method/function overloading - with different data type
		
		CompileTimePolymorphismClass obj=new CompileTimePolymorphismClass();
		System.out.println(obj.sum(65, 28));
		System.out.println(obj.sum(73.28, 872.78));
		
		//method/function overloading - with different number of arguments
		
		CompileTimePolymrphismClass2 obj2= new CompileTimePolymrphismClass2();
		System.out.println(obj2.product(65, 28));
		System.out.println(obj2.product(63,0,7));
		
		//operator overloading
		
		CompileTimePolymorphism3 obj3=new CompileTimePolymorphism3();
		obj3.opera(4, 9);
		obj3.opera("Like", "Share");
		obj3.opera("45", "32", "8");   //num taken in form of string
	}

}
