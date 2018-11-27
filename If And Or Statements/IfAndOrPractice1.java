import java.util.Scanner;

public class IfAndOrPractice1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = neel.nextInt();

		calc(num);

	}

	public static void calc(int a){

		if((a > 10) && (a % 2 == 0))
			System.out.println("The number is greater than 10 and even.");
		else if((a < 10) && (a % 2 == 0))
			System.out.println("The number is less than 10 and even.");
		else if((a < 10) && (a % 2 == 1))
			System.out.println("The number is less than 10 and odd.");
		else if((a > 10) && (a % 2 == 1))
			System.out.println("The number is greater than 10 and odd.");
		else
			System.out.println("The number is equal to 10 and even.");

	}

}