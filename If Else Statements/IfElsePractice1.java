import java.util.Scanner;

public class IfElsePractice1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = neel.nextInt();

		System.out.println(num + Parity(num));

	}

	public static String Parity(int a){

		String par;

		if(a % 2 == 0)
			par = " is an even number.";
		else
			par = " is an odd number.";

		return par;

	}

}