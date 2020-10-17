package Lab16_PassingArraysToMethods;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = new int [5][10]; // 5 down 10 right
		int rows = 3;
		print(arr);
		System.out.println();
		System.out.println("The average for row 4 is " + average(arr,rows) + ".");
	}
	
	public static void print (int arr2 [][]) {
		for (int i = 0; i< arr2.length; i++) {
			for (int j = 0; j< arr2[0].length; j++) {
				arr2[i][j] = (i+1)*(j+1);
				System.out.print(arr2[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static double average (int [][] arr, int row) {
		int sum = 0;
		for (int i = 0; i< arr[row].length; i++) { // array #3
			sum = sum + arr[row][i];
		}
		
		double average = (double)(sum) / arr[row].length;
		return average;
	}
	

}
