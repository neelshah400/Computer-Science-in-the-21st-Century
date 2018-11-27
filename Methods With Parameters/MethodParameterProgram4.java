import java.util.Scanner;

public class MethodParameterProgram4{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Enter the length of base 1: ");
		int b1 = neel.nextInt();

		System.out.print("Enter the length of base 2: ");
		int b2 = neel.nextInt();

		System.out.print("Enter the height: ");
		int h = neel.nextInt();

		double area1 = area(b1, b2, h);

		System.out.println("The area is " + area1);

	}

	public static double area(int b1, int b2, int h){

		double area = ((0.5 * (b1 + b2)) * h);
		return area;

	}
}