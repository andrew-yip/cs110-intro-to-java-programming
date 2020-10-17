package Exam3Review;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int rowSum(int [][] array, int n) {
		int sum = 0;
		for (int i = 0; i<4; i++) {
			sum+= array[n][i];
		}
		return sum;
	}

}
// 7 and 8 included in q5