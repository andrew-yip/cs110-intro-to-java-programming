package Lab14_ArraysDay2;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 4, 5, 8 }; // declaring array A as ints
		int [] A2 =  {3, 4, 5, 6, 7 }; // second array2
		double[] B = { 2.45, 2, 3, 6, 4, 5.17 }; // declaring array B as doubles
		String[] C = {"Bob","Ted","Carol","Alice"}; // declaring array C as strings
	
		print(A); // print is a void method
		print(B); // We overload to handle ints, doubles etc
		print(C); // using print method to print out C
		
		System.out.println(sumArray(A)); // printing sum of the array
		
		
		print(reverse(C)); // why  how does this work??? // how?????
		print(backwards(A)); // why how does this work??? // how???!! //only way to print array is with a method
		
		int[] intArray = new int[] {1, 2, 3, 4, 5}; // doesn't work!!!
		System.out.println(intArray); // DOESN'T WORK!!!
		
	// What I don't Understand
	//System.out.println(reverse(C)); // why is it printing that???? // can't print array // illegal
	//System.out.println(backwards(A)); // why is this not working? // because can't print array but can print string/char/int/double

	}
	
	public static void print(int[] A) { // void because we just want it to print //access to array A which is an int
		// access to array with integer (can name that array anything)
		// QUESTION: HOW DOES THIS METHOD KNOW WE WANT ARRAY A?
		int n = A.length;
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(); // prints new line
	}
	
	public static void print(double[] B) {
		int n = B.length;
		for (int i = 0; i < n; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println(); // outside for loop
	}

	
	public static void print(String[] C) {
		int n = C.length;
		for (int i = 0; i < n; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println(); // just printing and calling print into main
	}

	public static int sumArray(int[] A) { // we want to return an int // we have access to array A 
		
	int sum = 0;  // initializing sum = 0
	for (int i = 0; i<A.length; i++)
	{
		sum += A[i]; // summing up all A[i] values 
	}
	return sum; // what were returning gets called into method from main // going back into main
}
	
	
	public static String[] reverse (String[] str)  // name of new method is reverse // returning string
	// new string array is called str
	{
		String [] arr = new String [str.length]; // creating new array
		for (int i = 0; i<str.length; i++)
		{
			arr[i] = str[str.length-1-i]; // updating new array (arr) at i is = str (last value)
		}
		return arr; // returning string array
	}


	public static int [] backwards (int [] backwardsArray) // look at later
	{
		int [] arr = new int [backwardsArray.length];
			for (int i = 0; i<backwardsArray.length; i++)
			{
				arr[i] = backwardsArray[backwardsArray.length-1-i];
			}
		return arr;
	}


}