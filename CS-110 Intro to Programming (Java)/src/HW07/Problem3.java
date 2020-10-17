package HW07;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in);
		System.out.println("What is your word?");
		String input = myInput.nextLine();
		System.out.println(countWords(input) + " words in this string.");
	}
	
	public static int countWords (String str)
	{
		int i = 0;
		int numberWords = 1;
		if (str.equals("")) // if no spaces then numberWords = 0
		{
			numberWords = 0;
		}
		
		while (i<str.length()) //keeps running while i is less than the length of the word
		{
			if (str.substring(i, i+1).equals(" ")) //only counting the spaces
			{
				numberWords++;
			}
		
		i++; // increment i by 1
		
		}
		
		return numberWords; // returns an int
	}

} // counts how many words in input
