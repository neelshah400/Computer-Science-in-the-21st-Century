import java.util.Scanner;

public class MethodParameterProgram2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Enter x-position of point A: ");
		int xA = neel.nextInt();

		System.out.print("Enter y-position of point A: ");
		int yA = neel.nextInt();

		System.out.print("Enter x-position of point B: ");
		int xB = neel.nextInt();

		System.out.print("Enter y-position of point B: ");
		int yB = neel.nextInt();

		double slope1 = slope(xA, yA, xB, yB);
		System.out.println();
		System.out.println("Slope: " + slope1);

	}

	public static double slope(int xA, int yA, int xB, int yB){

		double slope = (((double)yB - yA) / ((double)xB - xA));
		return slope;

	}
}