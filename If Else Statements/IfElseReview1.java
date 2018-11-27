import java.util.Scanner;

public class IfElseReview1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		double num1 = neel.nextDouble();
		System.out.print("Please enter a number: ");
		double num2 = neel.nextDouble();
		System.out.print("Please enter a number: ");
		double num3 = neel.nextDouble();
		System.out.print("Please enter a number: ");
		double num4 = neel.nextDouble();
		System.out.print("Please enter a number: ");
		double num5 = neel.nextDouble();
		System.out.println();

		mean(num1, num2, num3, num4, num5);
		System.out.println();

	}

	public static void mean(double a, double b, double c, double d, double e){

		double avg = ((a + b + c + d + e) / 5.0);
		System.out.println("The mean of the numbers is " + avg + ".");

	}

}
