import java.util.Scanner;

public class MethodsQuiz{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter the length of your rectangle: ");
		int l = neel.nextInt();
		System.out.print("Please enter the width of your rectangle: ");
		int w = neel.nextInt();
		System.out.println("The perimeter of your rectangle is " + p(l, w) + " units.");
		System.out.println();

		System.out.print("Please enter the first base of your trapezoid: ");
		double b1 = neel.nextDouble();
		System.out.print("Please enter the second base of your trapezoid: ");
		double b2 = neel.nextDouble();
		System.out.print("Please enter the height of your trapezoid: ");
		double h = neel.nextDouble();
		System.out.println("The area of your trapezoid is " + a(b1, b2, h) + " square units.");
		System.out.println();

	}

	public static int p(int l, int w){

		int p = ((2 * l) + (2 * w));
		return p;

	}

	public static double a(double b1, double b2, double h){

		double a = (0.5 * (b1 + b2) * h);
		return a;

	}

}