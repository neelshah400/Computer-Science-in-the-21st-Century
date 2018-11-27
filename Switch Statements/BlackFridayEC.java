import java.util.Scanner;

public class BlackFridayEC{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("Department\tCode\tDiscount");
		System.out.println("--------------------------------");
		System.out.println("Audio\t\t310\t10%");
		System.out.println("Video\t\t438\t12%");
		System.out.println("Communications\t652\t15%");
		System.out.println("Other\t\tn/a\t5%");

		System.out.println();

		System.out.print("Please enter the regular price of the item: ");
		double RegPrice = neel.nextDouble();

		System.out.print("Please enter the department code: ");
		int DepCode = neel.nextInt();

		System.out.println();

		System.out.println("The regular price is $" + RegPrice + ".");
		System.out.print("The sale price is $");

		switch(DepCode){

			case 310: System.out.print(RegPrice * 0.90);
				break;
			case 438: System.out.print(RegPrice * 0.88);
				break;
			case 652: System.out.print(RegPrice * 0.85);
				break;
			default: System.out.print(RegPrice * 0.95);
				break;

		}

		System.out.println(".");

		System.out.println();

	}
}