import java.util.Scanner;

public class IfElseReview2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = neel.nextInt();

		System.out.println();

		test(num);

		System.out.println();

	}

	public static void test(int a){

		if(a % 2 == 0)
			System.out.println(a + " is divisible by 2.");
		else
			System.out.println(a + " is not divisible by 2.");
		if(a % 3 == 0)
			System.out.println(a + " is divisible by 3.");
		else
			System.out.println(a + " is not divisible by 3.");
		if(a % 5 == 0)
			System.out.println(a + " is divisible by 5.");
		else
			System.out.println(a + " is not divisible by 5.");
		if(a % 7 == 0)
			System.out.println(a + " is divisible by 7.");
		else
			System.out.println(a + " is not divisible by 7.");
		if(a % 11 == 0)
			System.out.println(a + " is divisible by 11.");
		else
			System.out.println(a + " is not divisible by 11.");

	}

}
