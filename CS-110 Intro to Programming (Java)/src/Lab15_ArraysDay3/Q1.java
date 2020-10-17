package Lab15_ArraysDay3;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] mynewArray = {10,20,30,40}; // original array 
		int [] yourNewArray = new int [4]; // new array with same length as old array
		
		for (int i = 0; i<4; i++) {
			yourNewArray[i] = mynewArray[i]; // making them the same
			System.out.println(mynewArray[i] + " " + yourNewArray[i]);
		}
		
		System.out.println("Notice both arrays start out the same.");
	}

}
// whole point is to make a new array based on the old array