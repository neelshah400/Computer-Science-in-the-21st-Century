import java.util.Scanner;

public class DoWhileProgram3{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("Enter your grades to find the average. Enter -1 to quit.\n");

		int counter = 0;
		int sum = 0;
		int grade = 0;

		while(grade != -1){
			counter++;
			sum += grade;
			System.out.print("Grade " + counter + ": ");
			grade = neel.nextInt();
		}

		System.out.println("\nThe average is " + ((double)sum / ((double)counter - 1.0)) + ".\n");

	}
}