package encapsulation;

public class EncapsulationClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationClass object = new EncapsulationClass();
		object.setName("Alex");
		object.setAge(14);
		object.setRollnum(7);
		object.setStd("9 A");
		System.out.println("Name is " + object.getName());
		System.out.println("Age is " + object.getAge());
		System.out.println("Rollnum is " + object.getRollnum());
		System.out.println("Standard is " + object.getStd());
	}

}
