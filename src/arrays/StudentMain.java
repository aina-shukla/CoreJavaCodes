package arrays;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student arr[]= new Student[5];
	    arr[0] = new Student(12, "gdndg");
	    arr[1] = new Student(52, "hshf");
	    arr[2] = new Student(76, "kjhkjhfj");
	    arr[3] = new Student(02, "jsdf");
	    arr[4] = new Student(83, "keko");
	    
	    for(int i=0; i<5;i++) {
	    	System.out.println(arr[i].name +" "+arr[i].age);
	    }
		
	}

}
