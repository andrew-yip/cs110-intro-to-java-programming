package HW08;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] array1 = new double [1000]; // declaring array as double with length 1000
		double max = 0; // have to declare on outside // has to be greater than a value // can be larger than 0
		double min = 1; // has to be less than a value // has to be less than 1
		
		for (int i = 0; i<array1.length; i++)
		{
			array1[i] = Math.random(); // 1000 different numbers from 0-1 // array at i is a value from 0-1
			
			if (array1[i] > max) // if the array at i is greater than the current max
				max = array1[i]; //updating max
			else if (array1[i] < min) // if array at i is less than current min
				min = array1[i]; //updating min
		}
		
		System.out.println("MINIMUM: " + min);
		System.out.println("MAXIMUM: " + max);
		
	}

}
 // prints max and min out of the array