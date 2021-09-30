package multithreading;

public class ImplementRunnableInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(new ImplementRunnableInterfaceClass());
		t.start();
	}

}
