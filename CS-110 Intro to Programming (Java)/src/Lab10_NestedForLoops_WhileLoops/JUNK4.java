package Lab10_NestedForLoops_WhileLoops;

public class JUNK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// GAMBLER'S RUIN
		
		int initialStake = 10; 
		int outcome; // outcome is how much money in the end
		int currentWinnings = 0; // starts at 0
		int i = 0; // counts
		
		while (currentWinnings < 10 && currentWinnings >-10) // keep running when less than 10 and greater than -10
		{
			outcome = 2* (int)(2*Math.random()) -1 ; // ASK WHY YOU DO THIS
			currentWinnings += outcome; // current winnings = current winnings + outcome
			i++; // counts i
			System.out.println("current winnings: " + currentWinnings);
		}
		
		System.out.println("current winnings: " + currentWinnings);
		System.out.println("how many turns until losing : " + i);
		
	}

}
