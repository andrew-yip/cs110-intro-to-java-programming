package HW03;
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner (System.in);
		System.out.print("Enter in a 5 letter word:  ");
		String str = myInput.nextLine(); // string input
		
		str = str.toUpperCase(); //string to uppercase
		
		if (str.length()!=5) // if string length not 5 characters
			System.out.println("string must be 5 letters."); 
			
		else {	// if string actually has 5 characters
			if (str.charAt(0)== str.charAt(4) && (str.charAt(1)==str.charAt(3))) // if 0 char = 4 char || if 1 char = 3 char
				System.out.println("string is a palindrome");
			else
				System.out.println("string is not a palindrome. "); // if it doesn't satisfy palindrome
		}
	}

}
