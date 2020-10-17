package Lab05;
import java.util.Scanner;
public class Q1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int1, int2, guess, sum;
		//sum = int1 + int 2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("first number? ");
		int1 = input.nextInt();
		
		System.out.println("second number? ");
		int2 = input.nextInt();

		System.out.println("guess? ");
		guess = input.nextInt();
		
		sum = int1 + int2;
		
		if (guess == sum)
			System.out.println("Nice");
		else
			System.out.println("WRONG");
		
	}

	

}
