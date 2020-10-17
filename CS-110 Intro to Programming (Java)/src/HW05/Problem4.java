package HW05;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in);
		
		System.out.println("What word would you like reversed?");
		String word = myInput.nextLine();
		for (int i = word.length()-1; i>=0; i--) // i (index)
		{
			System.out.print(word.charAt(i));
		}
	}
} // prints word backwards using for loop
