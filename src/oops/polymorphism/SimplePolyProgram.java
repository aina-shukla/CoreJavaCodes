package oops.polymorphism;

public class SimplePolyProgram {

	public int meth(int x, int y) {
		int sum = x + y;
		return sum;
	}

	// or can be written as
//	public int meth(int x, int y) {
//		return (x+y);
//	}

	public int meth(int x, int y, int z) {
		int sum = x + y + z;
		return sum;
	}

	public double meth(double x, double y) {
		double sum = x + y;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimplePolyProgram obj = new SimplePolyProgram();
		System.out.println(obj.meth(45, 71));
		System.out.println(obj.meth(73, 9, 28));
		System.out.println(obj.meth(767.9898, 6562.8787));

	}

}
