import java.util.Scanner;

public class IfElsePractice2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num1 = neel.nextInt();
		System.out.print("Please enter another number: ");
		int num2 = neel.nextInt();
		System.out.println();

		System.out.println(Parity(num1, num2));

	}

	public static String Parity(int a, int b){

		String par;

		if(a > b)
			par = (a + " is larger than " + b + ".");
		else if(b > a)
			par = (b + " is larger than " + a + ".");
		else
			par = (a + " is equal to " + b + ".");

		return par;

	}
}