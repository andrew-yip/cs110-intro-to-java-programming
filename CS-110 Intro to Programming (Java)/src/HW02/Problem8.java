package HW02;
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("What five letter word would you like to input?");
		String word = myInput.nextLine(); 
		
		System.out.println(word);
		//System.out.print(word.charAt(5)); // 6th character
		System.out.print(word.charAt(4)); // 5th 
		System.out.print(word.charAt(3)); // 4th
		System.out.print(word.charAt(2)); // 3rd
		System.out.print(word.charAt(1)); // 2nd
		System.out.print(word.charAt(0)); // 1st
	}

}
// prints out a 5 letter word backwards