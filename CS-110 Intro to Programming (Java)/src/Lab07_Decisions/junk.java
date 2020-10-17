package Lab07_Decisions;

public class junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = Math.random(); // prints out value from 0 - .9999999999999999
		System.out.println(x);
		
		x = Math.random();
		int toss = (int) (2*Math.random());
		
		if (toss < 0.5)
			System.out.println("The outcome is heads.");
		else
			System.out.println("The outcome is tails.");
				
			
	}

}
