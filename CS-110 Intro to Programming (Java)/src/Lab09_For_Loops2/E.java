package Lab09_For_Loops2;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "andrew";
		String temp = "";
		
		for (int i = 0; i<str.length(); i++)
		{
			if (str.charAt(i) ==  'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u')
			{
				System.out.print("*"); // if the char at (i) is a vowel replace it with *
			}
			else // if it is a consonant (not a, e, i, o, u)
			{
				System.out.print(str.charAt(i));
			}
			
		}
	}

}
