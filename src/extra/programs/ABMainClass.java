package extra.programs;

public class ABMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AClass aobj = new AClass();
		aobj.m1();
		// aobj.m2(); //compile time error
		AClass bobj = new BClass();
		bobj.m1();
		//bobj.m2(); // compile time error

		// BClass b = new AClass(); //compile time error
	}

}
