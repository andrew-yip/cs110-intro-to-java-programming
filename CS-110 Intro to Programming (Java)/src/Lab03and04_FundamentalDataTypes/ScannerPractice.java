package Lab03and04_FundamentalDataTypes;
// Junk
import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = myInput.nextLine();

		System.out.print("How far is your commute in miles? ");
		double distance = myInput.nextDouble();

		System.out.print("How many days did you workout this week? ");
		int workouts = myInput.nextInt();
		

		System.out.println("\nMy name is " + name);
		System.out.println("I commute " + distance + " miles each way");
		System.out.println("I did " + workouts + " workouts this week");

	}

}
