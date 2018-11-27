import java.util.Scanner;

public class ScannerNotes{
	public static void main(String[]args){

		Scanner zaal = new Scanner(System.in);

		System.out.print("what is your name? ");
		String name = zaal.nextLine();

		System.out.print("What is the temperature? ");
		int temp = zaal.nextInt();

		zaal.nextLine();
		//going from string to int --> without this line, program would skip over weather input

		System.out.print("what is the weather? ");
		String weather = zaal.nextLine();

		System.out.print("What is your GPA? ");
		double gpa = zaal.nextDouble();

		System.out.println("Hi " + name + "! It is currently " + temp + " degrees and " + weather);
		System.out.println("Today is a great day to get a " + gpa);

	}
}