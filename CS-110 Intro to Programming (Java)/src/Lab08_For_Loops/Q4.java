package Lab08_For_Loops;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 32776;
		int digit;
			for (int i= 0; i<5; i++)
			{
				digit = num%10;
				System.out.println(digit);
				
				num = (num-digit)/ 10;
				System.out.println(num);
			}
	}

}
