package HW02;
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("What phone number would you like to input? ");
		String phoneNumber = myInput.nextLine();
		
		String area = phoneNumber.substring(0,3); // string from 0 to 3
	    String first = phoneNumber.substring(3,6); // string from 3 to 6
	    String second = phoneNumber.substring(6); // last character in string
	    System.out.print("(" + phoneNumber.substring(0,3) + ")");
	    System.out.print(phoneNumber.substring(3,6) + "-");
	    System.out.print(phoneNumber.substring(6));
	    System.out.println("\n("+ area + ")"+ first + "-" + second); // print
		
	}

}
// prints out a 10 digit phone number as a string and then prints it in more readable format