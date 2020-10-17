package HW08;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = new int [20]; // first 20 integers //declaring an array with length of 20
		System.out.println("Array 1: ");
		for (int i = 0; i<array1.length; i++)
		{
			array1[i] = (i*2) + 1; // array at i is equal to this value
			System.out.print(array1[i] + " "); // print array value at i
		}
		
		System.out.println(""); //new line
		int [] array2 = new int [20]; // declaring array with length 20
		System.out.println("Array 2: ");
		for (int i = 0; i<array2.length; i++)
		{
			array2[i] = (76 - (4*(i))) *(int)(Math.pow(-1, i)); // array at int i // updating number //series
			System.out.print(array2[i] + " "); // printing array value on same line at array [i]
			
		}
		
		System.out.println("");
		System.out.println("Array 3: ");
		int [] array3 = new int [20]; //declaring array with length 20
		for (int i = 0; i<array3.length; i++)
		{
			array3[i] = array1[i] + array2[i]; // array at int i is equal to array1 [i] + array2[i]
			System.out.print(array3[i] + " ");
			if (array3[i] == array3[9]) // prints new line once its at array3[9]
				System.out.println();
		}

	}

} // printing numbers and sum of the two arrays