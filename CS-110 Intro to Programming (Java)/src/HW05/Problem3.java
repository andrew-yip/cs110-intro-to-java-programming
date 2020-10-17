package HW05;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("What word would you like to input? ");
		String word = myInput.nextLine().toLowerCase(); // makes whole input to lowercase
		
		for (int i = 0; i<word.length(); i++)
		{
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
				word.charAt(i) == 'u') // if the char at (i) is a vowel, then print i and i+1
					System.out.print(word.substring(i,i+1));
			else
				System.out.println(word.charAt(i)); // if not vowel, prints out consonant on next line
	}
		
	}
} // prints char on same line if vowel; if consonant then prints on next line
