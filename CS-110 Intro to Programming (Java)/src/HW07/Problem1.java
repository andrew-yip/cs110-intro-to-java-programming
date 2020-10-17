package HW07;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in);
		System.out.println("What is your word?");
		String input = myInput.nextLine();
		System.out.println(middleChars(input)); // reads method and stores input as input
	}
	
	public static String middleChars (String str) //now input is stored as str // needed string from outside
	{
		int length = str.length(); //initializing length to the length of str
		if (str.length() % 2 == 0)
		{
			return ("Your middle letters is: " + str.substring(str.length()/2 -1, str.length()/2 +1));
		}
		else 
		{
			return ("Your middle letter is: " + str.substring(str.length()/2 , str.length()/2 +  1)); //returns a string because method calls for string
		}
	}
	
} // prints middle 2 if even and middle char is odd length
