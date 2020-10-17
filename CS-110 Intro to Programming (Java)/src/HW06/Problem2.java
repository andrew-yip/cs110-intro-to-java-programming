package HW06;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12; 
		System.out.println("I would like to factor the number: " + number);
		
		for (int i = 2;;i++) { //start at 2 because it would keep running if we did i = 1
			
			while (number % i == 0) { // while loop only runs while number is divisible by i // if its not then exits 
				// while and for loop and increments i and checks the next number
				number = number / i; //update the number
				System.out.println(i + " "); //prints i
			}
			
			if (number == 1)
				break; // stops program if updated number is equal to 1
				
		}
		/* Alternate method with basically the same strategy
		number = 12;
		System.out.println();
		
		for (int i = 2;;) {
			
			if (number % i == 0) {
				number = number / i;
				System.out.print(i + " ");
			}
			else
				i++;
			
			if (number == 1)
				break; // breaks when number is equal to one 
				
		}*/
				
	}

} //factoring a number
