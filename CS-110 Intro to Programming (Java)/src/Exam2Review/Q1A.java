package Exam2Review;

public class Q1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 4;
		min(5,2,a);
		System.out.println(a);
		System.out.println("Apple");
	}
	
	public static void min(int value1, int value2, int a) { // void method
		if (value1 < value2) {
			a = value1;
		}
		else {
			a = value2;
			System.out.println("Banana");
		}
		
		
			
	}

}
