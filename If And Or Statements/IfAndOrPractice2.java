import java.util.Scanner;

public class IfAndOrPractice2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = neel.nextInt();

		calc(num);

	}

	public static void calc(int a){

		if((a % 2 == 0) && (a % 11 == 0))
			System.out.println("The number " + a + " is both even and divisible by 11");
		else if((a % 2 == 0) || (a % 11 == 0))
			System.out.println("The number " + a + " is either even or divisible by 11");
		else
			System.out.println("The number " + a + " is neither even nor divisible by 11");

	}

}