import java.util.Scanner;

public class ScannerBMI{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Input weight in pounds: ");
		double weight = neel.nextDouble();

		System.out.print("Input height in inches: ");
		double height = neel.nextDouble();

		System.out.print("Body Mass index is " + ((weight / (height * height)) * 703.0));

		System.out.print("\n\n");

	}
}