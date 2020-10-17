package HW06;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " I am against picketing, so how do I protest that?";
		String word = "gain"; //word varies
		
		int i = 0; // where we start the iteration
		
		while (i<str.length()-word.length())
		{
			if (str.substring(i,i+word.length()).equals(word))  // if we find (word) in (str)
				System.out.println("index: " + i);
			i++; // add one to i
		}
		
		
	}

}//find a certain word at a given string
