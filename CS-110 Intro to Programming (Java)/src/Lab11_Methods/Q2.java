package Lab11_Methods;
public class Q2
{

	public static void main(String[] args) //MAIIIINNNNNN
	{
		for (int i = 1; i <= 100; i++) // printing character out 100 times
			System.out.println(randomWord()); // calling randomWord method
	}

	public static char randomChar()
	{
		char c = (char) ((int) (26 * Math.random()) + 97); // ohhh numbers from 97-123 // 97 is unicode for lowercase a
		// returns char at that random number 
		return c; //returns a random character based on the unicode
	}

	public static String randomWord() //constructing random string based on random character
	{
		String word = "";
		//word = word + randomChar() + randomChar() + randomChar();
		//return word;
		
		for (int i = 0; i<3; i++) //same as above // how many times you want the word to be repeated // repeat three times
		{
			word+=randomChar(); // random char was from method above // need to updated word somehow
		}
		
		return word; // word gets returned to main
		
	}
}


