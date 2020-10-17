package Lab13_Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// "Typical way to make an array." - Professor Rick Cornez
		
		String [] names = new String [4];
		// names = { "Fred", "John", "Bob", "Amy"};
		names[0] = "Fred"; // i = 0; 
		names[1] = "John";
		names[2] = "Bob";
		names[3] = "Amy";
		
		for (int i = 0; i< names.length; i++)
		{
			if (names[i].charAt(0) == 'B')
				System.out.println(names[i]);
		}
		
	}

}
