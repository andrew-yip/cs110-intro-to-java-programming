package Lab11_Methods;

public class Methods7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		flip1();
		System.out.println(flip2());
		
	}
	
	public static String flip1()
	{
		if (Math.random()<.5)
			return ("Heads");
		else
			return ("Tails");
				
	}
	
	public static String flip2()
	
	{
		if (Math.random()<.5)
			return ("Heads");
		else
			return ("Tails");
	}

}
