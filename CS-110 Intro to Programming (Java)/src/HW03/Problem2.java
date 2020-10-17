package HW03;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Please type in your double value. ");
		double input = myInput.nextDouble();
		
		if (input > 0) // if the input # is greater than 0 it will print "positive"
			System.out.print("number is positive");
		
		else if (input < 0) // if input # negative print "negative"
			System.out.print("number is negative"); 
		
		else if (input == 0) // if input == 0 prints "zero"
			System.out.print("number is equal to 0." );
		
		if (Math.abs(input) >= 1000000) // determines if input is large
			System.out.print(" and the number is large");
		
		if (Math.abs(input) <= 1) // if input is small 
			System.out.print(" and the number is small");
		
	}

}
