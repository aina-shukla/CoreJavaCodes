package arrays;

public class SumOfElements {

	public static void sum(int[] arr) {
		int sum=0;
		for(int i=0; i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,34,1,5,31};
		sum(arr);
	}

}
