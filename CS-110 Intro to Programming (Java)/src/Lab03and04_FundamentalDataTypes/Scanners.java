package Lab03and04_FundamentalDataTypes;
import java .util.Scanner;
public class Scanners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		String first = myInput.nextLine();
		System.out.println("My name is " + first);
		
		double farAway;
		System.out.println("How far do you live? ");
		farAway = myInput.nextDouble();
		System.out.println("I live " + farAway + " miles away.");
		
		int workouts;
		System.out.println("How many workouts did you do this week? ");
		workouts = myInput.nextInt();
		System.out.println(" I did" + workouts + " workouts this week.");
	}

}
