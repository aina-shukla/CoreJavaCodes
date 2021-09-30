package basicPrograms;

public class MyCalculator {

	long power(int n, int p) {
		long sum =  1;

		for (int i = 1; i <= p; i++) {
			sum =  sum * n;
		}

		return sum;
	}

}
