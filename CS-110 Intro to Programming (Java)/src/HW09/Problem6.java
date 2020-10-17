package HW09;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = new int [5][5]; // initializing a 2d array of 5 by 5
		fill2DArray(array); // calling for fill2Darray method
		print(array); //calling for print method
	}
	
	public static int [][] fill2DArray (int [][] array){ // filling populating array
		for (int i = 0; i< 5; i++) { // going down // nested for loop
			for (int j = 0; j<5; j++) { // going across // nested for loop
				int roll = (int) (6*Math.random() + 1); // populating array with random value from 1-6
				array[i][j] = roll; // only need two array brackets if we want to access element  // populating array
			}
		}
		return array; // want to return 2d array // just returning the name of the array in this case named "array" 
	}
	
	public static void print (int [][] arr) { // method to print the array // pretty much same as above but printng
		int sum = 0; // initializing sum
		for (int i = 0; i< 5; i++) { // going down
			for (int j = 0; j<5; j++) { // going across
				System.out.print(arr[i][j] + " "); // printing array at [i][j]
				sum += arr[i][j]; // adding sum
			}
			System.out.println(); // makes new line when exiting for loop
		}
		double average = sum/25.0; // calculating avg // taking sum from the whole thing
		System.out.println("The average is " + average + ".");
	}
	} // makes a 2d array and finds the average of all the values in the array