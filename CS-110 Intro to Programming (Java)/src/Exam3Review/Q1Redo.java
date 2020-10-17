package Exam3Review;

public class Q1Redo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,5,2};
		System.out.println(avg(arr));
	}
	
	public static double avg (int [] array) {
		int sum = 0; 
		for (int i = 0; i< array.length; i++) {
			sum+= array[i];
		}
		double average = sum/4.0;
		return average;
	}

}
