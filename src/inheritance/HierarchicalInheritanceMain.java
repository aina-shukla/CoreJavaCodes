package inheritance;

public class HierarchicalInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierarchicalInheritanceChild1 obj1 = new HierarchicalInheritanceChild1();
		HierarchicalInheritanceChild2 obj2 = new HierarchicalInheritanceChild2();
		HierarchicalInheritanceChild3 obj3 = new HierarchicalInheritanceChild3();
		obj1.print2();
		obj1.print1();
		obj2.print3();
		obj2.print1();
		obj3.print4();
		obj3.print1();
	}

}
