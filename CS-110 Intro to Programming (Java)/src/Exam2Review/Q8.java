package Exam2Review;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		
		for (int i = 1; i<=30; i++) {
			sum += ((double)i/(31-i));
		}
		
		System.out.println(sum);
	}

}
