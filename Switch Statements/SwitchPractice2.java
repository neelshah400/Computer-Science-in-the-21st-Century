import java.util.Scanner;

public class SwitchPractice2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter number 1: ");
		double num1 = neel.nextDouble();
		System.out.print("Please enter number 2: ");
		double num2 = neel.nextDouble();
		System.out.print("Please enter number 3: ");
		double num3 = neel.nextDouble();

		neel.nextLine();
		System.out.println();

		System.out.print("Would you like to find the (s)um, (a)verage, (p)roduct, or (d)ifference? ");
		String choice = neel.nextLine();

		System.out.println();

		switch(choice){

			case "s": System.out.println("The sum of the numbers is " + (num1 + num2 + num3) + ".");
				break;
			case "a": System.out.println("The average of the numbers is " + ((num1 + num2 + num3) / 3) + ".");
				break;
			case "p":
				System.out.print("The product of the largest and smallest number is ");
				if((num1 < num2) && (num1 < num3) && (num2 > num3))
					System.out.print(num1 * num2);
				else if((num2 < num1) && (num2 < num3) && (num3 > num1))
					System.out.print(num2 * num3);
				else if((num1 < num2) && (num1 < num3) && (num3 > num2))
					System.out.print(num1 * num3);
				else
					System.out.print("!ERRROR!");
				System.out.println(".");
				break;
			case "d":
				System.out.print("The difference between the largest and smallest number is ");
				if((num1 < num2) && (num1 < num3) && (num2 > num3))
					System.out.print(num2 - num1);
				else if((num2 < num1) && (num2 < num3) && (num3 > num1))
					System.out.print(num3 - num2);
				else if((num1 < num2) && (num1 < num3) && (num3 > num2))
					System.out.print(num3 - num1);
				else
					System.out.print("!ERRROR!");
				System.out.println(".");
				break;
		}

		System.out.println();

	}
}