package HW09;

public class Problem5Shorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] deck = new int [52]; // making an array called deck
		
		for (int i = 0; i< deck.length; i++) { // populating the array
			deck[i] = i+1; // making array in order from 0 to 52 // storing values
		}
		print (deck);
		print(shuffle(deck));
	}
	
	public static void print (int [] deck) { // printing the method //with access to the array named as decks
		for (int i = 0; i< deck.length; i++) {
			System.out.print(deck[i] + " ");
		}
		
		System.out.println(); // printing 2d array
	}
	
	public static int[] shuffle (int [] deck) {
		for (int i = 0; i< deck.length; i++) {
			int first = (int) ((52) * Math.random()); // new value every time from 0-52
			int second = (int) ((52) * Math.random()); // new value every time from 0-52
			int temp = deck[first]; // needed to store before it disappears so we store it as temp
			deck[first] = deck[second]; // switching values
			deck[second] = temp; // replacing the with first (switching first and second values)
		}
		return deck;
	}
	

}
