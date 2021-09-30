package multithreading;

public class ExtendThreadClass {

	// Thread creation by extending the Thread class

    //We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. 
	//A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. 
	//Start() invokes the run() method on the Thread object.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtendThreadClass1 obj = new ExtendThreadClass1();
		obj.start();
	}

}
