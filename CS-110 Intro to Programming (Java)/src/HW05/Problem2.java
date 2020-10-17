package HW05;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("How many numbers in yours set? ");
		int numbers = myInput.nextInt();
		
		System.out.println("Enter a set of floating-point values: "); //assuming 4 inputs
		
		double value; // declaring value as a double
		double max = 0; //doesn't really matter
		double min = 0; // doesn't matter
		double sum = 0; // doesn't matter
		
		for (int i = 0; i < numbers; i++) {
			value = myInput.nextDouble();
			sum += value;
			
			if (i==0) // If in first time around (first iteration) 
			{
				max = value; // Initialize max to first value
				min = value; // intialize min to first value
			}
			
			else if (value > max) // Checking if the number I just typed is the new maximum
				max = value; // If it is... then I want to update the maximum, and make it equal to the number I just typed in
			
			else if (value < min)
				min = value;
			
			System.out.println("max = " + max);
			System.out.println("min = " + min);
			
		}
		System.out.println("Final max: " + max);
		System.out.println("Final min: " + min);

		double average = sum/numbers; // taking updated sum and dividing it by the numbers inputted
		double range = max - min; // taking updated max and updated min and finding the range between the two 
		
		System.out.println("average: " + average);
		System.out.println("range: " + range);
		
		
	}

}// prints min, max, averge, and range
