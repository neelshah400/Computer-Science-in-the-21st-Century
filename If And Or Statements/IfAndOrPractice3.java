import java.util.Scanner;

public class IfAndOrPractice3{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = neel.nextInt();

		calc(num);

	}

	public static void calc(int a){

		if(((a >= 1000) && (a <= 9999)) && (a % 2 == 0) && (a % 11 == 0))
			System.out.println("The number " + a + " is both even and divisible by 11");
		else if(((a >= 1000) && (a <= 9999)) && (a % 2 == 0) || (a % 11 == 0))
			System.out.println("The number " + a + " is either even or divisible by 11");
		else if((a < 1000) || (a > 9999))
			System.out.println("The number " + a + " is not 4 digits.");
		else
			System.out.println("The number " + a + " is neither even nor divisible by 11");

	}

}