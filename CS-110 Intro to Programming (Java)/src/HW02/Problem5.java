package HW02;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter the first time in miltary hours: ");
		int firstTime = myInput.nextInt();
		
		System.out.println("Enter the second time in military hours: ");
		int secondTime = myInput.nextInt();
		
		int firstHr = firstTime/100; // gets the first hour
		int firstMin = firstTime % 100; //last two digits of time
		
		int secondHr = secondTime/100; // gets the second hour
		int secondMin = secondTime % 100; // last two digits of time
		
		System.out.println("The difference in time is " + Math.abs(secondHr - firstHr + 24) %24 + " hours " + 
		Math.abs(secondMin - firstMin) +  " minutes" + "."); // time difference between two times
	}
}
// prints out military time difference