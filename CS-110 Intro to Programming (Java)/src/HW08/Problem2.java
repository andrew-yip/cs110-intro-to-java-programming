package HW08;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [10]; // declaring a new array (int)
		for (int i = 0; i<array.length; i++) // creates 10 new random numbers from 1-3
		{
			array[i] = (int) (3*Math.random() + 1); // designating array at i as that number
		}
		
		int [] array2 = new int [10]; // delaring a new array (int)
		
		for (int i = 0; i<array2.length; i++) // new array2 making new values at array[i]
		{
			array2[i] = (int)(3*Math.random() + 1); // creates 10 new random numbers from 1-3 at array[i]
		}
		
		for (int i = 0; i< 10; i++) //printing 10 different lines
		{
			if (array[i] == array2[i])
			{
				System.out.println(array[i] + " and " + array2[i] + " Looks like a match!" );
			}
			else 
			{
				System.out.println(array[i] + " and " + array2[i]);
			}
		}
	}

} // checking if numbers from 2 arrays match
