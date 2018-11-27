import java.util.Scanner;

public class IfAndOrPractice4{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = neel.nextInt();

		calc(num);

	}

	public static void calc(int a){

		if((a % 2 == 1) && ((a >= 9) && (a <= 99)))
			System.out.println("You win!");
		else if((a % 2 == 1) || ((a >= 9) && (a <= 99)))
			System.out.println("You're close.");
		else
			System.out.println("You lose.");
	}

}