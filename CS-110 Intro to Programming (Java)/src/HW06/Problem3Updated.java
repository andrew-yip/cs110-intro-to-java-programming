package HW06;

public class Problem3Updated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " I am against picketing, so how do I protest that?";
		String word = "gain"; //word varies
		int i = 0; // where we start the iteration
		
		while (!word.equals(str.substring(i,i+word.length()))) //keeps running if the word "gain" is not equal to substring
		{	
			i++; // increasing i by one
		}
		System.out.println("index: " + i);
	}

} //printing word index
