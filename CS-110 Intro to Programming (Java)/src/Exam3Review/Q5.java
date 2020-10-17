package Exam3Review;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int rowNumber = 1;
		int columnNumber = 0;
		printArr(arr(n));
		System.out.println("\nThe sum of the row selected is " + rowSum(arr(n),rowNumber) + ".");
		System.out.println("The sum of the column selected is " + colSum(arr(n), columnNumber) + ".");

	}
	
	public static int [][] arr (int number){
		int [][] array = new int [number][number];
		int counter = 1;
		for (int i = 0; i< number; i++) {
			for (int j = 0; j< number; j++) {
				array [i][j] = counter;
				counter++;
			}
		}
		return array;
	}
	
	public static void printArr (int [][] array) {
		for (int i = 0; i< array.length; i++) {
			for (int j = 0; j< array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int rowSum(int [][] array, int number) { // number is 1 so first row
		int sum = 0;
		for (int i = 0; i<array[number].length; i++) {
			sum+= array[number][i];
		}
		return sum;
	}
	
	public static int colSum(int [][] array, int number) { // number is 1 so first row
		int sum1 = 0;
		for (int i = 0; i<array[number].length; i++) {
			sum1+= array[i][number];
		}
		return sum1;
	}

}
