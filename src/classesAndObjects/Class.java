package classesAndObjects;

public class Class {

	public String name;
	public int age;
	public String address;
	public int height;	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public int getHeight() {
		return height;
	}

	public Class(String name, int age, String address, int height) {   //constructor
		this.name=name;
		this.age=age;
		this.address=address;
		this.height=height;
	}
	
	public String display() {
		return("Name of my dog is "+this.getName()+". His age is "+this.getAge()+"years. His address is "+this.address+". His height is "+this.getHeight()+" feet");
		
	}
}
