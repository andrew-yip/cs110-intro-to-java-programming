package Lab03and04_FundamentalDataTypes;

public class Problem4 {

	public static void main(String[] args)
	{
		int sum = 0;
		int n = 0;
		String textSum = "";
		
		n = 1;
		sum += n;   // take whatever sum is and add n
		textSum += "1";  // += even works with strings
		System.out.println(textSum+" = " + sum);
		
		n = 2;
		sum += n;   // take whatever sum is and add n
		textSum += "+2";  // 
		System.out.println(textSum+" = " + sum);
		
		n = 3;
		sum += n;   // take whatever sum is and add n
		textSum += "+3";  // 
		System.out.println(textSum+" = " + sum);
		
		n = 4;
		sum += n;   // take whatever sum is and add n
		textSum += "+4";  // 
		System.out.println(textSum+" = " + sum);
		
		n = 5;
		sum += n;   // take whatever sum is and add n
		textSum += "+5";  // 
		System.out.println(textSum+" = " + sum);
	}
}
