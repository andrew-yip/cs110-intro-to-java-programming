package HW03;
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in);
		
		System.out.print("Enter in a positive integer: ");
		int input1 = myInput.nextInt(); //input integer
		
		
		
		if (input1%2==0  && input1%3==0) // if BOTH (REASON WHY &&) divisible by 2 and 3 (if the remainder = 0)
		System.out.println("It is divisible by 2 and 3. ");
		
		else if (input1%2==0 || input1%3==0) // If one OR (||) the other but NOT both (only if above is false)
			System.out.println("It is divisible by 2 or 3 but not both. ");
		
		
		
		
		if (input1%2==0 || input1%3==0) // if one of the two remainders == 0
			System.out.println("It is divisible by 2 or 3. ");
		
		else if (input1%2!= 0 || input1%3!=0) // if there is a remainder (if remainder is != 0)
			System.out.println("It is not divisibile by 2 or 3. ");
	}
}
