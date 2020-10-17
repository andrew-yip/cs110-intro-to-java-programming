package HW07;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in);
		System.out.println("What is your word?");
		String input = myInput.nextLine();
		System.out.println(countVowels(input)); // calling method countVowels then stores input as input
	}
	
	public static int countVowels (String str) //input gets stored as str
	{
		int length = str.length(); //now input is stored as str
		int count = 0; // initialize count to 0
		for (int i = 0; i< str.length(); i++)
		{
			if (str.toUpperCase().charAt(i) == 'A' || str.toUpperCase().charAt(i) == 'E' || str.toUpperCase().charAt(i) == 'I' || 
					str.toUpperCase().charAt(i) == 'O' || str.toUpperCase().charAt(i) == 'U')
					{
						count++; //incriment i
					}
		}
		
		return count; // returns total count // then gets returned to main

	}

} //program counts vowels
