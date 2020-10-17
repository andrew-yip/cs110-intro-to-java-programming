package Lab03and04_FundamentalDataTypes;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Meow";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toUpperCase().substring(0,2)+ str.toLowerCase().substring(0,2));
		System.out.println(str.charAt(1) + str.toLowerCase().substring(0,2));
	}

}
