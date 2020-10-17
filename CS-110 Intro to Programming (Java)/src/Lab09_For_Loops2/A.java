package Lab09_For_Loops2;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; 
		int n = 10; // how many times you want to roll dice
		int toss;
		
		for (int i = 1; i<=n; i++) // how many times you want to repeat loop
		{
			toss = (int) (6*Math.random()+1); // new random number every time goes through loop
				System.out.println(toss); // prints out toss
				
			if (toss ==3) // want in for loop because want to increase count as for loops keeps repeating
			{
				count++; // if the toss is equal to 3 increase the count by 1
			}
		}
		
		System.out.println("count of 3: " + count); // prints final count
		
	}

	
	
}
