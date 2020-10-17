package HW05;
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initial
		int vowels = 0; // initial vowels count
		
		//Scanner
		Scanner myInput = new Scanner(System.in);
		System.out.println("What word would you like input?");
		String word = myInput.nextLine().toLowerCase(); // makes whole word input to lowercase
		
		
		//For Loop
		for (int i = 0; i< word.length(); i++)
		{
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
					word.charAt(i) == 'u') // if char is a,e,i,o,u increase vowel count
				vowels++; // increase count of vowels
		}
		System.out.println("vowels: " + vowels);
	}

} //counts number of vowels in a word
 