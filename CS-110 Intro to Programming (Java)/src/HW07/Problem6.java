package HW07;
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.println("Your first dice has six sides. ");
		System.out.println("But how many sides does your second dice have? ");
		int sides = myInput.nextInt(); // inputting sides on second arbutrary dice
		System.out.println("Your roll of your first dice is " + rollDice() + "."); //calls method first rolldice (no parameters)
		System.out.println("Your roll of 2nd dice is " + rollDice(sides) + "."); // takes input from sides and 
		//stores it into rollDice method
	}
	
	public static int rollDice () // no parameters //rolling dice with six sides
	{
		return rollDice(6); // calling method with 6 stored as side // dice rolled with 6 sides 
	}
	
	//int rollSum = 0; //initialized sum to 0
	//for (int i = 1; i<=2; i++) // want to repeat twice 
	//{
	//	int roll = (int) (Math.random()*6)+1; // dice roll from 1-6
	//	rollSum += roll; //updates roll sum
	//}
	//return rollSum; //returns to main
	public static int rollDice (int side) // rolling dice with any # of sides // takes sides input and stores into side
	{
		int roll = (int) (Math.random()*side)+1; // first roll 
		int roll2 = (int) (Math.random()*side) + 1; // second roll 
		int rollSum = roll +roll2; //summing up two rolls
		return rollSum; // returns sum
	}
	
} // prints outcome and roll of dice
