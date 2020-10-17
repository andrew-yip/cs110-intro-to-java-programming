package HW02;
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("What is the amount of money you would like to input? ");
		double money = myInput.nextDouble();
		
		double dollars = money/1; // dollar value
		System.out.print((int)money + " dollars "); // prints and declares as an integer
		
		double cents = (money*100) %100; // multiples by 100 then gets last two digits of value
		System.out.print("and " + cents + " cents. ");
		
	}

}
// prints out dollars and cents from a price