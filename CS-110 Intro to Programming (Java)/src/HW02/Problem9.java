package HW02;
import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("What word would would you like to input?");
		String word = myInput.nextLine();
	
		System.out.print("\n" + word + " ");
		System.out.print(word.substring(0,word.length()-1)); // all chars in string but last char
		System.out.print(word.substring(word.length()-1).toUpperCase()); // last char to uppercase
		
	}

}
// prints out word plus altered word which shows last word to uppercase