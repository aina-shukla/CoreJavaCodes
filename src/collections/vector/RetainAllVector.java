package collections.vector;

import java.util.Iterator;
import java.util.Vector;

public class RetainAllVector {

	//retainAll(Collection c): This method retains only the elements in this Vector that are contained in the specified Collection.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vec = new Vector(7); 
        Vector vecretain = new Vector(4); 
  
        // use add() method to add elements in the vector 
        vec.add(1); 
        vec.add(2); 
        vec.add(3); 
        vec.add(4); 
        vec.add(5); 
        vec.add(6); 
        vec.add(7); 
  
        // this elements will be retained 
        vecretain.add(5); 
        vecretain.add(3); 
        vecretain.add(2); 
  
        System.out.println("Calling retainAll()"); 
        vec.retainAll(vecretain); 
  
        // let us print all the elements available in vector 
        System.out.println("Numbers after removal :- "); 
  
        Iterator itr = vec.iterator(); 
  
        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
	}
	}
}
