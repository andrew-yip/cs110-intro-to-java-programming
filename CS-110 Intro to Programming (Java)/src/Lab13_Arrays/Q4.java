package Lab13_Arrays;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int n = 20;
		int [] squares = new int [n]; // ARRAY INDEX STARTS AT ZERO LIKE STRINGS
		
		for (int i = 0; i<n; i++)
		{
			squares[i] = (i+1) *(i+1);
		}
		
		for (int i = 0; i<squares.length; i++)
		{
			System.out.println(i + 1 + " squared is:  " + squares[i]);
		}
		
		String [] stuff = {"first", "second", "third", "fourth", "fifth"}; 
		for (int i = 0; i<stuff.length; i++)
		{
			System.out.println(stuff[i]);
		}
		
		for (int i = 1; i<= stuff.length; i++)
		{
			stuff[i] = stuff[i-1] + stuff[i];
		}
		
		for (int i = 0; i< stuff.length; i++)
		{
			System.out.println(stuff[i]);
		}
		
		
		
	}
}
