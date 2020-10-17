package Exam1Review;

public class junk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int feet1 = 3; // first 
		int inch1 = 6;
		
		int feet2 = 11; // second
		int inch2 = 9;
		
		int total = ((feet1 + feet2)*12 + (inch1 + inch2));
		int feetTotal = total/12; // understand
		int inchTotal = (total%12); //right (understand)
		
		System.out.println("feet total: " + feetTotal);
		System.out.println("inch total: " + inchTotal);
		
		//String s1 = "Welcome";
		//char x = s1.charAt(0);
		
		String code = "Just";
		int value = code.charAt(0)+ 0;
		
		//System.out.println(7%10);
		
		String str = "Hello";
		System.out.println(str.substring(str.length()-2));
		System.out.println(str.length()-2);
		
	}

}
