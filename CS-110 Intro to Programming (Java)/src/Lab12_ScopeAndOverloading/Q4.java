package Lab12_ScopeAndOverloading;
public class Q4
{
	public static void main(String[] args)
	{
		System.out.println(max(1, 10, 3));
		System.out.println(max(8, 7));
	}
	
	public static int max(int a, int b)
	{
		if (a > b)
			return a;
		else return b;
	}

	public static int max(int a, int b, int c)
	{
		int m = a;
		if (b > m)
			m = b;
		else if (c > m)
		{
			m = c;
		}
		return m;

	}

}
