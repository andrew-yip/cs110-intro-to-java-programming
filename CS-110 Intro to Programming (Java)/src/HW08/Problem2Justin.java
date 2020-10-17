package HW08;

public class Problem2Justin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= new int [10];
				for (int i = 0; i<array.length; i++)
				{
					array[i]=(int)(3*Math.random() + 1);
				}
		int [] array2 = new int [10];
				for (int i = 0; i<array2.length; i++)
				{
					array2[i]= (int)(3*Math.random() + 1);
				}
				
				for (int i = 0; i<10; i++)
					if (array[i] == array2[i]) {
						System.out.println(array[i] + "and" + array2[i] + "Its a match.");
					}
						else {
							System.out.println(array[i] + "and" + array2[i]);
						}
	}

}
