package Lab10_NestedForLoops_WhileLoops;

public class JUNK3WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double popChina = 1400;
		double popUS = 323;
		
		final double CH_RATE = 1.005;
		final double US_RATE = 1.007;
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i + " China = "  + (int) popChina + " US = " + (int) (popUS)); //when i = 1 initial pop
			popChina *= CH_RATE; // update population 
			popUS *= US_RATE; // updates population 
		}

	}

}
