package Lab16_PassingArraysToMethods;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		printArray(arr);
		arr = func(arr); // arr equals something brr now // changing arr
		printArray(arr); // print arr which is now brr

	}
	
	public static int [] func(int[] arr) {
		int [] brr = new int [2*arr.length]; // new array with twice length
			
		for (int i = 0; i < brr.length; i++){
			brr[i] = 17; // 17
		}
		return brr; // returns the array
	}
	
	public static void printArray(int[] arr)
	{for (int i = 0; i < arr.length; i++)
	System.out.println(arr[i] + " ");
}


}
