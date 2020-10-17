package Lab15_ArraysDay3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {2,4,6,8,10}; // original array
		
		print(array1);
		print(addNum(array1));
		//print(array1);
	}
	
	public static void print (int [] arr) { // print the array
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int [] addNum (int [] arr) { // want to return a integer array
		Scanner in = new Scanner(System.in); // new scanner object
		int [] newArr = new int [arr.length]; // new updated array made new
		System.out.println("\nWhat number would you like to add?");
		int input = in.nextInt(); // input 
		for (int i = 0; i< arr.length; i++) {
			newArr[i] = arr[i]; // saying the new array at i is same as arr at i
			newArr[i] += input; // updating newArr at i is += to your input
		}
		return newArr;
	}

} // adding a number to each element in an existing array
