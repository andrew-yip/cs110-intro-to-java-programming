package HW05;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // initial sum
		int product = 1; // initial product 
		
		Scanner myInput =  new Scanner (System.in);
		
		System.out.println("What is your integer n? ");
		int input1 = myInput.nextInt();
		
		for (int i = 1; i<= input1; i=i+2) // i += 2 is the same as i= i+2 (going to keep going until i< input by +2)
		{
			sum += i; //UPDATING sum  same as sum = sum + i
			product *=i; //UPDATING product (product = product*i)
		}
		
		System.out.println("sum: " + sum); // prints final sum 
		System.out.println("product: " + product); // prints final product
		
	}

}
// this program sums up and all odd numbers from 0 to that sum
// this program finds the product of all odd values up the input