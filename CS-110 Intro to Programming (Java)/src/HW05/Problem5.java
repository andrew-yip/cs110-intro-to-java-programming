package HW05;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initial Conditions
		String temp = ""; // initial string
		int length; // initial length
		boolean palindrone = true;  // palindrone condition initial true
		
		// Scanners
		Scanner myInput = new Scanner(System.in);
		System.out.println("What word would you like checked?");
		String word = myInput.nextLine().toLowerCase(); // makes whole string lowercase
		
		//Calculations (conversions)
		length = word.length(); //updating length (now making the length = to the length of the word) (making as int)
		
		// saying the length of the word is equal to variable length
		
		//Loop
		for (int i = 0; i < word.length(); i++)
		{
			if (word.charAt(i) != word.charAt(length-1)) // what youre checking on the inside
				{
					palindrone = false; // repeating checking over and over again
					break; //stops program
				}
			else // if first char is equal to the last char
			{ // then the char at length will decrement by 1
				length--; // decrementing the length
			}
		}
		
		//Output
		if (palindrone)
			System.out.println("This is a palindrone");
		else
			System.out.println("This is not a palindrone");

	}

} // checks if single word is a palindrone
