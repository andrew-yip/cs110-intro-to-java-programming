package Lab01;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Andrew Yip" ;
		int age = 20 ; 
		int annualPay = 100000;
		double monthlyPay;
		
		monthlyPay = (double) annualPay/12.0;
		
				
		System.out.println("My name is " + name + ", my age is " + age + " and");
		System.out.println("I hope to earn $" + annualPay + " per year. That's " + 
		monthlyPay + " per year.");
		
		
	}

}
