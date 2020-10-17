package Lab16_PassingArraysToMethods;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		int x = 5;
		func(arr, x);
		printArray(arr);
		System.out.println("x = "+x);

	}
	
	public static void func(int[] brr, int x) {
		int [] arr2 = {2 , 3 , 1};
		arr2[0] = 7;
		brr[0] = x;
	}
	
	public static void printArray(int[] arr)
	{for (int i = 0; i < arr.length; i++)
	System.out.println(arr[i] + " ");
}


}
