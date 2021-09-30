package DecisionMaking;

public class JumpBreakAsGoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b = true;

		first: {

			second: {

				third: {
					System.out.println("before break");
					if (b)
						break second;
				}

				System.out.println("won't execute");
			}

		}

		System.out.println("after second");

	}

}
