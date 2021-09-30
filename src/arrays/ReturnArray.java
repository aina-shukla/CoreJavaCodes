package arrays;

public class ReturnArray {

	public static int[] retArray() {
		return new int[]{1,2,3};
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=retArray();
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
