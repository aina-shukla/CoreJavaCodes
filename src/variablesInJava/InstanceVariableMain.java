package variablesInJava;

public class InstanceVariableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariablesFirst obj1=new InstanceVariablesFirst();
		obj1.name="Akash";
		obj1.age=26;
		obj1.number=652895520;
		obj1.gender='M';
		
		InstanceVariablesFirst obj2=new InstanceVariablesFirst();
		obj2.name="Chetan";
		obj2.age=34;
		obj2.number=987244523;
		obj2.gender='M';
		
		//printing values
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.number);
		System.out.println(obj1.gender);
		System.out.println("----------------------");
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		System.out.println(obj2.number);
		System.out.println(obj2.gender);
		
		//In case we have multiple objects as in the above program, each object will have its own copies of instance variables. It is clear from the above output that each object will have its own copy of instance variable.
	}

}
