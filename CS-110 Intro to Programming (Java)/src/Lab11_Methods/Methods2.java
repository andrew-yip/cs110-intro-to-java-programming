package Lab11_Methods;

public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		for (int i = 1; i<=5; i++)
		{
			System.out.println(i + " " + sumN(i));
		}
		
	}
	
	public static int sumN(int num)
	{
		int sum = 0;
		for (int i =1; i <= num; i++)
		{
			sum+=i;
		}
		
		return sum;
	}

}
