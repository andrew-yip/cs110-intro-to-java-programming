package HW03;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter an integer between -1,000,000 and 1,000,000:");
		int input = myInput.nextInt();
	
		if (Math.abs(input)>= 1000000) // if input greater than 1000000
			System.out.println( input + " has 7 digits. ");
		
		else if (Math.abs(input)>=100000) // if first input condition not satisfied (else)
			System.out.println(input + " has 6 digits. ");
		
		else if (Math.abs(input)>=10000) // if previous statement not satisfied 
			System.out.println(input +" has 5 digits. ");
		
		else if (Math.abs(input)>=1000) // if previous statement not satisfied 
			System.out.println(input + " has 4 digits. ");
		
		else if (Math.abs(input)>=100) // if previous statement not satisfied 
			System.out.println( input + " has 3 digits. ");
		
		else if (Math.abs(input)>=10) // if previous statement not satisfied 
			System.out.println(input + " has 2 digits. ");
		
		else if (Math.abs(input)<10) // if previous statement not satisfied 
			System.out.println(input + " has 1 digit. ");
	}

}
