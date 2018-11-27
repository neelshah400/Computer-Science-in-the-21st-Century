import java.util.Scanner;

public class MethodParameterProgram3{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int num1 = neel.nextInt();

		System.out.print("Input the second number: ");
		int num2 = neel.nextInt();

		System.out.print("Input the third number: ");
		int num3 = neel.nextInt();

		double avg1 = avg(num1, num2, num3);

		System.out.println("The average value is " + avg1);


	}

	public static double avg(int num1, int num2, int num3){

		double avg = ((num1 + num2 + num3) / 3.0);
		return avg;

	}
}