package exceptions;

public class UsingThrow {

	// The throw keyword in Java is used to explicitly throw an exception from a
	// method or any block of code. We can throw either checked or unchecked
	// exception. The throw keyword is mainly used to throw custom exceptions.

	 static void fun() 
	    { 
	        try
	        { 
	            throw new NullPointerException("demo"); 
	        } 
	        catch(NullPointerException e) 
	        { 
	            System.out.println("Caught inside fun()."); 
	            throw e; // rethrowing the exception 
	        } 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            fun(); 
	        } 
	        catch(NullPointerException e) 
	        { 
	            System.out.println("Caught in main."); 
	        } 
	    } 

}
