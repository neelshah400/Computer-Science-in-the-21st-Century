import java.util.Scanner;

public class SwitchRandomOutput{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("a. 0 to 10 inlusive");
		System.out.println("b. 1 to 5 inlusive");
		System.out.println("c. 10 to 80 inlusive");
		System.out.println("d. -10 to 15 inlusive");
		System.out.println();
		System.out.print("Select one of the above menu options: ");
		String choice = neel.nextLine();
		System.out.println();

		int a = (int)(Math.random()*11)+0;
		int b = (int)(Math.random()*5)+1;
		int c = (int)(Math.random()*71)+10;
		int d = (int)(Math.random()*26)-10;

		switch(choice){

			case "a":
				System.out.println(a + "\n");
				if((a > 4) && (a != 8) && (a % 2 == 0) && (a % 10 != 6))
					System.out.println("A DID IT!");
				else
					System.out.println("A DIDN'T!");
				break;
			case "b":
				System.out.println(b + "\n");
				if((b % 2 == 1) && (a < 4))
					System.out.println("B CRAZY!");
				else
					System.out.println("B NOT SO CRAZY!");
				break;
			case "c":
				System.out.println(c + "\n");
				if(((c / 10) % 2 == 0) && (c % 2 == 1) && (c % 3 == 0))
					System.out.println("C YA!");
				else
					System.out.println("NO C YA!");
				break;
			case "d":
				System.out.println(d + "\n");
				if(((d >= -7) || (d <= 7)) && ((d * d) % 2 == 0))
					System.out.println("D-RIFIC!");
				else
					System.out.println("D-ERRIBLKE!");
				break;
			default: System.out.println("!ERROR!");

		}

		System.out.println();

	}
}