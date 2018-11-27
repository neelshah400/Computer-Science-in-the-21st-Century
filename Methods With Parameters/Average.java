import java.util.Scanner;

public class Average{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Enter a value for integer 1: ");
		int int1 = neel.nextInt();

		System.out.print("Enter a value for integer 2: ");
		int int2 = neel.nextInt();

		System.out.print("Enter a value for integer 3: ");
		int int3 = neel.nextInt();

		System.out.print("Enter a value for integer 4: ");
		int int4 = neel.nextInt();

		System.out.print("Enter a value for double 1: ");
		double double1 = neel.nextDouble();

		double newint = ((double)int1);

		System.out.println();

		int return1 = numSum1(int1, int2);
		int return2 = numSum2(int1, int2, int3);
		int return3 = numSum3(int1, int2, int3, int4);
		double return4 = numQuot(newint, double1);

		System.out.println("Sum 1: " + return1);
		System.out.println("Sum 2: " + return2);
		System.out.println("Sum 3: " + return3);
		System.out.println("Quotient: " + return4);
		System.out.println();
		System.out.println("Average of return values: " + (((double)return1 + (double)return2 + (double)return3 + (double)return4) / 4.0));
		System.out.println();

	}

	public static int numSum1(int int1, int int2){

		int numSum1 = (int1 + int2);
		return numSum1;

	}

	public static int numSum2(int int1, int int2, int int3){

		int numSum2 = (int1 + int2 + int3);
		return numSum2;

	}

	public static int numSum3(int int1, int int2, int int3, int int4){

		int numSum3 = (int1 + int2 + int3 + int4);
		return numSum3;

	}

	public static double numQuot(double newint, double double1){

		double numQuot = (newint / double1);
		return numQuot;

	}

}