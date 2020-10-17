package HW02;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in); // scanner statement
		
		System.out.println("What is the length of the rectangle in inches? ");
		double length = myInput.nextDouble(); // input length as a double
		
		System.out.println("What is the width of the rectangle in inches? ");
		double width = myInput.nextDouble(); // input width as a double
		
		System.out.println("\nThe perimeter of the rectange is " + ((2*length)+(2*width)) + "."); //perimeter
		System.out.println("The area of the rectange is " + (length*width) + "."); //area
		System.out.println("The diagonal of the rectangle is " + (Math.sqrt((length*length) 
				+ (width*width))) + "."); // diagonal

	}
}
// by input a length and width as a double, allows you to find perimeter/area/diagonal