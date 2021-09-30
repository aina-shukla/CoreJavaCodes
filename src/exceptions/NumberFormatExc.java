package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NumberFormatExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int num = Integer.parseInt("DXC");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

}
