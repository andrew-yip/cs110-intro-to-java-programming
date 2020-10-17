package HW08;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		int count = 0; // initializing count
		String [] array = new String [11]; // declaring new array with 11 strings
		System.out.println("What will your array of words be?"); // how many strings
		
		for (int i = 0; i < array.length; i++)
		{
			String str = myInput.nextLine(); // takes in input
			array[i] = str; // storing str at array i
		}
		
		for (int i = 0; i< array.length-1; i++)
		{
			if (array[i].compareTo(array[i+1])<0) //comparing to next array
				count++; // add one to the count
		}
		System.out.println("There are exactly " + count + " consecutive pairs.");
	}

} // counting how many consecutive pairs
