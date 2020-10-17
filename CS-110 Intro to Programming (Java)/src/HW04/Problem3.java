package HW04;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ROCK = 0;
		final int SCISSORS = 1;
		final int PAPER = 2;
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter your choice: 0 for rock 1 for scissors and 2 for paper: ");
		int myPick = myInput.nextInt();
		System.out.println("My input: " + myPick);
		
		double compPick = (int)(3*Math.random()); // picks a value from 0-2
		
		if (myPick >= 3)
			System.out.println("\nNOT A VALID NUMBER! INPUT VALUE OF 0, 1, OR 2. ");
		else if (myPick < 3)
			System.out.println("Computer input: " + (int)compPick);
		
		if (myPick == compPick) // if you show the same hand
		{
			System.out.println("\nTIE AND RERUN PROGRAM. ");
		}
		
		if (myPick != compPick) // if you don't have the same hand
		{
			System.out.println("\nRock is: 0 ");
			System.out.println("Scissors is: 1 ");
			System.out.println("Paper is: 2 ");
		}
		
		if (compPick == ROCK && myPick == SCISSORS) { // if computer = rock and you = scissors
			System.out.println("\nComputer wins. Rock beats scissors.");
		}
		else if (compPick == SCISSORS && myPick == PAPER) // if computer = scissors and you = paper 
		{
			System.out.println("\nComputer wins. Scissors beats paper.");
		}
		else if (compPick == PAPER && myPick == ROCK) // if computer = paper and you = rock 
		{
			System.out.println("\nComputer wins. Paper beats rock.");
		}
		
		if (myPick == ROCK && compPick == SCISSORS) // if you = rock and computer = scissors
		{
			System.out.println("\nYou win. Rock beats scissors.");
		}
		
		else if (myPick == SCISSORS && compPick == PAPER) // if you = scissors and computer = paper
		{
			System.out.println("\nYou win. Scissors beats paper.");
		}
		
		else if (myPick == PAPER && compPick == ROCK) // if you = paper and computer = rock
		{
			System.out.println("\nYou win. Paper beats rock.");
		}
		
	}

} // this program is playing rock paper scissors
