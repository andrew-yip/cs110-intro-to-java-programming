package Lab08_For_Loops;
import java.util.Scanner;

public class ForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =0; i<5; i++) // understand
		{
			System.out.println("i = " + i);
		}
		
		
		int sum = 1; // understand kinda
		for (int i =0; i< 5; i++)
		{
			sum += i;
		}
		System.out.println("sum = " + sum); // (0) + 0+1+2+3+4 = 10
		
		
		int sum2 = 0;
		for(int i = 0; i <10; i+=2)
		{
			sum2 +=i;
		}
		System.out.println("sum = " + sum2);
		
		
		
		String word = "awesome";
		for (int i = 0; i < word.length(); i++)
		{
			System.out.println(word.charAt(i));
		}
		
		
		String word2 = "awesome";
		for(int i = word2.length()-1; i >=0; i--)
		{
			System.out.println(word.charAt(i));
		}
		
		
		String word3 = "awesome";
		int pick ;
		for (int i = 0; i<20; i++)
		{
			pick = (int)(Math.random()*word.length());
			System.out.println(word.charAt(pick));
		}
		
		// Guess the winner
			String winner = "Joe";
			String guess = "";
			Scanner in = new Scanner(System.in);
		
			for (;;)
			{
				System.out.println("Who is your guess for the winner?");
				guess = in.next();
				if(winner.contentEquals(guess))
				{
					System.out.println("Correct");
					break;
				}
				else
					System.out.println("Try again. ");
			}
		
			
			// using a char to count
				for (char c = 'a'; c<= 'z'; c++)
					System.out.println(c);
		
	}

}
