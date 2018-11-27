import java.util.Scanner;

public class ScannerPractice1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number to be squared: ");
		int num = neel.nextInt();

		System.out.println("Result: " + (num * num));

	}
}