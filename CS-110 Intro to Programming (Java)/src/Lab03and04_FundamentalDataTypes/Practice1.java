package Lab03and04_FundamentalDataTypes;
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String first = myInput.nextLine();
		
		System.out.println("What is your last name?");
		String last = myInput.nextLine();
		
		System.out.print("My name is " + first + " " + last + " and my initials are ");
		System.out.print(first.substring(0,1) + " ");
		System.out.print(last.substring(0,1));
		System.out.println(".");
		
	}

}
