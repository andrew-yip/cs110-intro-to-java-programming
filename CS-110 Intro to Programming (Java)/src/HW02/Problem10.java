package HW02;
import java.util.Scanner;
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("What word would you like input? ");
		String wordInput = myInput.nextLine();
		
		System.out.print(wordInput + " ");
		System.out.print(wordInput.substring(0,wordInput.length()/2).toUpperCase()); // half to uppercase
		System.out.print(wordInput.substring(3,6)); // prints char 3-6 
	}

}
// prints original word plus altered half word to uppercase 