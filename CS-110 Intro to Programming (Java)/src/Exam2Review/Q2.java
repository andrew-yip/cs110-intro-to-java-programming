package Exam2Review;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numRolls = 0;
		int sum = 0;
		
		while (sum <= 30) {
			double roll = (6*(Math.random()+1));
			sum += (int) (roll);
			numRolls++;
		}
		
		System.out.println(numRolls + " " + sum);
		
	}

}
