package Lab08_For_Loops;

public class Q2HeadsorTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int countHeads = 0;
		int countTails = 0;
		
		for(int i = 0; i<n; i ++)
		{
			if(Math.random()<.5)
			{
				System.out.println('H');
				countHeads++;
			}
			else
			{
				System.out.println('T');
				countTails++;
			}
		}
		System.out.println("# of Heads:" +  countHeads);
		System.out.println("# of Tails: " + countTails);
	}
	

}
