package Lab11_Methods;

public class Methods5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printBox("Question1");
	}
	
	public static void printBox(String str)
	{
		String top = "";
		for (int i = 0; i< str.length(); i++)
			top += '-';
		
		System.out.println(top);
		System.out.println(str);
		System.out.println(top);
		
	}

}
