package HW04;
import java.util.Scanner;
public class JustinsProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We will play a game of Rock, Paper, and Scissors with the computer.
		 // I will be prompted to enter a number representing these choices
		
		Scanner myInput = new Scanner (System.in);

		 System.out.println("Enter your choice: 0 for rock, 1 for scissors and 2 for paper");
		 int choice = myInput.nextInt();
		 int computer = (int) (3 * Math.random());
		 final int ROCK = 0;
		 final int SCISSORS = 1;
		 final int PAPER = 2;
		 System.out.println("My choice is " + computer);

		 if (choice == ROCK) {
		  if (computer == ROCK)
		   System.out.println("Darn! We tie this time");
		  if (computer == SCISSORS)
		   System.out.println("AH! I am smashed by your rock");
		  if (computer == PAPER)
		   System.out.println("WRAP! My paper has squeezed your puny rock");
		 }

		 if (choice == SCISSORS) {
		  if (computer == ROCK)
		   System.out.println("Hulk smash! I crush your scissors");
		  if (computer == SCISSORS)
		   System.out.println("Clang... We tie");
		  if (computer == PAPER)
		   System.out.println("AH! My paper is cut by your scissors...");
		 }

		 if (choice == 2) {
		  if (computer == ROCK)
		   System.out.println("Darn...I'm suffocated by your paper");
		  if (computer == SCISSORS)
		   System.out.println("Hah! I impale you with my scissors");
		  if (computer == PAPER)
		   System.out.println("We tie... ");
	}
	}
}
