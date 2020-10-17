package Lab10_NestedForLoops_WhileLoops;
import java.util.Scanner;
public class JUNK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String winner = "Joe";
		String guess = "";
		
		Scanner in = new Scanner(System.in);
				
		boolean correct = false; // initially false
		
		while (!correct)
		{
			System.out.println("Who is your guess for the winner? ");
			guess = in.nextLine(); // who is the next name as a string
			
			if (winner.equals(guess))
			{
				correct = true;
				System.out.println("You got it!");
			}
			
			else
			{
				System.out.println("Try again. ");
			}
		}
	}

}
