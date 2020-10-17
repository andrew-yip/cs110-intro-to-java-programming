package Lab08_For_Loops;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int toss;
		int n =10; // how many times want the loop to run 
		int count3 = 0; //starting at 0
		
		
		//int toss = (int) (Math.random()*6) + 1 ; //testing statement
			
		for (int i = 0; i <=n; i ++)
		{
			toss = (int)(Math.random()*6)+1 ; // starting at 0 but when you add one it adds one on both sides
			
		if (toss==3)
			{
				count3 ++;
			}
			System.out.println(toss);
			
		}
		
		System.out.println("# of 3s rolls: " + count3);
	}

}
