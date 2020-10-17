package Exam1Review;
import java.util.Scanner;
public class junk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		System.out.println("Input word 1 please: ");
		String word1 = myInput.nextLine();
		
		System.out.println("Input word 2 please:");
		String word2 = myInput.nextLine();
		
		System.out.printf("The result is: " + word1.substring(0,2) + word2.substring(word2.length()-2), word2.length());
	}

}
