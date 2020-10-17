package Lab10_NestedForLoops_WhileLoops;

public class JUNK3WHILEPOPULATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double popCh = 1400;
		double popUS = 323;
		
		final double CH_RATE = 1.005;
		final double US_RATE = 1.007;
		
		int i = 1; // count to start at 1 in years 
		
		while (popCh > popUS) // keep going until pop us greater than china (while condition true keep going)
		{
			System.out.println(i + ": " + (int) popCh + " " + (int) popUS);
			popUS*= US_RATE;
			popCh *= CH_RATE;
			i++; // incrementing i
		}
		
		
	}

}
