package variablesInJava;

public class LocalVariables {

	public void fun1() {
		int age=0;
		age=age+1;
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariables oj=new LocalVariables();
		oj.fun1();
		
	//	System.out.println(age);    //gives error when used outside scope
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		age cannot be resolved to a variable
//
//		at variablesInJava.LocalVariables.main(LocalVariables.java:18)

		
	}

}
