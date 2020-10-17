package Lab13_Arrays;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] primes = new int [5];
		primes[0] = 2;
		primes[1] = 3;
		primes[2] = 5;
		primes[3] = 7;
		primes[4] = 11;
		
		for (int i = 0; i<2; i++)
		{
			primes [4-i] = primes [i];
		}
		
		primes[4] = 2;
		primes[3] = 3;
	}

}
