package Lab11_Methods;
public class Q1
{

	public static void main(String[] args)
	{
		int a = 8; // need to be declared at top
		int b = 4;
		int c = 1;

		System.out.println(findRange(a, b, c)); // range is greatest -least

	}

	public static int max(int a, int b, int c)
	{
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max; // returns max value 
	}

	public static int min(int a, int b, int c)
	{
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min; //returns min value
	}

	public static int findRange(int a, int b, int c)
	{
		return max(a, b, c) - min(a, b, c); // whatever is returned from max and min subtracting from each other and thats range
	}

}
