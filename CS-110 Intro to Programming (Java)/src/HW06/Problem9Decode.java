package HW06;
import java.util.Scanner;

public class Problem9Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the code you want to decode in caps:");
        String word= myInput.nextLine().toUpperCase();
        System.out.println("Enter an integer of how many times to shift to decrypt your message");
        int decodeShift=myInput.nextInt();
        System.out.println("Your word encoded is : "+ encryption(word, decodeShift));
	}
	
	public static String encryption(String word, int decodeShift)
    {
           String decoded = "";
           int decodedChar = ' ';
           int length1 = word.length();
           for (int i =0;i<length1; i++)
           {
                 decodedChar = (int)((word.charAt(i)-decodeShift));
                 decoded += (char)decodedChar;                  
           }
           return decoded;
    }

} //decodes message
