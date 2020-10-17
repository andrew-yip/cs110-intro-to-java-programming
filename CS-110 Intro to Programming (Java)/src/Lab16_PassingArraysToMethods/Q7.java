package Lab16_PassingArraysToMethods;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = new int [5][10]; // 5 down 10 right
		array(arr);
	}
	
	public static void array (int arr2 [][]) {
		for (int i = 0; i< arr2.length; i++) {
			for (int j = 0; j< arr2[0].length; j++) {
				arr2[i][j] = (i+1)*(j+1);
				System.out.print(arr2[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
