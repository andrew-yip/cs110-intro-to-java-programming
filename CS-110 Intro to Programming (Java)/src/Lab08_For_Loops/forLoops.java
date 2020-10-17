package Lab08_For_Loops;

public class forLoops {

	public static void main(String[] args) {

						// For Loop with Numbers
//////////////////////////////////////////////////////////////////////////////////////
		
		/*int sum = 0;
		// Start   // End condition   // What to do in between runs
		for (int i = 0;i < 5; i+=2) {
			System.out.println("i = " + i);
			sum = sum + i; // also written as sum += i
			System.out.println("current sum: " + sum);
		}
		//System.out.println("Total sum: " + sum);
	*/
							// For loop with String
//////////////////////////////////////////////////////////////////////////////////////
		
		
		String word = "ABCBB";
		System.out.println(word.length());
		for (int i = word.length()-1; i >= 0; i--)
			System.out.print(word.charAt(i));
	
		int pick;
		for (int i = 0; i < 20; i++)
		{
			pick = (int) (Math.random()*word.length()); // picks number between 0 and length(word) - 1
			System.out.print(word.charAt(pick));
		}

		

	}

}
