import java.util.Scanner;

public class DoWhileRandomGuesserGamePart2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("Welcome to the Random Guesser Game Part 2!");
		System.out.println("The computer will generate a random number from 1 to 100.");
		System.out.println("You will begin with a score of 5 and will lose a point for every wrong guess.");
		System.out.println("You will be told if your guess is too high or too low.");
		System.out.println("If you don't guess the number within 5 tries, you will lose.");
		System.out.println();

		int rand = (int)(Math.random()*100)+1;
		int score = 5;
		int counter = 1;
		int guess = 0;

		while(score > 0){
			System.out.print("Guess " + counter + ": ");
			guess = neel.nextInt();
			if(guess == rand){
				System.out.println("\nCorrect! The number was " + rand + ". Your score is " + score + ".\n");
				score = -1;
			}
			else if(guess > rand){
				System.out.println("Your guess was too high.\n");
				score--;
			}
			else if(guess < rand){
				System.out.println("Your guess was too low.\n");
				score--;
			}
			else
				score--;
			counter++;
		}

		if(score == 0)
			System.out.println("\nYou lose! You have run out of tries. The number was " + rand + ".\n");

	}
}