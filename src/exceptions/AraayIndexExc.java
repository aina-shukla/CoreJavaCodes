package exceptions;

public class AraayIndexExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {0,1,2,3};
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
