package Lab03and04_FundamentalDataTypes;
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("How many meters would you like to convert to miles/feet");
		final double  METERS_PER_MILE = 1609.34; // METERS PER MILE
		final int  FEET_PER_MILE = 5280; // FEET PER MILE
		
		double meters = myInput.nextDouble();
		
		System.out.println( (int)(meters/METERS_PER_MILE) + " miles and ");
		
		double remainder = (meters/METERS_PER_MILE) - ( (int)(meters/METERS_PER_MILE));
		System.out.printf("%.2f", remainder*5280);
		System.out.print(" feet. ");
		
		
	}

}
