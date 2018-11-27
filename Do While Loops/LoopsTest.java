import java.util.Scanner;

public class LoopsTest{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		int odd = 0;
		int even = 0;
		int highest = 0;
		int total = 0;
		int counter = 0;
		int val = 0;
		String redo = "y";

		while((redo.equals("y"))||(redo.equals("Y"))){
			counter++;
			System.out.print("Enter a value: ");
			val = neel.nextInt();
			total += val;
			if(val % 2 == 1)
				odd++;
			else
				even++;
			if(val > highest)
				highest = val;
			neel.nextLine();
			System.out.print("Would you like to enter another value(y/n)?: ");
			redo = neel.nextLine();
		}

		System.out.println();
		System.out.print("You entered " + odd + " odd number");
		System.out.print(odd > 1 ? "s" : "");
		System.out.print(" and " + even + " even number");
		System.out.print(even > 1 ? "s" : "");
		System.out.print(". ");
		System.out.println("The average of the values is " + ((double)total / (double)counter) + ".");

		if(counter >= 4)
			System.out.println("The highest value entered was " + highest + ".");
		System.out.println();

	}
}