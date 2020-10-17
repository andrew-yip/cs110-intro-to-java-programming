package Lab11_Methods;

public class Methods6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sides = 6;
		for (int i = 1; i<100; i++) // prints out sides (6) 100 times
		{
			System.out.println(randomRoll(sides));
		}
		
	}
	
	public static int randomRoll (int sides)
	{
		return (int)(sides * Math.random())+1;
	}

}
