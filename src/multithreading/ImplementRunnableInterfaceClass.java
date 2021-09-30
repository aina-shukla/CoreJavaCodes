package multithreading;

public class ImplementRunnableInterfaceClass implements Runnable {

	// We create a new class which implements java.lang.Runnable interface and
	// override run() method. Then we instantiate a Thread object and call start()
	// method on this object.

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("class implementing runnable interface");
	}

}
