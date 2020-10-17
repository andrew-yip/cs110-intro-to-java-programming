package Lab16_PassingArraysToMethods;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hola = "hello";
		str(hola);

	}
	
	public static void str (String hi) {
		for (int i = 0; i<hi.length(); i++) {
			if (hi.charAt(i) == 'h') {
				System.out.print("b");
			}
			else
				System.out.print(hi.charAt(i));
		}
	}

}
