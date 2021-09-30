package oops.polymorphism;

public class OverloadMethInReturnType {
//	Can we overload methods on return type?
//	We cannot overload by return type. This behavior is same in C++. Refer this for details

//			    public int foo() { return 10; } 
//			  
//			    // compiler error: foo() is already defined 
//			    public char foo() { return 'a'; } 
	
	
	
//However, Overloading methods on return type are possible in cases where the data type of the function being called is explicitly specified. Look at the examples below :
	
//	public static int foo(int a) { return 10; } 
//    public static char foo(int a, int b) { return 'a'; } 

	
	
	
 // Java program to demonstrate working of method 
 // overloading in  methods 

     public int foo(int a) { return 10; } 
   
     public char foo(int a, int b) { return 'a'; } 
 
    
			    public static void main(String args[]) 
			    { 
//			    	System.out.println(foo(1)); 
//			        System.out.println(foo(1, 2)); 
			    	
			        OverloadMethInReturnType a = new OverloadMethInReturnType(); 
			         System.out.println(a.foo(1)); 
			         System.out.println(a.foo(1, 2)); 
			    } 
			} 

