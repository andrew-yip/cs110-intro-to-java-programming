package Exam3Review;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 8;
		printArr(tosses(len)); // calling print array // then calling tosses with access to length

	}
	
	public static int []  tosses (int length) { // making new initializing array with access to the length // filling array
		int [] arr = new int [length]; // making the array
		for (int i = 0; i< length; i++) {
			arr[i] = (int)(6*Math.random()+1); // making array at that value of i as a random number from 1-6
		}
		return arr; // returns an array with access to length
	}
	
	public static void printArr (int [] array) { // we want access to the array // printing the array
		for (int i = 0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
