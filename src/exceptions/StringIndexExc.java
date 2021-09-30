package exceptions;

public class StringIndexExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String s="DXC is a good company";
			System.out.println(s.charAt(50));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
