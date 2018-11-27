import java.util.Scanner;

public class NestedIfPractice3{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter a year: ");
		int year = neel.nextInt();

		System.out.println();

		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					System.out.println(year + " was a leap year.");
				}
				else{
					System.out.println(year + " was not a leap year.");
				}
			}
			else{
				System.out.println(year + " was a leap year.");
			}
		}
		else{
			System.out.println(year + " was not a leap year.");
		}

		System.out.println();

	}
}
