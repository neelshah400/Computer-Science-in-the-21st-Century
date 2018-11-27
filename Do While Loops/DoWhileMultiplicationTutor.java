import java.util.Scanner;

public class DoWhileMultiplicationTutor{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("Welcome to the Multiplication Tutor!");
		System.out.print("What is your name? ");
		String name = neel.nextLine();
		System.out.println("Let's see how good you are at multiplication, " + name + ".");
		System.out.println("Type -1 at any time to exit and see your score.");
		System.out.println();

		int answer = 0;
		int rand1 = 0;
		int rand2 = 0;
		int correct = 0;
		int counter = 0;

		while(answer != -1){
			rand1 = (int)(Math.random()*10)+1;
			rand2 = (int)(Math.random()*10)+1;
			System.out.print("What is " + rand1 + " * " + rand2 + "? ");
			answer = neel.nextInt();
			if(answer != -1){
				counter++;
				if(answer == rand1 * rand2){
					correct++;
					System.out.println("Correct!");
				}
				else{
					System.out.println("Sorry! The answer is " + (rand1 * rand2) + ".");
				}
				System.out.println();
			}
			else{
				System.out.println();
				System.out.println("Let's see, " + name + "! You got " + correct + " out of " + counter + " correct.");
				if(((double)correct / (double)counter) == 1.0)
					System.out.println("You've mastered multiplication!");
				else if(((double)correct / (double)counter) >= 0.75)
					System.out.println("You almost got it!");
				else
					System.out.println("You really need to practice!");
				System.out.println();
			}
		}
	}

}