package Lab16_PassingArraysToMethods;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		int x = 5;
		arr = func(arr, x); // arr gets updated to what is returned
		printArray(arr);
		System.out.println("x = "+x);

	}
	
	public static int [] func(int[] brr, int x) {
		int [] arr = {2 , 3 , 1};
		brr[0] = x;
		return arr;
	}
	
	public static void printArray(int[] arr)
	{for (int i = 0; i < arr.length; i++)
	System.out.print(arr[i] + " ");
}


}
