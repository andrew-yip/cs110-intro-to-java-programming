package HW06;
import java.util.Scanner;

public class Problem9Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the word you want to encode in all CAPS:"); // 
        String word = myInput.nextLine().toUpperCase(); // reading an input and making it all uppercase
        System.out.println("Enter an integer of how many letters you want to shift!");
        int encodeShift = myInput.nextInt(); //HOW MANY WANT TO MOVE (integer)
        System.out.println("Your word encoded is : "+ encryption(word, encodeShift)); //calling for  method // want to return str
	}
	
	public static String encryption(String word, int encodeShift) // method that is being called // want to return string
    {
           String encoded = ""; // inital encode to update later // empty string
           int encodedChar = ' '; //how many you want to shift // initially an int but converts to char after (unicode of char)
           int length1 = word.length(); // takes in the length of 
          
           for (int i = 0; i<length1; i++) //starts at index 0 of word and ends at index one less than length
           {
              encodedChar = ((word.charAt(i) + encodeShift));// updates (casting) changing one data type to another
                 encoded += (char)encodedChar;     // encoded = (char)encodedChar(referring to unicode at number) + encoded              
           }
           return encoded; // what we want to return into the method // outside of for because only want one return

}
	
	
} //encodes message by shifting character 