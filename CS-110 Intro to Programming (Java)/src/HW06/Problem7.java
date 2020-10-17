package HW06;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Backwards("andrew")); //calling for method Backwards
	}
	
	public static String Backwards (String name) // (String name is also like the input what we are making backwards)
	
	{
		String temp = ""; // temporary string
		
		for (int i = name.length()-1; i>=0; i--) // starting at the length -1 and stops when i is greater or equal to 0
		{
			temp += name.charAt(i); //updating temp // same as temp = temp + charAt(i)
		}//update temp until i>=0;
		
		return temp; //returns the updated string when for loop stops running
	}

} // this program prints out the string backwards and makes it all capital
