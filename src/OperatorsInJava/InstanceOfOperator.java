package OperatorsInJava;

public class InstanceOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person obj1=new Person();
		Person obj2=new Boy();
		
		System.out.println("obj1 instanceOf Person-"+ (obj1 instanceof Person ));
		System.out.println("obj1 instanceOf Boy-"+ (obj1 instanceof Boy));
		System.out.println("obj1 instanceOf MyInterface-"+ (obj1 instanceof MyInterface));
		
		System.out.println("obj2 instanceOf Person-"+ (obj2 instanceof Person ));
		System.out.println("obj2 instanceOf Boy-"+ (obj2 instanceof Boy));
		System.out.println("obj2 instanceOf MyInterface-"+ (obj2 instanceof MyInterface));

	}

}
