package HW06;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int nHeads = 6; // Stop when you get 6 heads in a row
		int headsInRow = 0; // This will keep track of your current run (initially 0) 
		int tosses = 0;	// Total number of tosses // initial 
		int toss; //  0 for tails and 1 for heads

		
		//Loop
		while (headsInRow < nHeads) // when headsinRow is = to 5 it still runs because less than 5
			// but you want it to stop running once headsinRow is equal to 6 (WANT TO STOP ONCE HEADS IN ROW =6)
		{
			toss = (int)((2)*(Math.random())); // put inside loop because want new toss every time
			System.out.println(toss); // print out the outcome (0 or 1)
				if (toss == 1) // if the toss is equal to 1
					headsInRow++; // update count +1 to heads in a row
					//if (headsInRow == 6) // useless because while loop says that
						//break;
				else if (toss == 0) // if the toss is equal to 0
					headsInRow = 0; // reset number of heads in a row
			
			tosses++; // counts each time it goes through the while loop
			
		}
		
		System.out.println("Tosses:" + tosses);
	}

} // counts the heads in a row and stops once you reach 6
