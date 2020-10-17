package Lab09_For_Loops2;
// Sum the digits of a 5 digit number
public class C {

	public static void main(String[] args) {
		int n = 5; // n is number of digits
		int num = 32776;
		int nextDigit;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			// Find next digit
			
			nextDigit = num % 10; // gives you the last digit
			
			sum += nextDigit; // adding sum to next digit (updating the sum)
			
			num = (num - nextDigit) / 10; // gets rid of last digit (updates num)

		}
		
		System.out.println(sum);

	}

}
