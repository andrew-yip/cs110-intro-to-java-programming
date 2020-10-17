package HW06;
import java.util.Scanner;
public class Problem8Updated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner myInput = new Scanner(System.in);
         System.out.println("Please enter the height of the pyramid");
        int input = myInput.nextInt();
         pyramid(input);
	}
	
	public static void pyramid(int input) {
        for (int stars = 1; stars <= input; stars++) {
              for (int i = 1; i <= stars; i++) {
                    System.out.print("*");}

              System.out.println("");
        }
        
        for (int stars = input; stars > 0; stars--) {
        	 
            for (int i = 1; i <= stars; i++) {
                  System.out.print("*");}

            System.out.println("");
      }

}

} // prints pyramid of stars
