package Exam3Review;

public class Q4 { // this program prints out a 2d array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A = {{1,2,3}, {3,2,1}}; // initializing 2d array
		//System.out.println(A[0].length);
		//System.out.println(A.length);
		printArr(A);
	}
	
	public static void printArr (int [][] array) {
		for (int i = 0; i< array.length; i++) {
			for (int j = 0; j< array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
