package HW05;
import java.util.Scanner;
public class JUNK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Initial Conditions;
		boolean palindrone = true;
		String str = "";
		int length;
		
		// Scanner
		Scanner myInput = new Scanner(System.in);
		System.out.println("What word would you like checked?");
		String input = myInput.nextLine().toLowerCase();
		
		//Length
		length = input.length();
		
		for(int i = 0; i<input.length(); i++)
		{
			if (input.charAt(i) != input.charAt(length-1))
			{
				palindrone = false;
				break;
			}
			else
			{
				length--; // decrement the length
			}
				
		}
		
		if (palindrone)
			System.out.println("this is a palindrone");
		else
			System.out.println("This is not a palindrone. ");
		
		
	}

}
