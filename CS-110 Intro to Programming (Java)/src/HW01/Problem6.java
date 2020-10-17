package HW01;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myMeters = 5.59;
		
		double milesConversion = ((myMeters/1609.34))  ; //miles to meters
		double feetConversion = (myMeters/.3048); // feet to meters
		double inchConversion = (myMeters/.0254 ); // inches to meters
		
		System.out.print(myMeters +  " meters " + "is equal to ");
		System.out.printf( "%.4f", milesConversion); // formatting statement
		System.out.println(" miles."); // prints
		
		// One line version: System.out.printf( "%.2f meters is equal to %.4f miles.\n", myMeters, milesConversion);
		
		System.out.print(myMeters + " meters " + "is equal to "); 
		System.out.printf("%.2f" , feetConversion); // prints formating statement
		System.out.println(" feet."); 
		
		System.out.print(myMeters + " meters " + "is equal to ");
		System.out.printf("%.2f", inchConversion); // formatting statement
		System.out.println(" inches.");
	}

}
// converts meters to (miles, feet, inches)