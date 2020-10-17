package HW03;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner (System.in);
		System.out.print("Enter a temperature in whole degrees: ");
		int degrees = myInput.nextInt();
		
		System.out.print("Enter a C or F: ");
		char units = myInput.next().charAt(0); // prints char at 0 from the input
		
		// If Fahrenheit
		if (units == 'F')  // if char is F
		{
			if (degrees <= 32) // describing solids
				System.out.println("Water is a solid."); 
			else if (degrees >32 && degrees < 212)  // describing liquids
				System.out.println("Water is a liquid.");
			else if (degrees >= 212) // describing water
				System.out.println("Water is a gas. ");
			
		}
		
		// If Celsius
		else if (units == 'C') // if it is not F 
		{
			if (degrees <= 0) // describing solid
				System.out.println("Water is a solid.");
			else if (degrees >0 && degrees < 100) // describing liquid 
				System.out.println("Water is a liquid.");
			
			
			else {
				
					if (degrees >= 100) { // describing water
					System.out.println("Water is a gas. ");
				}
					
			}
		}
			
		else
			System.out.println("Units must be in F or C.");
			
		
	}

}
