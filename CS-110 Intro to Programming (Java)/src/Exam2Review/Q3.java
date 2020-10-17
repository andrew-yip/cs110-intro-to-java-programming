package Exam2Review;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitsEven(24516));
	}
	
	public static boolean digitsEven(int num)
	{
		int last = num % 10;
		int first = (int) (num/10000);
		if (last %2 == 0 && first % 2 == 0) {
			return true;
		}
		else
			return false;
	}

}
