package Lab06_LogicalOperators;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = -5;
		int n = 8;
		char c = 'a';
		double x = -3.56;
		double y = 0.0;
		double z = 44.7;
		
		System.out.println(m<=n); //1
		System.out.println(-2*m <= 8); //2
		System.out.println((x<=y)&&(y<=z)); //3
		System.out.println(!(x<y)); //4
		System.out.println(!((m<=n) && (x+z>y))); //5
		System.out.println(!(m<=n) || !(x+z> y)); //6
		System.out.println(!((m>n) && !(x<z))); //7
		
		
	}

}
