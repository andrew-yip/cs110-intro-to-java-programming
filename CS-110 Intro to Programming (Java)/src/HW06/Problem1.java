package HW06;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Welcome to the Arithmetic Quiz
		
		Scanner myInput = new Scanner(System.in);
		
		int int1 = (int) ((100) * Math.random()); // value from 0-99
		int int2 = (int) ((100) * Math.random()); // value from 0-99
		boolean correct = false; // initially false
		int guess; // declaring int as a variable
		int i = 0; // initial count
		int sum = int1 + int2; // sum is the first plus second int
		
		System.out.println("What does " + int1 +  "+" + int2 + " = ? ");
		
		while (! correct) // keeps on running when inside (incorrect) is true
		{
			guess = myInput.nextInt(); //reads guess input
			
			if (guess == sum)
			{
				System.out.println("This is correct.");
				correct = true; // updating boolean to true; (so this updating statement stops the while loop)
			}
			else
			{
				System.out.println("This is incorrect. "); // if the guess is not equal the actual sum
			}
			
			i++; // counts how many times it takes to guess // how many times it goes through while loop
		}
		
		System.out.println("You took " + i + " tries. ");
		
		
	}
	
}

 // checks arithmetic sums
