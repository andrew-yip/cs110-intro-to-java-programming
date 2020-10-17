package Exam2Review;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 1; i<=30; i++) {
			sum += ((double) i/(31-i));
		}
		System.out.println(sum);
		
		double sum2 = 1.0/30;
		for (int i = 2; i<=30; i++) {
			sum2 += (double) i/(30-(i-1));
		}
		System.out.println(sum2);
		
	}

}
