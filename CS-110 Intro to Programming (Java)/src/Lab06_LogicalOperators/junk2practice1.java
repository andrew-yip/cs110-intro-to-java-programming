package Lab06_LogicalOperators;
import java.util.Scanner;
public class junk2practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in);
		
		System.out.println("Enter a temperature in whole degrees:");
		int temp = myInput.nextInt();
		
		System.out.println("Enter a C or F");
		char units = myInput.next().charAt(0);
		
		if (units == 'C')
		{
			if (temp <= 32)
				System.out.println("Water is a solid");
			else if (temp > 32 && temp < 212)
				System.out.println("Water is a liquid.");
			else if (temp >= 112)
				System.out.println("Water is a gas");
		}
		
		else if (units == 'F')
		{
			if (temp <= 0)
				System.out.println("Water is a solid");
			else if (temp >= 0 && temp <= 100)
				System.out.println("Water is a liquid");
			else if (temp >= 100)
				System.out.println("Water is a gas.");
			
		}
			
		else 
			System.out.println("Units must be in C or F");
	}

}
