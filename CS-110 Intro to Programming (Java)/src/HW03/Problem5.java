package HW03;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter a number for a month: ");
		int input1 = myInput.nextInt();
		
		if (input1 == 1 || input1==3 || input1 == 5 ||  input1 == 7 || input1 == 8 || input1 == 10 || input1 == 12 )
			System.out.println("The month has 31 days. ");
		
		if (input1 == 4 || input1 == 6 || input1 == 9 || input1 == 11)
			System.out.println("The month has 30 days. ");
		
		if (input1 == 2)
			System.out.println("The month has 28 or 29 days. ");
	}

}
