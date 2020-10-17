package HW09;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cards = new int[52]; // array with length 52

		for (int i = 0; i < cards.length; i++) {
			cards[i] = i + 1; // filling the array with numbers 1-52
			System.out.print(cards[i] + " ");
			if (i % 13 == 12) {
				System.out.println();
			}
		}
		System.out.println();
		
		shuffle(cards); // calls for cards to be shuffled first
		print(cards); // then it prints the shuffled cards
	}
	public static void shuffle(int[] deck) { // swtiching values method // we don't want to return anything

		for (int i = 0; i < deck.length; i++) {
			int first = (int) ((52) * Math.random()); // new value every time
			int second = (int) ((52) * Math.random()); // new value every time
			int temp = deck[first]; // needed to store before it disappears so we store it as temp
			deck[first] = deck[second]; // switching values
			deck[second] = temp; // replacing the with first (switching first and second values)
		}
	}
	public static void print(int[] printing) {
		for (int i = 0; i < printing.length; i++) {
			System.out.print(printing[i] + " "); // printing out array
			if (i % 13 == 12)  // new line every 12
			{
				System.out.println();
			}
		}
	}
} // shuffles cards
