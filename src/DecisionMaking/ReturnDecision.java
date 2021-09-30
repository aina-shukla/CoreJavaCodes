package DecisionMaking;

public class ReturnDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=true;
		
		System.out.println("before return");
		
		if(b)
			return;
		// Compiler will bypass every statement  
        // after return 
		
		System.out.println("won't execute");
		
	}

}
