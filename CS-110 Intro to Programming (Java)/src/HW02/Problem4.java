package HW02;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in); // scanner new input
		
		System.out.println("What 5-digit integer would you like printed out? ");
		int integer = myInput.nextInt(); // new integer input

		System.out.println((integer/10000)%10); // 1st value
		System.out.println((integer/1000)%10); // 2nd value 
		System.out.println((integer/100)%10); // 3rd value 
		System.out.println((integer/10)%10);  // 4th value 
		System.out.println(integer%10); // 5th value
	}

}
// prints out a 5 digit integer one digit at a time from the first to last