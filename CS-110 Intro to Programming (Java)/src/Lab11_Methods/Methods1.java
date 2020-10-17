package Lab11_Methods;

public class Methods1 {

	public static void main(String[] args) {

		System.out.println(max(2,17)); // main
		System.out.println(first("Joe Blow")); //main
		
	}
		
		public static int max(int num1,int num2) //method
		{
			int result; // initialize result
			if (num1 > num2) // if first number is greater than number 2
				result = num1; // updates result to num1
			else result = num2; // if num2 is greater than max is num2
			
			return result; // in methods we use the return
		}
		
	
		public static String first(String name) //method
		{
			
			int i = 0; // initialize index
			while (name.charAt(i)!= ' ') // if the character is not equal to a space keep running //once sees a space stops running 
			{
				i++; //incriment i
			}
			
			return name.substring(0,i); // returns
		}
		
	}


