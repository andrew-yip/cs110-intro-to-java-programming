package Lab15_ArraysDay3;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {2,4,6,8,10};
		int number = 100;
		
		print(array1);
		print(addNum(number, array1));
		print(sumArrays(array1, addNum(number,array1)));
		//print(array1);
	}
	
	public static void print (int [] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int [] addNum (int num, int [] arr) {
		int [] newArr = new int [arr.length]; // make new array without updating the old array
		for (int i = 0; i< arr.length; i++) {
			//arr[i] += 5;
			newArr[i] = arr[i];
			newArr[i] += num;
		}
		return newArr;
	}
	
	public static int [] sumArrays (int [] arr, int [] arr2) { // summing the two array
		int sh = 0; // initialize
		int lo = 0; // initialize
		
		if (arr.length > arr2.length) {
			lo = arr.length;
			sh = arr2.length;

		}
		else if (arr2.length > arr.length) {
			lo = arr2.length;
			sh = arr.length;
		}
		
		else // if the lengths are equal
		{
			lo = arr.length;
			sh = lo;
		}
		
		int [] sum = new int [lo]; // new array of length lower length
		
		
		if (arr.length > arr2.length) {
			for (int i = sh; i< lo; i++) { // making values that value 
				 sum[i] = arr[i];
			}
		}
		else if (arr2.length > arr.length) {
			for (int i = sh; i< lo; i++) { // making values that value
				 sum[i] = arr[i];
			}
		}
		
		for (int i = 0; i< sh; i++) { // summing the arrays to the shorter part of the array
			sum[i] = arr[i] + arr2[i];
		}
		return sum;
	}
	
	

}
