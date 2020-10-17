package Lab06_LogicalOperators;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p = true;
		boolean q = true;
		boolean r = false;
		
		System.out.println(p&&!q); //1
		System.out.println(p&&q || !r); //2
		System.out.println(p&&!(q||r)); //3
		System.out.println(!p&&q); //4
		System.out.println(p||q&&r); //5

	}

}
