package Lab09_For_Loops2;
import java.util.Scanner;
public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner (System.in);
		int guess; // initialized guess as an int
		int comNum = (int)(Math.random()*5+1); // random number from 0-5
		System.out.println("What is your number?");
		
		for(;;) // forever loop until statement is false
		{
			guess = myInput.nextInt(); // allows you to put input after first input
			if (guess == comNum) // if your guess input is = to the random computer numbers
			{
				System.out.println("Yay!");
				break; // stops program if true
			}
			else
				System.out.println("Nah");
		}
		
	}

}
