import java.util.Scanner;

public class IfElsePractice3{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		double num = neel.nextDouble();

		neel.nextLine();

		System.out.print("Would you like to (a)dd 2, (s)ubtract 2, (m)ultiply by 2, (d)ivide by 2, or (r)aise to the 2nd power: ");
		String choice = neel.nextLine();

		System.out.println();

		System.out.println(Parity(num, choice));

	}

	public static String Parity(double a, String b){

		String par;

		if(b.equals("a"))
			par = ("The result when adding " + a + " to 2 is " + (a + 2) + ".");
		else if(b.equals("s"))
			par = ("The result when subtracting 2 from " + a + " is " + (a - 2) + ".");
		else if(b.equals("m"))
			par = ("The result when multiplying " + a + " by 2 is " + (a * 2) + ".");
		else if(b.equals("d"))
			par = ("The result when dividing " + a + " by 2 is " + (a / 2) + ".");
		else
			par = ("The result when raising " + a + " to the 2nd power is " + (a * a) + ".");

		return par;
	}

}