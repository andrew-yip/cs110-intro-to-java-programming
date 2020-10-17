package Lab15_ArraysDay3;

public class Q1Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = {2,4,6,8,10}; // initialized array
		//int [] newArray = new int [5];
		
		print(array1);
		print(add5(array1));
		//print(array1);
	}
	
	public static void print (int [] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // once you exit the for loop making a new line
	}
	
	public static int [] add5 (int [] arr) {
		int [] newArr = new int [arr.length];// making new array to with updated numbers but not updating old array//make in method
		for (int i = 0; i< arr.length; i++) {
			//arr[i] += 5;
			newArr[i] = arr[i]; // new array has same value as arr
			newArr[i] += 5; // updating the new array at i to 5
		}
		return newArr; // returning new array then to print need to use print METHOD
	}

}
