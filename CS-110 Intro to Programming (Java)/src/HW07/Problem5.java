package HW07;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("What string would you like to check?");
		String input = myInput.nextLine();
		
		if (isPallin(input)) // if palindrone true // returns whatever is from isPallin(str)
			System.out.println("This is a palindrone.");
		
		else // if palindrone false	
			System.out.println("This is not a palindrone.");
	}
	
	public static String removeBlanks(String removeSpaces) { //need string from main //can name whatever we want
		return removeSpaces.replaceAll("\\s+", ""); // need to returns a string without spaces
	}
	
	public static boolean isPallin(String str) // need to return a boolean
	{	
		
		String word = removeBlanks(str); //calling method from above to be remove put into method // need to declare new variable
		boolean palindrone = true; //initially true
		int length = word.length(); //updates str to word
		
		for (int i = 0; i < word.length(); i++) // can use a while loop
		{
			if (word.charAt(i) != word.charAt(length-1)) // what you're checking on the inside
				{
					palindrone = false; // repeating checking over and over again
					break; //stops program
				}
			else // if first char is equal to the last char
			{ // then the char at length will decrement by 1
				length--; // decrementing the length
			}
		} 
		return palindrone; // returns palindrone (if true or false)
	}


} // checks if word is a palindrone
