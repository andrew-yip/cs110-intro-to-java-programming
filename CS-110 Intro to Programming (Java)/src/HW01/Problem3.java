package HW01;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numFriends, myStash, moneyLeft; //describes variables
		myStash = 43; //myStash
		numFriends = myStash/9;  //the number of friends that you can bring with myStash $
		moneyLeft = myStash%9;//(myStash-(9*numFriends)); //moneyLeft
		
		System.out.println("I can take " +(numFriends) + " friends to the movies.");//prints numFriends
		System.out.println("I will have " + (moneyLeft) + 
				" dollars left to buy popcorn."); //prints number of money left
	}

}
// prints and calculates the amount of money you have left and that you can use