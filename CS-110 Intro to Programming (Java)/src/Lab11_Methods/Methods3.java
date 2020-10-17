package Lab11_Methods;

public class Methods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "Smith";
		String name2 = "Sanford";
		
		if (sameLetter(name1,name2))
		{
			System.out.println("Names have same first letter");
		}
		else
		{
			System.out.println("Different letters");
		}
		
	}
	
	public static boolean sameLetter(String str1, String str2)
	{
		return str1.charAt(0) == str2.charAt(0);
	}

}
