package Lab16_PassingArraysToMethods;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		int x = 5;
		func(arr,x); // changing array values
		printArray(arr); // printing new array
		System.out.println("x = " + x);
		
	}
	
	public static void func (int [] arr, int x) { // changing the array
		arr[0] = x; // points to a big thing
		arr[1] = x;
		arr[2] = x;
		x = 9; // does nothing
	}
	
	public static void printArray(int[] arr)
	{for (int i = 0; i < arr.length; i++)
	System.out.println(arr[i] + " ");
}


}
