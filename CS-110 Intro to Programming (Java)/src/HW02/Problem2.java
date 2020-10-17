package HW02;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);  // new input
	
		System.out.print("Please enter the first integer: "); // prints
		double first = myInput.nextDouble(); // input a double 
		
		System.out.print("Please enter the second integer: "); // prints
		double second = myInput.nextDouble(); // input the second double
		
		System.out.println("The sum of the two integers is " + (first + second) + "."); //sum 
		System.out.println("The difference of the two integers is " + (first - second) + "."); //diff
		System.out.println("The product of the two integers is " + (first * second) + ".");//product
		System.out.println("The average of the two integers is " + ((first+second)/2.0) + ".");  //average
		System.out.println("The absolute value of the difference is " + Math.abs(first-second) + "." ); //abs value
		System.out.println("The maximum value of the two integers is " + Math.max(first, second) + "."); //max
		System.out.println("The minimum value of the two integers is " + Math.min(first, second) + "."); //min
	}

}
// finds the sum, difference, product, average, abs value, max and min or two ints