package Exam2Review;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 24516;
		int first = (int)24516/10000;
		int last = 24516 %10;
		
		System.out.println("first" + first);
		System.out.println("last" + last);
		
		if (first%2 ==0) {
			System.out.println("2");
		}
		if (last %2 ==0) {
			System.out.println("2");
		}
		
	}

}
