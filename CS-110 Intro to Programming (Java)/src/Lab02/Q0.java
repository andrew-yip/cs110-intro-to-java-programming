package Lab02;

public class Q0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds = 1437; // initial seconds
		int secToMin = 1/60;
		int minutes = (seconds/60); // seconds to minutes
		int secondsLeft = seconds%60; // calculates remaining seconds
		
		//Calculation
		int remainingSeconds = 1437%60;  // remaining seconds
		
		System.out.println(minutes + "." + secondsLeft);
	}

}
