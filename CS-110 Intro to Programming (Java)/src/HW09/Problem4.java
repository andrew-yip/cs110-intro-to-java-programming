package HW09;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i<10; i++) { // prints out 10 times
		System.out.print(constructWord() + " "); // calls constructWord method (constructWord calls for randomCons/vowel)
	}
		
	}
	public static char randomVowel () { // making random vowel // want to return char
		char [] vowels = {'a','e','i','o','u'}; //vowel array
		char vowel1 = vowels[(int) (5*Math.random())]; // access to a random vowel from array 0-5
		return vowel1; // returns a random vowel from the array vowel[]
	}
	
	public static char randomCons () { // making random consonant // want to return char
		char [] consonants = {'b', 'c', 'd','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'}; //cons arr
		char consonant1 = consonants[(int) (21* Math.random())]; // access to a random consonant 0 to 21
		return consonant1; // returns a random consonant from the array consonant[]
	}
	
	public static String constructWord () // want to return a string
	{
		String wordBuild = randomCons()+"" + randomVowel()+"" + randomCons() + ""; // calling for cons and vowels method
		return wordBuild; // returning a string
	}

} // builds a 3 letter word with the first and last a consonant and the middle one  a vowel
