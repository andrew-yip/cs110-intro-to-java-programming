package HW09;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {2 , 2 , 4 , 5 , 6}; // initializing // can change array
		int [] array2 = {2 , 2 , 4 , 5 , 6}; // initializing// can change array
		
		print(array1); // prints array1 by calling method
		print(array2); // prints array2 by calling method
		System.out.println("It is " + same(array1,array2) + " that these two arrays are the same.");
	}
	
	public static void print (int [] theArray) { // method for printing the array
		for (int i = 0; i<theArray.length; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println(""); // new line for second array
	}
	
	public static boolean same (int [] arr1, int [] arr2) { // returns boolean w/ access to array1 and 2
		if (arr1.length != arr2.length) // if it is not the same length
			return false;  // automatically its false (not true)
		
		else if (arr1.length == arr2.length) // if the length of 1 = length of 2 (same lengths)
			for (int i = 0; i< arr1.length; i++) { // only runs if arr1 length = arr2length // goes through the array
				if (arr1[i] != arr2[i]) // if not equal
					return false; // if its not equal return false // a return is a break statement
		}
			return true; // if it goes through the whole for loop without returning false then it returns true
	}

} // prints if the two arrays have the same values
