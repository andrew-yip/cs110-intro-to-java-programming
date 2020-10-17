package Lab16_PassingArraysToMethods;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [][] = {{1,2,3}, {4,7,8},{2,6,5},{1,1,1}}; // 0 ,1, 2, 3
		print(arr);
		
	}
	
	public static void print (int [][] array) {
		for (int i = 0; i< array.length; i++) {
			for (int j = 0; j<array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
