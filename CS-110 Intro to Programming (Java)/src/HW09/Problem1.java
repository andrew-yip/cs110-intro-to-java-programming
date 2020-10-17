package HW09;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {88,48,96,85,97,68,97};
		
		System.out.println("The max of the array is " + max(array1) + ".");
		System.out.println("The min of the array is " + min(array1) + ".");
		System.out.println("The average of the array is " + avg(array1));
		System.out.println("The trimmed average of the array is " + trimmedAvg(array1) + ".");
	}
	public static int max(int[] arrMax) { // want to return max with access to array
		 int maximum = arrMax[0]; // initialize max as first
		 
		 for (int i = 0; i < arrMax.length; i++) {
			 if (arrMax[i] > maximum) 
			 {
				 maximum = arrMax[i]; // integer value
			 }
		 }
		 return maximum; // returning an integer value after going through whole for loop
		}
	
	public static int min (int[] arrMin) { // return min (int) with access to array
		int minimum = arrMin [0]; // initialize minimum as first value
		
		for (int i = 0; i < arrMin.length; i++) {
			if (arrMin[i] < minimum) {
				minimum = arrMin[i];
			}
		}
		return minimum;
	}
	
	public static double avg (int [] array) { // want to return a double
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum/array.length; // takes whole sum and divides it by the length of the array
		return average; // returns to main
	}
	
	public static double trimmedAvg(int[] theArray) { // want to return double
		 int sum = 0;
		 for (int i = 0; i < theArray.length; i++) {
		  sum += theArray[i]; // calculating sum
		 }
		 sum = (sum) -  (max(theArray) + min(theArray)); // total sum minus the max and min values
		 double trimmed = (double) sum / (theArray.length - 2); // the length is now subtracted by 2 because took away max &min
		 return trimmed;
		} 
} // prints min, max, avg, and trimmed avg of array
