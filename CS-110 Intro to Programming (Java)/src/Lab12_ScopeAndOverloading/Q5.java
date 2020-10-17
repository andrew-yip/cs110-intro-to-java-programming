package Lab12_ScopeAndOverloading;
public class Q5
{

	public static void main(String[] args)
	{
		char first = '7';
		char second = '8';

		System.out.println(add(first, second));
		System.out.println(add(2, 7));
	}

	public static int add(int a, int b)
	{
		return a + b;
	}

	public static int add(char a, char b)
	{
		int x = (int) a - 48;
		int y = (int) b - 48;
		return x + y;
	}
}
