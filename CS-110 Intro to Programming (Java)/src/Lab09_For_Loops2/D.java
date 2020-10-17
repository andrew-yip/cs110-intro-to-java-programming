package Lab09_For_Loops2;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Procrastination is the greatest labor saving device";
		
		for (int i = 0; i<str.length(); i+=3) // repeats every 3 chars
		{
			System.out.print(str.charAt(i)); // prints char every 3 
		}
	}

}
