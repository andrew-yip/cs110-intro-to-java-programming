package HW06;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int stars = 1; stars <= 6; stars++) // keeps running until conditions are false
		{
			System.out.print(stars);
			for (int i = 0; i < stars; i++)
				System.out.print("*");
				System.out.println("");
		}

		for (int stars = 5; stars > 0; stars--) {
			System.out.print(stars);

			for (int i = 0; i < stars; i++)
				System.out.print("*");

			System.out.println();

		}

	}

} // prints pyramid of stars
