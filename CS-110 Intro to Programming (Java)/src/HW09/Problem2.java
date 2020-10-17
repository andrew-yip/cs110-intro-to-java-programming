package HW09;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {2,4,6,1,8,9,11,8,10}; // declaring array that has these values
		
		original(array1); // prints original array
		backwards(array1); // prints backwards array
		
	}
	
	public static void original (int [] forward) {
		for (int i = 0; i< forward.length; i++) { // starting at front 
			System.out.print(forward[i] + " ");
		}
		System.out.println("");
	}
	
	public static void backwards (int [] reverse) {
		for (int i = reverse.length-1; i>=0; i--) { // starting from back stops when i is equal to zero
			System.out.print(reverse[i] + " ");
		}
	}

} // prints an array forwards and backwards array
