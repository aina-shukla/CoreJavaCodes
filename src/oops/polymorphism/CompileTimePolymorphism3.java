package oops.polymorphism;

public class CompileTimePolymorphism3 {

	//operator overloading
	
	//In java, Only “+” operator can be overloaded:
    //To add integers
    //To concatenate strings
	
	//overloading in java
	
	public void opera(String a, String b) {
		 
		String concat= a+b;
		System.out.println(concat);
	}
	
	public void opera(int a, int b) {
		 
		int concat= a+b;
		System.out.println(concat);
	}
	
	public void opera(String x, String y, String z) {
		 
		String concat= x+y+z;
		System.out.println(concat);
	}
}
