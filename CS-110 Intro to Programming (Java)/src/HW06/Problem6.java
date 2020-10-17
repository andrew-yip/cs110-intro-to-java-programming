package HW06;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(classAverage(90.2, 85.6, 84.8)); // prints the class average out of the three
		
	}
	
	public static double classAverage (double avg1, double avg2, double finalExam)
	
	{
		double result; // declaring result as a double // what we want to return in the end
		
		result = avg1*.25 + avg2*.25 + finalExam*.5; // updating result
		
		return result; // returns the updated "result"
	}

} // this program sums up and finds the average of the two mid terms and one final exam by using methods
