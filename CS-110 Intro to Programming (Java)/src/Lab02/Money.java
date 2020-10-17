package Lab02;

public class Money {
	
	static final double DOLLAR = 1;
	static final double QUARTER = .25;
	static final double DIME = .10;
	static final double NICKEL = 0.05;
	static final double PENNY = .01;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int totalPennies = 1437;
		
		int dollars = totalPennies/100;
		int leftoverCents1 = totalPennies%100; //1437/100 = 37 leftover
		
		System.out.println(totalPennies +" pennies  " + "has " + dollars + " dollars." );
		System.out.println("There are " + leftoverCents1 + " cents leftover. ");
		
		int quarters = leftoverCents1/25; //How many quarters in 37 cents?
		System.out.println("The leftover, " + leftoverCents1 + " cents"  + " consists of " + quarters + " quarter." );
		
		int leftoverCents2 = leftoverCents1%25; // how many cents leftover from 37 cents-25 cents = 12 cents
		System.out.println("There are " + leftoverCents2 + " cents leftover.");
		
		int dimes = leftoverCents2/10; // leftover money to dimes
		System.out.println("The leftover, " + leftoverCents2+ "cents" + " consists of " + dimes + " dimes.");
		
		int leftoverCents3 = leftoverCents2%10; //leftover
		System.out.println("There are " + leftoverCents3 + " cents leftover.");
		
		int nickles = leftoverCents3/5; // leftover money to nickles
		System.out.println("The leftover, " + leftoverCents3+ "cents" + " consists of " + nickles + " nickles.");
		
		int leftoverCents4 = leftoverCents2%5; //leftover
		System.out.println("There are " + leftoverCents4 + " cents leftover.");
		
		int pennies = leftoverCents4/1; // leftover to pennies
		System.out.println("The leftover, " + leftoverCents4 + "cents" + " consists of " + pennies + " pennies.");
		
		int leftoverCents5 = leftoverCents4%1; // leftover remaining
		System.out.println("There are " + leftoverCents5 + " cents leftover.");
		
		
		
	}

}
