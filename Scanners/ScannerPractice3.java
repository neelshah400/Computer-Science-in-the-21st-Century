import java.util.Scanner;

public class ScannerPractice3{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		String name = neel.nextLine();

		System.out.print("Please enter your first score: ");
		int test1 = neel.nextInt();

		System.out.print("Please enter your second score: ");
		int test2 = neel.nextInt();

		System.out.println(name + " has an average of " + ((test1 + test2)/2.0) + "%");

	}
}