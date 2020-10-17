package Exam3Review;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		printArr(arr(n),n); // calling printArr method with access to arr method and number
	}
	
	public static int [][] arr (int number){ // creating the 2d array with access to the number // populating the array
		int arr [][] = new int [number][number]; // creating array in method
		for (int i = 0; i< number; i++) {
			for (int j = 0; j< number; j++) {
				arr[i][j] = (int)(6*Math.random()+1); // new number every time
			}
		}
		return arr;
	}
	
	public static void printArr (int [][] array, int num) { // printing the array // n (main) gets stored as num
		for (int i = 0; i< num; i++) {
			for (int j = 0; j< num; j++) {
				System.out.print(array[i][j] + " "); // array at i , j
			}
			System.out.println();
		}
	}

}
