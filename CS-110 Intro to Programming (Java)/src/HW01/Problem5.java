package HW01;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables 
		int currentPopulation = 312000000; // initial population
		int secondsInAYear = 1314000; // how many seconds are in a year? 
		
		double birthRate = (1/7.5)*(secondsInAYear); // conversion
		double deathRate = (1/13.6)*(secondsInAYear); // conversion 
		double immigrantRate = (1/45.5)*(secondsInAYear); // conversion
		
		// Lives Calculations: 
		double Year1 = (currentPopulation + (birthRate + deathRate + immigrantRate)); //calculating year1
		System.out.println("1st Year Population: " + Year1 + " people");
		
		double Year2 = Year1 + (birthRate + deathRate + immigrantRate); // adding year1 + Increase
		System.out.println("2nd Year Population: " + Year2 + " people");
		
		double Year3 = Year2 + (birthRate + deathRate + immigrantRate); // adding year2 + Increase
		System.out.println("3rd Year Population: " + Year3 + " people");
	}

}
// calculates expected population for the next three years