package Lab13_Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores1; //declaring scores1 as an integer array //creating an array
		
		scores1 = new int[7]; // could be a for loop just declaring how many ints
			scores1[0] = 82;
			scores1[1] = 84;
			scores1[2] = 47;
			scores1[3] = 87;
			scores1[4] = 20;
			scores1[5] = 100;
			scores1[6] = 68;

//	System.out.println(scores1[1]); // prints one score
	
	for (int i = 0; i <scores1.length; i++)
	{
		System.out.println(scores1[i]);
	}
	
	int sum = 0; // initializing sum 
	for (int i = 0; i< scores1.length; i++)
	{
		sum+= scores1[i]; // updating sum
	}
	double average = (double) sum/scores1.length; // calculating average 
	System.out.println("The average score is " + average); // prints average
	
	
	int count = 0;
	for (int i = 0; i< scores1.length; i++) // count how many times beat the average 
	{
		if (scores1[i] > average)
			count++;
	}
	System.out.println("your average is " + average);
	System.out.println("you beat the average " + count + " times. ");
	
	//int max = scores1[0];
	//for ()
	//	if (scores[i] > max)
		//{
		//	max = scores[i];
	//	}
	//	if (scores1[i] > average)
		//{
			
		//}

}

}