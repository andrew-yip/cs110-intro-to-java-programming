package HW07;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<10; i++) // prints 10 different rolls times // we want 10 different rolls 
		{
		System.out.println(outcome()); // calling method outcome
		}
	}
	
	public static int rollDice () // no parameters because roll dice calculated on inside
	{
		int fairRoll =  (int) (6*Math.random()+1); // random roll of dice 1-6
		return fairRoll; // returns an int
	}
	
	public static String outcome () // no parameters 
	{
		//String line; // whats going to come out
		int sum = rollDice() + rollDice(); // calling for rollDice method
		
		if (sum == 2 || sum == 3 || sum == 12)
		{
			return ("You lose. You rolled an: " + sum); 
		}
		else if (sum == 7 || sum == 11)
			return ("You win. You rolled an: " + sum);
		else
			return ("Keep rolling. You rolled an: " + sum);
	}

} // prints the outcome of the game of craps
