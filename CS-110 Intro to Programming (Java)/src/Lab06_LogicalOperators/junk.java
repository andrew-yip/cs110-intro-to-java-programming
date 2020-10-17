package Lab06_LogicalOperators;
import java.util.Scanner;
public class junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 300;
		int y = 200;
		
		if (x>y)
		System.out.println("x is greater than y.");
		
		if (x==y)
		System.out.println(" x is equal to y.");
		
		if (x!=y)
		{
			System.out.println("X is not equal to Y");
			x=y;
			System.out.println("however now it is");
		}
		
	}

}
