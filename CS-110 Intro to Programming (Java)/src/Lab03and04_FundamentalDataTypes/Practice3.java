package Lab03and04_FundamentalDataTypes;
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args)
	{
		int deg1, deg2;
		int min1, min2;
		int degSum, minSum;  // These will hold the sums of degrees and minutes
		int carry; // This variable will carry the 1 if the minutes
		// sum is >60

		Scanner in = new Scanner(System.in);

		System.out.println("type in the degrees and minutes " +
		" with a space between of your first heading ");
		deg1 = in.nextInt();
		min1 = in.nextInt();

		System.out.println("type in the degrees and minutes of your second heading ");
		deg2 = in.nextInt();
		min2 = in.nextInt();

		carry = (min1 + min2) / 60; // Notice this will be 0 or 1 
		
		minSum = (min1 + min2) % 60;
		degSum = (deg1 + deg2 + carry) % 360;
		
		System.out.println(degSum);
		System.out.println(minSum);	
	}
}


