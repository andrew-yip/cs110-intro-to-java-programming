package Exam2Review;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bolero";
		string2(str);
	
		
		
	}
	
	public static void string2 (String str2) {
		for (int i = 0; i<str2.length(); i++) {
			if (i%2 ==0) {
				System.out.print(str2.substring(i,i+1).toUpperCase());
			}
			else {
				System.out.print(str2.substring(i,i+1).toLowerCase());
			}
				
		}
	}

}
