package HW04;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner (System.in);
		System.out.println("You - the mere mortal will be evensies. How many fingers do you wish to play?");
		int fingers = myInput.nextInt();
		
		System.out.println("one, two three   SHOOT!");
		
		double compPick = (int)(2*Math.random() + 1); // math.random goes from 0-.99 
		//then multiply by 2 to get 1.99 then adds one to get 2.99 but the int truncakes the decimal
		int myChoice = (fingers*1);
		int sum = (int)(compPick + myChoice);
		
		if (sum % 2 ==1) // if sum is odd number
		{
			System.out.println("The sum is ODD. "); 
		}
		else // if it is not an odd number; if it is an even
			System.out.println("The sum is EVEN.");
	
		if (fingers < 3) { //if finger input is less than 3
			System.out.println("Computer plays " + (int)compPick); // if fingers input less than 3 than itll print these
			System.out.println("Human plays " + (int)myChoice); //
			
			if (sum % 2 == 1) // assuming computer is odd sum (hardcoded in)
				System.out.println("The computer is the winner!");
			
			else // assuming you are even sum (hardcoded in)
				System.out.println("YOU ARE THE WINNER!");
			
		}
		
		else // if it is greater than 3 than it will say humans are cheaters
			System.out.println("Game over - Humans cheat!!!!" + " " + fingers +  " is not a legal number of fingers.");
	}

}// this program plays the game choosies
