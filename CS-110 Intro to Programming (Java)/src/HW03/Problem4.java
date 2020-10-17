package HW03;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter the first of three numbers: ");
		double input1 = myInput.nextDouble();
		
		System.out.println("Enter the second of three numbers: ");
		double input2 = myInput.nextDouble();
		
		System.out.println("Enter the third of three numbers: ");
		double input3 = myInput.nextDouble();
		
		if (input1 > input2 && input1 > input3) // if input1 greater than 2 and 3
		System.out.println(input1 + "Input 1 is the greatest value.");
		
		if (input2 > input1 && input2 > input3) // if input2 greater than 1 and 3
		System.out.println(input2 + "Input 2 is the greatest value.");
		
		if (input3 > input1 && input3 > input2) // if input3 greater than 1 and 2
		System.out.println(input3 + "Input 3 is the greatest value.");
		
	}

}
