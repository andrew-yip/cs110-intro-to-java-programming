package HW01;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here are variables
		double hour = 3.0; // 3 hours
		double minutes = 45.0; // 45 minutes
		double seconds = 30.0; // 30 seconds
		double kilometers = 24.5; // total kilometers
		double mile = (1/1.6) * kilometers; //conversion
		double timeInHour = hour + (minutes/60.0) +  (seconds/3600.0); //adding 3hr + 
		//min(in fractions of an hour) + seconds (fraction of an hour)

		double average = mile/timeInHour; //average speed is (total miles/total hours) elapsed
		System.out.println("The average is: " + average + " miles per hour (mph)." );
	}

}
// converts kilometers to average mph