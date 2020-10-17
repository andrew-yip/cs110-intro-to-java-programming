package Lab11_Methods;

public class Methods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myScore =67;
		System.out.println(letterGrade(myScore));
	}	



	public static char letterGrade(int score)
	{
	if (score>90)
		return 'A';
	else if (score>80)
		return 'B';
	else if (score>70)
		return 'C';
	else if (score >60)
		return 'D';
	else
		return 'F';
	
	}
}


