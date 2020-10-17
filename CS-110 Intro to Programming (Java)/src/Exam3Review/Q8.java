package Exam3Review;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4,5,6};

		arr(arr);
		print(arr);
		
	}
	
	public static int [] arr (int [] arrayy) {
		
		for (int i = 1; i< arrayy.length;i++) {
			arrayy[i] = arrayy[i-1];
		}
		
		return arrayy;
	}
	
	public static void print (int array[]) {
		for (int i = 0; i< array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
