package Exam3Review;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,5,2};
		int sum = 0;
		
		for (int i = 0; i< arr.length; i++) {
			sum+= arr[i];
		}
		
		double avg = sum/4.0; // 4.0 is length of arr
		System.out.println(avg);
		
	}

}
