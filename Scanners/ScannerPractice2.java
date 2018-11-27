import java.util.Scanner;

public class ScannerPractice2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter the radius of the cylinder: ");
		int radius = neel.nextInt();

		System.out.print("Please enter the height of the cylinder: ");
		int height = neel.nextInt();

		System.out.println("The volume is: " + (3.14 * radius * radius * height));

		System.out.println("The surface area is: " + ((2.0 * 3.14 * radius * height) + (2.0 * 3.14 * radius * radius)));


	}
}