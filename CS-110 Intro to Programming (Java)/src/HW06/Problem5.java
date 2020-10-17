package HW06;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(max(1000, 234200, -100)); //calling the method and finding the max out of three values
		
	}
	
	public static int max (int num1, int num2, int num3) // declaring method (do like coding bat)
	{
		int result; // initializing result then returns it after
		if (num1 > num2 && num1> num3)
			result = num1; //updating result if num1 greatest
		else if (num2 > num1 && num2> num3)
			result = num2;  //updating result if num2 greatest
		else 
			result = num3; // updating result if num3 greatest
		
		return result; // return the result // whatever returns gets put into main
	}

} // this program shows the max value that is input using the max method
